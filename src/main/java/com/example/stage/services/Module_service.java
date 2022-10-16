package com.example.stage.services;

import com.example.stage.entities.Module_entity;
import com.example.stage.repos.Module_repo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class Module_service {
    private Module_repo module_repo;

    public Module_service(Module_repo module_repo) {
        this.module_repo = module_repo;
    }

    public List<Module_entity> selectAll() {
        return (List<Module_entity>)module_repo.findAll();
    }

    public Module_entity insertIntoDB(Module_entity module_entity){


        return module_repo.save(module_entity);

    }
}
