/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupscraper;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Scraper {
    private String stockSymbol ; 
    private ArrayList<YahooOptions> scrapedOptions ; 
    
    @SuppressWarnings("empty-statement")
    public ArrayList<YahooOptions> parseDataToYahooOptions (ArrayList<String> dataFromYahooFinance)  {
        ArrayList<YahooOptions> optionsList = new ArrayList<>() ; 
        String delims = "[*]";
        String[] splittedData;
        String date = null; 
        BigDecimal change  ; 
        BigDecimal changePerCente  ; 
        for (String a:dataFromYahooFinance ){
        splittedData = a.split(delims);
        
            date = splittedData[2]+" "+splittedData[3]+" "+splittedData[4] ; 
            if (splittedData[9].equals("-") ){
                change = null ; 
            }else{
                change = new BigDecimal(splittedData[9]); 
            }
            if (splittedData[10].equals("-") ){
                changePerCente = null ; 
            }else{
                changePerCente = new BigDecimal(splittedData[10]);
            }
               
           
            YahooOptions yo = new YahooOptions(
                    splittedData[1],
                    date,
                    new BigDecimal(splittedData[5]),
                    new BigDecimal(splittedData[6]),
                    new BigDecimal(splittedData[7]),
                    new BigDecimal(splittedData[8]),
                    change,
                    changePerCente,
                    new BigDecimal(splittedData[11]),
                    new BigDecimal(splittedData[12]),
                    new BigDecimal(splittedData[13]),
                    splittedData[0]
            );
            optionsList.add(yo);
            
         
           
        }
        
        
     return optionsList ;   
    }
    
    public ArrayList<String> getDataFromYahooFinance ( ) {
         ArrayList<String> scrapedData = new ArrayList<>(); 
         String option1 ; 
         String option2 ; 
         String type ="" ;
          try {
            
            Document document = Jsoup.connect("https://finance.yahoo.com/quote/"+this.stockSymbol+"/options?p="+this.stockSymbol).userAgent("Chrome/41.0.2228.0").get(); 
            Elements  temp = document.select("tr");
             
            int i = 0 ; 
            for (Element e:temp ){
                
                if ((e.getElementsByTag("td").text().equals("")) &&( i == 0) ){
                   type = "CALL"; i++ ; 
                }else if (e.getElementsByTag("td").text().equals("") && i == 1 ){
                   type = "PUT";  
                }
                    
                    option1 = type+"*"+e.getElementsByTag("td").text() ; 
                    option2 = option1.replace(" ","*");
                String replaceAll = option2.replaceAll("%","");
                String finaly = replaceAll.replaceAll(",","");
                   if (option2.length()>5){
                       scrapedData.add(finaly); 
                   }
                    
            }
            int cOverp = 0 ; 
          
        } catch (IOException ex) {
            Logger.getLogger(JsoupScraper.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return scrapedData ;
    }
    
    public Scraper(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
    
    
}
