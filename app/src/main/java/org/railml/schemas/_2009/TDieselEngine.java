//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				technical data of diesel engine
 * 			
 * 
 * <p>Java class for tDieselEngine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDieselEngine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aAssemblyNameNumber"/>
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aDieselEngine"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDieselEngine")
public class TDieselEngine {

    @XmlAttribute(name = "count", required = true)
    protected BigInteger count;
    @XmlAttribute(name = "assemblyName", required = true)
    protected String assemblyName;
    @XmlAttribute(name = "nominalPower")
    protected BigDecimal nominalPower;
    @XmlAttribute(name = "fuelCapacity")
    protected BigDecimal fuelCapacity;
    @XmlAttribute(name = "meanEfficiency")
    protected BigDecimal meanEfficiency;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the assemblyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyName() {
        return assemblyName;
    }

    /**
     * Sets the value of the assemblyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyName(String value) {
        this.assemblyName = value;
    }

    /**
     * Gets the value of the nominalPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNominalPower() {
        return nominalPower;
    }

    /**
     * Sets the value of the nominalPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNominalPower(BigDecimal value) {
        this.nominalPower = value;
    }

    /**
     * Gets the value of the fuelCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Sets the value of the fuelCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelCapacity(BigDecimal value) {
        this.fuelCapacity = value;
    }

    /**
     * Gets the value of the meanEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeanEfficiency() {
        return meanEfficiency;
    }

    /**
     * Sets the value of the meanEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeanEfficiency(BigDecimal value) {
        this.meanEfficiency = value;
    }

}