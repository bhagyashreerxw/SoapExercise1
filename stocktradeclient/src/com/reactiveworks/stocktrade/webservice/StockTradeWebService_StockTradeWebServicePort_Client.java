
package com.reactiveworks.stocktrade.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-03-23T17:38:21.279-07:00
 * Generated source version: 3.2.1
 * 
 */
public final class StockTradeWebService_StockTradeWebServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://webservice.stocktrade.reactiveworks.com/", "StockTradeWebServiceService");

    private StockTradeWebService_StockTradeWebServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = StockTradeWebServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        StockTradeWebServiceService ss = new StockTradeWebServiceService(wsdlURL, SERVICE_NAME);
        StockTradeWebService port = ss.getStockTradeWebServicePort();  
        
        {
        System.out.println("Invoking getDailyTradingDifferential...");
        java.util.List<com.reactiveworks.stocktrade.webservice.StockTrade> _getDailyTradingDifferential_arg0 = new java.util.ArrayList<com.reactiveworks.stocktrade.webservice.StockTrade>();
        com.reactiveworks.stocktrade.webservice.StockTrade _getDailyTradingDifferential_arg0Val1 = new com.reactiveworks.stocktrade.webservice.StockTrade();
        _getDailyTradingDifferential_arg0Val1.setAdjClose(Double.valueOf(0.3773180571367677));
        _getDailyTradingDifferential_arg0Val1.setClose(Double.valueOf(0.9583679313725336));
        _getDailyTradingDifferential_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-23T17:38:21.319-07:00"));
        _getDailyTradingDifferential_arg0Val1.setHigh(Double.valueOf(0.2164777640923512));
        _getDailyTradingDifferential_arg0Val1.setLow(Double.valueOf(0.6318874909166086));
        _getDailyTradingDifferential_arg0Val1.setOpen(Double.valueOf(0.6535639316539066));
        _getDailyTradingDifferential_arg0Val1.setSecurity("Security16797612");
        _getDailyTradingDifferential_arg0Val1.setVolume(Double.valueOf(0.04665086721706402));
        _getDailyTradingDifferential_arg0.add(_getDailyTradingDifferential_arg0Val1);
        com.reactiveworks.stocktrade.webservice.DailyTradingDiffWrapper _getDailyTradingDifferential__return = port.getDailyTradingDifferential(_getDailyTradingDifferential_arg0);
        System.out.println("getDailyTradingDifferential.result=" + _getDailyTradingDifferential__return);


        }
        {
        System.out.println("Invoking getMaxVolumeTrade...");
        java.util.List<com.reactiveworks.stocktrade.webservice.StockTrade> _getMaxVolumeTrade_arg0 = new java.util.ArrayList<com.reactiveworks.stocktrade.webservice.StockTrade>();
        com.reactiveworks.stocktrade.webservice.StockTrade _getMaxVolumeTrade_arg0Val1 = new com.reactiveworks.stocktrade.webservice.StockTrade();
        _getMaxVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.6185120758625587));
        _getMaxVolumeTrade_arg0Val1.setClose(Double.valueOf(0.5754315529270007));
        _getMaxVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-23T17:38:21.324-07:00"));
        _getMaxVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.7857167344560605));
        _getMaxVolumeTrade_arg0Val1.setLow(Double.valueOf(0.18552390131581975));
        _getMaxVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.7661465570938412));
        _getMaxVolumeTrade_arg0Val1.setSecurity("Security2073272205");
        _getMaxVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.4620517773177034));
        _getMaxVolumeTrade_arg0.add(_getMaxVolumeTrade_arg0Val1);
        com.reactiveworks.stocktrade.webservice.StockTrade _getMaxVolumeTrade__return = port.getMaxVolumeTrade(_getMaxVolumeTrade_arg0);
        System.out.println("getMaxVolumeTrade.result=" + _getMaxVolumeTrade__return);


        }
        {
        System.out.println("Invoking getStockTrades...");
        try {
            java.util.List<com.reactiveworks.stocktrade.webservice.StockTrade> _getStockTrades__return = port.getStockTrades();
            System.out.println("getStockTrades.result=" + _getStockTrades__return);

        } catch (StockTradeServiceFailureException_Exception e) { 
            System.out.println("Expected exception: StockTradeServiceFailureException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMinVolumeTrade...");
        java.util.List<com.reactiveworks.stocktrade.webservice.StockTrade> _getMinVolumeTrade_arg0 = new java.util.ArrayList<com.reactiveworks.stocktrade.webservice.StockTrade>();
        com.reactiveworks.stocktrade.webservice.StockTrade _getMinVolumeTrade_arg0Val1 = new com.reactiveworks.stocktrade.webservice.StockTrade();
        _getMinVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.31708475730251073));
        _getMinVolumeTrade_arg0Val1.setClose(Double.valueOf(0.6612943752422354));
        _getMinVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2020-03-23T17:38:21.326-07:00"));
        _getMinVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.3128286154939135));
        _getMinVolumeTrade_arg0Val1.setLow(Double.valueOf(0.7364397767558557));
        _getMinVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.905286844106159));
        _getMinVolumeTrade_arg0Val1.setSecurity("Security-2004887720");
        _getMinVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.8201784368401441));
        _getMinVolumeTrade_arg0.add(_getMinVolumeTrade_arg0Val1);
        com.reactiveworks.stocktrade.webservice.StockTrade _getMinVolumeTrade__return = port.getMinVolumeTrade(_getMinVolumeTrade_arg0);
        System.out.println("getMinVolumeTrade.result=" + _getMinVolumeTrade__return);


        }

        System.exit(0);
    }

}
