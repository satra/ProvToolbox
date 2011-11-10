//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.10 at 10:15:17 AM GMT 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * Observed Time allow for interval of observation, where an event is said to occur no earlier than a given time t1 and no later than a given time t2. When the event is observed to occur at a specific time, it is not convenient to use an interval. Instead, one can use the alternate exactlyAt attribute. We note that exactlyAt is disjoint from noEarlierThan and noLaterThan.
 * 
 * <p>Java class for OTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="noEarlierThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="noLaterThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="exactlyAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTime", namespace = "http://openprovenance.org/prov-xml#")
public class OTime
    implements Equals, HashCode, ToString
{

    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar noEarlierThan;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar noLaterThan;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exactlyAt;

    /**
     * Gets the value of the noEarlierThan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoEarlierThan() {
        return noEarlierThan;
    }

    /**
     * Sets the value of the noEarlierThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoEarlierThan(XMLGregorianCalendar value) {
        this.noEarlierThan = value;
    }

    /**
     * Gets the value of the noLaterThan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoLaterThan() {
        return noLaterThan;
    }

    /**
     * Sets the value of the noLaterThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoLaterThan(XMLGregorianCalendar value) {
        this.noLaterThan = value;
    }

    /**
     * Gets the value of the exactlyAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExactlyAt() {
        return exactlyAt;
    }

    /**
     * Sets the value of the exactlyAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExactlyAt(XMLGregorianCalendar value) {
        this.exactlyAt = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof OTime)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final OTime that = ((OTime) object);
        equalsBuilder.append(this.getNoEarlierThan(), that.getNoEarlierThan());
        equalsBuilder.append(this.getNoLaterThan(), that.getNoLaterThan());
        equalsBuilder.append(this.getExactlyAt(), that.getExactlyAt());
    }

    public boolean equals(Object object) {
        if (!(object instanceof OTime)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getNoEarlierThan());
        hashCodeBuilder.append(this.getNoLaterThan());
        hashCodeBuilder.append(this.getExactlyAt());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            XMLGregorianCalendar theNoEarlierThan;
            theNoEarlierThan = this.getNoEarlierThan();
            toStringBuilder.append("noEarlierThan", theNoEarlierThan);
        }
        {
            XMLGregorianCalendar theNoLaterThan;
            theNoLaterThan = this.getNoLaterThan();
            toStringBuilder.append("noLaterThan", theNoLaterThan);
        }
        {
            XMLGregorianCalendar theExactlyAt;
            theExactlyAt = this.getExactlyAt();
            toStringBuilder.append("exactlyAt", theExactlyAt);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}