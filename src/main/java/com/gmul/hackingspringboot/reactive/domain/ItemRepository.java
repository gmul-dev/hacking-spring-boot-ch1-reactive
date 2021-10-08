package com.gmul.hackingspringboot.reactive.domain;

import com.gmul.hackingspringboot.reactive.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
