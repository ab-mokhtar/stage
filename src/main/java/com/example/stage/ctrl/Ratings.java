package com.example.stage.ctrl;

import com.example.stage.entities.Etudiant_entity;
import com.example.stage.entities.Rating_entity;
import com.example.stage.services.Etudiant_service;
import com.example.stage.services.Rating_service;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Ratings {
    Rating_service rating_service;

    public Ratings(Rating_service rating_service) {
        this.rating_service = rating_service;
    }

    @PostMapping("/rating/save")
    @ResponseBody
    public Rating_entity addrating(@RequestBody Rating_entity rating_entity){
        return rating_service.insertIntoDB(rating_entity);
    }
    @GetMapping("/ratings/all")
    @ResponseBody
    public List<Rating_entity> getAll(){
        return rating_service.selectAll();
    }
}
