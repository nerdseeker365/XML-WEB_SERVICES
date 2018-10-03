
package com.insurance.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enrollmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enrollmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="benefitAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="enrollmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="planEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planStartDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enrollmentInfo", propOrder = {
    "benefitAmt",
    "enrollmentId",
    "planEndDt",
    "planName",
    "planStartDt",
    "planStatus"
})
public class EnrollmentInfo {

    protected Double benefitAmt;
    protected Integer enrollmentId;
    protected String planEndDt;
    protected String planName;
    protected String planStartDt;
    protected String planStatus;

    /**
     * Gets the value of the benefitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBenefitAmt() {
        return benefitAmt;
    }

    /**
     * Sets the value of the benefitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBenefitAmt(Double value) {
        this.benefitAmt = value;
    }

    /**
     * Gets the value of the enrollmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * Sets the value of the enrollmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnrollmentId(Integer value) {
        this.enrollmentId = value;
    }

    /**
     * Gets the value of the planEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanEndDt() {
        return planEndDt;
    }

    /**
     * Sets the value of the planEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanEndDt(String value) {
        this.planEndDt = value;
    }

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the planStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStartDt() {
        return planStartDt;
    }

    /**
     * Sets the value of the planStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStartDt(String value) {
        this.planStartDt = value;
    }

    /**
     * Gets the value of the planStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * Sets the value of the planStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatus(String value) {
        this.planStatus = value;
    }

}
