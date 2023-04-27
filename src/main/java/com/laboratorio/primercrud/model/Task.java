package com.laboratorio.primercrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.security.PrivateKey;

@Entity

public class Task {


    @Id
    private Long id;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
