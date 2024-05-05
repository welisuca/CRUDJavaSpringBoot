/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ablsistem.co.Crud_Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ASUS
 */
//ANOTACIONES
@Entity //define componente y especifica una clase es entidad
@Table (name="tTipoPersona") //origen datos qeu se debe utilizar en la clase
public class mTipoPersona {
    //ANOTACIONES
    @Id //define clave principal
    @GeneratedValue(strategy = GenerationType.IDENTITY)//como se genera el valor de mi llave primaria definida con @Id, le da el valor automático que se generó en la BD
    private int id;
    private String name;
    
    public mTipoPersona() {
        
    }

    public mTipoPersona(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
