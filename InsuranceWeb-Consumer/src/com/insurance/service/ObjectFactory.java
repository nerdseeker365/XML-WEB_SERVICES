
package com.insurance.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.insurance.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindPlan_QNAME = new QName("http://service.insurance.com/", "findPlan");
    private final static QName _FindPlanResponse_QNAME = new QName("http://service.insurance.com/", "findPlanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.insurance.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPlan }
     * 
     */
    public FindPlan createFindPlan() {
        return new FindPlan();
    }

    /**
     * Create an instance of {@link FindPlanResponse }
     * 
     */
    public FindPlanResponse createFindPlanResponse() {
        return new FindPlanResponse();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link EnrollmentInfo }
     * 
     */
    public EnrollmentInfo createEnrollmentInfo() {
        return new EnrollmentInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insurance.com/", name = "findPlan")
    public JAXBElement<FindPlan> createFindPlan(FindPlan value) {
        return new JAXBElement<FindPlan>(_FindPlan_QNAME, FindPlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.insurance.com/", name = "findPlanResponse")
    public JAXBElement<FindPlanResponse> createFindPlanResponse(FindPlanResponse value) {
        return new JAXBElement<FindPlanResponse>(_FindPlanResponse_QNAME, FindPlanResponse.class, null, value);
    }

}
