/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ablsistem.co.Crud_Spring.service;

import ablsistem.co.Crud_Spring.interfaceService.isPersona;
import ablsistem.co.Crud_Spring.model.mPersona;
import ablsistem.co.Crud_Spring.view.vPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class sPersona implements isPersona{
    
    @Autowired
    private vPersona vP;

    @Override
    public List<mPersona> listar() {
        return(List<mPersona>)vP.findAll();
    }

    @Override
    public Optional<mPersona> listarId(int id) {
        return vP.findById(id);
    }
//explicará estos últimos cuando ejecute el programa
    @Override
    public int save(mPersona mP) {
        int res=0;
        mPersona mPerson=vP.save(mP);
        if(!mPerson.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        vP.deleteById(id);
    }
    
    
}
