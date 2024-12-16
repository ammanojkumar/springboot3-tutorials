package io.mk.h2.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mk.h2.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
