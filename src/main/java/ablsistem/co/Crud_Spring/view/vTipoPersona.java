/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ablsistem.co.Crud_Spring.view;

import ablsistem.co.Crud_Spring.model.mTipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository //indicar interfaz, poder interactuar
public interface vTipoPersona extends CrudRepository<mTipoPersona, Integer>{
    
}
