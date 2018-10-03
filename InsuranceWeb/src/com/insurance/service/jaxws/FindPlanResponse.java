
package com.insurance.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPlanResponse", namespace = "http://service.insurance.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPlanResponse", namespace = "http://service.insurance.com/")
public class FindPlanResponse {

    @XmlElement(name = "return", namespace = "")
    private com.insurance.service.EnrollmentInfo _return;

    /**
     * 
     * @return
     *     returns EnrollmentInfo
     */
    public com.insurance.service.EnrollmentInfo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.insurance.service.EnrollmentInfo _return) {
        this._return = _return;
    }

}
