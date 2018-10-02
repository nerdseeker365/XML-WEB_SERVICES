
package com.atm.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "withdrawResponse", namespace = "http://service.atm.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "withdrawResponse", namespace = "http://service.atm.com/")
public class WithdrawResponse {

    @XmlElement(name = "return", namespace = "")
    private com.atm.dto.InvoiceInfo _return;

    /**
     * 
     * @return
     *     returns InvoiceInfo
     */
    public com.atm.dto.InvoiceInfo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.atm.dto.InvoiceInfo _return) {
        this._return = _return;
    }

}
