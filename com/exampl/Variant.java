
package com.exampl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDorayaki" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namaDorayaki" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deskripsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variant", propOrder = {
    "idDorayaki",
    "namaDorayaki",
    "deskripsi"
})
public class Variant {

    protected int idDorayaki;
    @XmlElement(required = true)
    protected String namaDorayaki;
    @XmlElement(required = true)
    protected String deskripsi;

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
     * Gets the value of the deskripsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * Sets the value of the deskripsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskripsi(String value) {
        this.deskripsi = value;
    }

}
