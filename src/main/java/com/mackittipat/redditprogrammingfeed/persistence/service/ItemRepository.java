package com.mackittipat.redditprogrammingfeed.persistence.service;

import com.mackittipat.redditprogrammingfeed.persistence.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
