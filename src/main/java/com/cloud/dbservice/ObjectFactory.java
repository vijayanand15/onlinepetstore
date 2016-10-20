
package com.cloud.dbservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cloud.dbservice package. 
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

    private final static QName _GetEntityManager_QNAME = new QName("http://data.cloud.com/", "getEntityManager");
    private final static QName _GetEntityManagerResponse_QNAME = new QName("http://data.cloud.com/", "getEntityManagerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cloud.dbservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEntityManager }
     * 
     */
    public GetEntityManager createGetEntityManager() {
        return new GetEntityManager();
    }

    /**
     * Create an instance of {@link GetEntityManagerResponse }
     * 
     */
    public GetEntityManagerResponse createGetEntityManagerResponse() {
        return new GetEntityManagerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.cloud.com/", name = "getEntityManager")
    public JAXBElement<GetEntityManager> createGetEntityManager(GetEntityManager value) {
        return new JAXBElement<GetEntityManager>(_GetEntityManager_QNAME, GetEntityManager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.cloud.com/", name = "getEntityManagerResponse")
    public JAXBElement<GetEntityManagerResponse> createGetEntityManagerResponse(GetEntityManagerResponse value) {
        return new JAXBElement<GetEntityManagerResponse>(_GetEntityManagerResponse_QNAME, GetEntityManagerResponse.class, null, value);
    }

}
