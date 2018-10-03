
package com.insurance.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPlan", namespace = "http://service.insurance.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPlan", namespace = "http://service.insurance.com/")
public class FindPlan {

    @XmlElement(name = "arg0", namespace = "")
    private com.insurance.service.PersonInfo arg0;

    /**
     * 
     * @return
     *     returns PersonInfo
     */
    public com.insurance.service.PersonInfo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.insurance.service.PersonInfo arg0) {
        this.arg0 = arg0;
    }

}
