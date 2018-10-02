
package com.weather.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTemperatureReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTemperatureReturn"
})
@XmlRootElement(name = "getTemperatureResponse")
public class GetTemperatureResponse {

    protected double getTemperatureReturn;

    /**
     * Gets the value of the getTemperatureReturn property.
     * 
     */
    public double getGetTemperatureReturn() {
        return getTemperatureReturn;
    }

    /**
     * Sets the value of the getTemperatureReturn property.
     * 
     */
    public void setGetTemperatureReturn(double value) {
        this.getTemperatureReturn = value;
    }

}
