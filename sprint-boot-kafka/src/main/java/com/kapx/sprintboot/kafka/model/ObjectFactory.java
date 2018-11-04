package com.kapx.sprintboot.kafka.model;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kapx.sprintboot.kafka.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Message }
     */
    public Message createMessage() {
        return new Message();
    }

}
