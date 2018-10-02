
package com.atm.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "withdraw", namespace = "http://service.atm.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "withdraw", namespace = "http://service.atm.com/", propOrder = {
    "arg0",
    "arg1"
})
public class Withdraw {

    @XmlElement(name = "arg0", namespace = "")
    private com.atm.dto.AccountInfo arg0;
    @XmlElement(name = "arg1", namespace = "")
    private com.atm.dto.TransactionInfo arg1;

    /**
     * 
     * @return
     *     returns AccountInfo
     */
    public com.atm.dto.AccountInfo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.atm.dto.AccountInfo arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns TransactionInfo
     */
    public com.atm.dto.TransactionInfo getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(com.atm.dto.TransactionInfo arg1) {
        this.arg1 = arg1;
    }

}
