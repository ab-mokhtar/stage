package com.example.stage.ctrl;

import com.example.stage.entities.Module_entity;
import com.example.stage.services.Module_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class Module {
    Module_service module_service;

    public Module(Module_service module_service) {
        this.module_service = module_service;
    }

    @PostMapping("/module/save")
    @ResponseBody
    public Module_entity addmodule(@RequestBody Module_entity module_entity){
        return module_service.insertIntoDB(module_entity);
    }
    @GetMapping("/modules/all")
    @ResponseBody
    public List<Module_entity> getAll(){
        return module_service.selectAll();
    }
}
