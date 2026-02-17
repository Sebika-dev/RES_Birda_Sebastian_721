package org.example.model;
import java.io.Serializable;

// DRY principle - Don't Repeat Yourself - generics for reusability of code and to avoid redundancy

public class Entity<ID> implements Serializable {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
