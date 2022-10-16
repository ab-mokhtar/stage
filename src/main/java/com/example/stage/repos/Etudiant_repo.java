package com.example.stage.repos;

import com.example.stage.entities.Etudiant_entity;
import org.springframework.data.repository.CrudRepository;

public interface Etudiant_repo extends CrudRepository<Etudiant_entity,Integer> {
}
