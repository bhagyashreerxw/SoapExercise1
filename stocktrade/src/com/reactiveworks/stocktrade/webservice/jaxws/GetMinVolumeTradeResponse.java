
package com.reactiveworks.stocktrade.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.1
 * Mon Mar 23 11:11:24 PDT 2020
 * Generated source version: 3.2.1
 */

@XmlRootElement(name = "getMinVolumeTradeResponse", namespace = "http://webservice.stocktrade.reactiveworks.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMinVolumeTradeResponse", namespace = "http://webservice.stocktrade.reactiveworks.com/")

public class GetMinVolumeTradeResponse {

    @XmlElement(name = "return")
    private com.reactiveworks.stocktrade.model.StockTrade _return;

    public com.reactiveworks.stocktrade.model.StockTrade getReturn() {
        return this._return;
    }

    public void setReturn(com.reactiveworks.stocktrade.model.StockTrade new_return)  {
        this._return = new_return;
    }

}

