
package com.reactiveworks.stocktrade.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.1
 * Mon Mar 23 12:06:39 PDT 2020
 * Generated source version: 3.2.1
 */

@XmlRootElement(name = "StockTradeServiceFailureException", namespace = "http://exceptions.service.stocktrade.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTradeServiceFailureException", namespace = "http://exceptions.service.stocktrade.reactiveworks.com/")

public class StockTradeServiceFailureExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}

