/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ablsistem.co.Crud_Spring.controller;

import ablsistem.co.Crud_Spring.interfaceService.isPersona;
import ablsistem.co.Crud_Spring.model.mPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
//Anotaciones
@Controller
@RequestMapping

public class controlador {
    @Autowired
    private isPersona service;
    
    @GetMapping("/listar")
        public String listar(Model model){
        List<mPersona>mPersonas = service.listar();
        model.addAttribute("mPersonas",mPersonas);
        return "indexP";
    }
    
    @GetMapping("/new")
    public String agregar(Model model){
        return "ingresar";
    }
    
    @PostMapping("/save")
    public String save(mPersona mP,Model model){
        service.save(mP);
        return "redirect:/listar";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<mPersona>mPersonas = service.listarId(id);
        model.addAttribute("mPersona",mPersonas);
        return "ingresar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
