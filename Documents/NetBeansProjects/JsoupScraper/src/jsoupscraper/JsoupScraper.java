/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupscraper;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Amin Jellali
 */
public class JsoupScraper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scraper s = new Scraper("AMZN"); 
        ArrayList<YahooOptions> li = new ArrayList<>() ; 
        li = s.parseDataToYahooOptions(s.getDataFromYahooFinance()) ;
        for (YahooOptions yo: li ){
            System.out.println(yo.toString()); 
        }
    }
}
