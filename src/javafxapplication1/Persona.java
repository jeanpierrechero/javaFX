/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author educacionit
 */
public class Persona {
    
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleStringProperty dni;

    public Persona(SimpleStringProperty nombre, SimpleStringProperty apellido, SimpleStringProperty dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public SimpleStringProperty getNombre() {
        return nombre;
    }

    public void setNombre(SimpleStringProperty nombre) {
        this.nombre = nombre;
    }

    public SimpleStringProperty getApellido() {
        return apellido;
    }

    public void setApellido(SimpleStringProperty apellido) {
        this.apellido = apellido;
    }

    public SimpleStringProperty getDni() {
        return dni;
    }

    public void setDni(SimpleStringProperty dni) {
        this.dni = dni;
    }

   
}
