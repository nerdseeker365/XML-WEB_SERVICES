//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.09 at 12:11:55 PM IST 
//


package com.irctc.res.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trainNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookedAt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="Ticket")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "ticketNum",
    "pnr",
    "passengerName",
    "from",
    "to",
    "doj",
    "trainNum",
    "bookedAt",
    "status"
})
public class TicketType {

    protected int ticketNum;
    protected int pnr;
    @XmlElement(required = true)
    protected String passengerName;
    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String doj;
    protected int trainNum;
    @XmlElement(required = true)
    protected String bookedAt;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the ticketNum property.
     * 
     */
    public int getTicketNum() {
        return ticketNum;
    }

    /**
     * Sets the value of the ticketNum property.
     * 
     */
    public void setTicketNum(int value) {
        this.ticketNum = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     */
    public int getPnr() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     */
    public void setPnr(int value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the doj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoj() {
        return doj;
    }

    /**
     * Sets the value of the doj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoj(String value) {
        this.doj = value;
    }

    /**
     * Gets the value of the trainNum property.
     * 
     */
    public int getTrainNum() {
        return trainNum;
    }

    /**
     * Sets the value of the trainNum property.
     * 
     */
    public void setTrainNum(int value) {
        this.trainNum = value;
    }

    /**
     * Gets the value of the bookedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedAt() {
        return bookedAt;
    }

    /**
     * Sets the value of the bookedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedAt(String value) {
        this.bookedAt = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
