package com.gmul.hackingspringboot.reactive.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@EqualsAndHashCode
public class Item {
    
    private @Id String id;
    private String name;
    private double price;

    private Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
