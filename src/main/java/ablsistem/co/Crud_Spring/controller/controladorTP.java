/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ablsistem.co.Crud_Spring.controller;

import ablsistem.co.Crud_Spring.interfaceService.isTipoPersona;
import ablsistem.co.Crud_Spring.model.mTipoPersona;
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
@Controller //controlador encargado de controlar HTTP entrantes y las respuestas
@RequestMapping //asignar solitudes web a controladores específicos
public class controladorTP {
    
    @Autowired//habilita la dependencia, tiene control de la clase
    private isTipoPersona service;
    
    @GetMapping("/listarTP")
    public String listarTP(Model model) {
        List<mTipoPersona> mTipoPersonas = service.listarTP();
        model.addAttribute("mTipoPersonas", mTipoPersonas);
        return "indexTP";
    }
    
    @GetMapping("/newTP")
    public String agregarTP(Model model) {
        model.addAttribute("mTipoPersona", new mTipoPersona());
        return "ingresarTP";
    }
    
    @PostMapping("/saveTP")
    public String saveTP(mTipoPersona mTP, Model model) {
        service.saveTP(mTP);
        return "redirect:/listarTP";
    }
        @GetMapping("/editarTP/{id}")
    public String editarTP(@PathVariable int id, Model model) {
        Optional<mTipoPersona> mTipoPersonas = service.listarIdTP(id);
        model.addAttribute("mTipoPersona", mTipoPersonas);
        return "ingresarTP";
    }
       
    @GetMapping("/eliminarTP/{id}")
    public String deleteTP(Model model, @PathVariable int id){
        service.deleteTP(id);
        return "redirect:/listarTP";
    }
    
}
    