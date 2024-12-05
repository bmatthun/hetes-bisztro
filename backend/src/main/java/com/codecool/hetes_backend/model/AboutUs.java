package com.codecool.hetes_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class AboutUs {

    @Id
    @Getter
    @Setter
    @GeneratedValue
    private long id;
    private int part;
    private String text;

    public AboutUs(int part, String text) {
        this.part = part;
        this.text = text;
    }

}
