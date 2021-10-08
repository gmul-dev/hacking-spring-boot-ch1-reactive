package com.gmul.hackingspringboot.reactive.model;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
public class CartItem {

    private Item item;
    private int quantity;

    private CartItem() {
    }

    public CartItem(Item item) {
        this.item = item;
        this.quantity = 1;
    }
}
