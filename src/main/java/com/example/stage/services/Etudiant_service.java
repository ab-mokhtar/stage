package com.example.stage.services;

import com.example.stage.entities.Etudiant_entity;
import com.example.stage.repos.Etudiant_repo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class Etudiant_service {
    private Etudiant_repo etudiant_repo;

    public Etudiant_service(Etudiant_repo etudiant_repo) {
        this.etudiant_repo = etudiant_repo;
    }
    public List<Etudiant_entity> selectAll() {
        return (List<Etudiant_entity>)etudiant_repo.findAll();
    }

    public Etudiant_entity insertIntoDB(Etudiant_entity etudiant_entity){


            return etudiant_repo.save(etudiant_entity);

    }
}
