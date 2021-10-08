package com.gmul.hackingspringboot.reactive.domain;

import com.gmul.hackingspringboot.reactive.model.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
