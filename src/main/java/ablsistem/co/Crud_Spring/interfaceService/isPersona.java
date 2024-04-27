/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ablsistem.co.Crud_Spring.interfaceService;

import ablsistem.co.Crud_Spring.model.mPersona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ASUS
 */
public interface isPersona {
    public List<mPersona>listar();
    public Optional<mPersona>listarId(int id);
    
    public int save(mPersona mP); //guardar 
    public void delete(int id); // borrar

}
