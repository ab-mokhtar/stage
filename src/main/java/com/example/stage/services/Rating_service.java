package com.example.stage.services;

import com.example.stage.entities.Rating_entity;
import com.example.stage.repos.Rating_repo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class Rating_service {
    private Rating_repo rating_repo;

    public Rating_service(Rating_repo rating_repo) {
        this.rating_repo = rating_repo;
    }

    public List<Rating_entity> selectAll() {
        return (List<Rating_entity>)rating_repo.findAll();
    }

    public Rating_entity insertIntoDB(Rating_entity rating_entity){


        return rating_repo.save(rating_entity);

    }
}
