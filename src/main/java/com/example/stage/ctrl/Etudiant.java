package com.example.stage.ctrl;

import com.example.stage.entities.Etudiant_entity;
import com.example.stage.services.Etudiant_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Etudiant {
    Etudiant_service etudiant_service;

    public Etudiant(Etudiant_service etudiant_service) {
        this.etudiant_service = etudiant_service;
    }
    @PostMapping("/etudiant/save")
    @ResponseBody
    public Etudiant_entity addEtudiant(@RequestBody Etudiant_entity etudiant_entity){
        return etudiant_service.insertIntoDB(etudiant_entity);
}
     @GetMapping("/etudiants/all")
    @ResponseBody
    public List<Etudiant_entity> getAll(){
        return etudiant_service.selectAll();
     }
}
