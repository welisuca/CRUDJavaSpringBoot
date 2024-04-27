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

//Anotaciones para las entidades de las bases de datos (siempre van fuera de la clase) 
@Entity //Entidad
@Table(name="tPersona")//Tabla

public class mPersona {
    
    @Id //muestra, elimina, adiciona, hace lo que hace una CRUD
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;

    public mPersona() {
    }

    public mPersona(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}


