/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ablsistem.co.Crud_Spring.interfaceService;

import ablsistem.co.Crud_Spring.model.mTipoPersona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ASUS
 */
public interface isTipoPersona {
    public List<mTipoPersona>listarTP(); //un método que devoverá una lista (list tipo array), lista de objetos
    public Optional<mTipoPersona>listarIdTP(int id);//Método devuelve un objeto que devuelve un objeto o puede ser vacío
    public int saveTP(mTipoPersona mTP);
    public void deleteTP(int id);
}
