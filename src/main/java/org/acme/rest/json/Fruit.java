package org.acme.rest.json;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.UUID;

public class Fruit {

    public UUID id;
    public String name;
    public String description;

    public Fruit() {
        this.id = UUID.randomUUID();
    }

    public Fruit(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
