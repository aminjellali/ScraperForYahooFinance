/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoupscraper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.TimerTask;

/**
 *
 * @author Amin Jellali
 */
public class YahooOptions {
    private String contaractName ; 
    private String lastTradeDate ; 
    private BigDecimal strike ; 
    private BigDecimal lastPrice ; 
    private BigDecimal bid ; 
    private BigDecimal ask ; 
    private BigDecimal change ; 
    private BigDecimal perCentChange ; 
    private BigDecimal volume ; 
    private BigDecimal openInterest ; 
    private BigDecimal impliedVolatility ; 
    private String type ; 

    public BigDecimal getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(BigDecimal openInterest) {
        this.openInterest = openInterest;
    }

    public YahooOptions(String contaractName, String lastTradeDate, BigDecimal strike, BigDecimal lastPrice, BigDecimal bid, BigDecimal ask, BigDecimal change, BigDecimal perCentChange, BigDecimal volume, BigDecimal openInterest, BigDecimal impliedVolatility, String type) {
        this.contaractName = contaractName;
        this.lastTradeDate = lastTradeDate;
        this.strike = strike;
        this.lastPrice = lastPrice;
        this.bid = bid;
        this.ask = ask;
        this.change = change;
        this.perCentChange = perCentChange;
        this.volume = volume;
        this.openInterest = openInterest;
        this.impliedVolatility = impliedVolatility;
        this.type = type;
    }

  

    public String getContaractName() {
        return contaractName;
    }

    public void setContaractName(String contaractName) {
        this.contaractName = contaractName;
    }

    public String getLastTradeDate() {
        return lastTradeDate;
    }

    public void setLastTradeDate(String lastTradeDate) {
        this.lastTradeDate = lastTradeDate;
    }

    public BigDecimal getStrike() {
        return strike;
    }

    public void setStrike(BigDecimal strike) {
        this.strike = strike;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public BigDecimal getPerCentChange() {
        return perCentChange;
    }

    public void setPerCentChange(BigDecimal perCentChange) {
        this.perCentChange = perCentChange;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getImpliedVolatility() {
        return impliedVolatility;
    }

    public void setImpliedVolatility(BigDecimal impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "YahooOptions{" + "contaractName= " + contaractName + ", lastTradeDate= " + lastTradeDate + ", strike= " + strike + ", lastPrice= " + lastPrice + ", bid= " + bid + ", ask= " + ask + ", change= " + change + ", perCentChange= " + perCentChange + ", volume= " + volume + ", impliedVolatility= " + impliedVolatility + ", type= " + type + '}';
    }


    
    
}
