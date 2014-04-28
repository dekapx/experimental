
package test.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHello", namespace = "http://test/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://test/")
public class SayHello {

    @XmlElement(name = "arg", namespace = "")
    private String arg;

    /**
     * 
     * @return
     *     returns String
     */
    public String getArg() {
        return this.arg;
    }

    /**
     * 
     * @param arg
     *     the value for the arg property
     */
    public void setArg(String arg) {
        this.arg = arg;
    }

}
