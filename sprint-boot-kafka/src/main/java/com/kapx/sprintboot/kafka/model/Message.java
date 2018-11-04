package com.kapx.sprintboot.kafka.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "from",
        "to",
        "subject",
        "body"
})
@XmlRootElement(name = "message")
public class Message {

    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String body;

    /**
     * Gets the value of the from property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the subject property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the body property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBody(String value) {
        this.body = value;
    }

}
