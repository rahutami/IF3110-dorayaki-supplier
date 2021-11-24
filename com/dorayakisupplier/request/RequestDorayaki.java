
package com.dorayakisupplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="idDorayaki" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namaDorayaki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jumlah" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "idDorayaki",
    "namaDorayaki",
    "jumlah",
    "requestTime"
})
@XmlRootElement(name = "requestDorayaki")
public class RequestDorayaki {

    protected int idDorayaki;
    @XmlElement(required = true)
    protected String namaDorayaki;
    protected int jumlah;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTime;

    /**
     * Gets the value of the idDorayaki property.
     * 
     */
    public int getIdDorayaki() {
        return idDorayaki;
    }

    /**
     * Sets the value of the idDorayaki property.
     * 
     */
    public void setIdDorayaki(int value) {
        this.idDorayaki = value;
    }

    /**
     * Gets the value of the namaDorayaki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaDorayaki() {
        return namaDorayaki;
    }

    /**
     * Sets the value of the namaDorayaki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaDorayaki(String value) {
        this.namaDorayaki = value;
    }

    /**
     * Gets the value of the jumlah property.
     * 
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * Sets the value of the jumlah property.
     * 
     */
    public void setJumlah(int value) {
        this.jumlah = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

}
