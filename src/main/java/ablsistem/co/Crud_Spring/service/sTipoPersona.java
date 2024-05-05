/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ablsistem.co.Crud_Spring.service;

import ablsistem.co.Crud_Spring.interfaceService.isTipoPersona;
import ablsistem.co.Crud_Spring.model.mTipoPersona;
import ablsistem.co.Crud_Spring.view.vTipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
//ANOTACIONES
@Service// aglutina dos repositorios y agrupa su funcionalidad 
public class sTipoPersona implements isTipoPersona{

    @Autowired
    private vTipoPersona vTP;
    
    @Override
    public List<mTipoPersona> listarTP() {
        return(List<mTipoPersona>)vTP.findAll();
    }

    @Override
    public Optional<mTipoPersona> listarIdTP(int id) {
        return vTP.findById(id);
    }

    @Override
    public int saveTP(mTipoPersona mTP) {
        int res=0;
        mTipoPersona mTipoPerson=vTP.save(mTP);
        if(!mTipoPerson.equals(null)){
            res=1;
        }
        return res;

    }

    @Override
    public void deleteTP(int id) {
        vTP.deleteById(id);
    }
    
}   