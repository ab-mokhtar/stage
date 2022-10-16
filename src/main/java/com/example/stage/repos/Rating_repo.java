package com.example.stage.repos;

import com.example.stage.entities.Rating_entity;
import org.springframework.data.repository.CrudRepository;

public interface Rating_repo extends CrudRepository<Rating_entity,Integer> {
}
