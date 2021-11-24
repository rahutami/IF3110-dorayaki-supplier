
package com.dorayakisupplier.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusRequestList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusRequestList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listStatus" type="{http://topdown.server.jaxws.baeldung.com/}statusRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusRequestList", propOrder = {
    "listStatus"
})
public class StatusRequestList {

    @XmlElement(nillable = true)
    protected List<StatusRequest> listStatus;

    /**
     * Gets the value of the listStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusRequest }
     * 
     * 
     */
    public List<StatusRequest> getListStatus() {
        if (listStatus == null) {
            listStatus = new ArrayList<StatusRequest>();
        }
        return this.listStatus;
    }

}
