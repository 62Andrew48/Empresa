/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica_Negocio;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {
    
    //Atributos
    public String Nombre;
    public int Cédula;
    public int Año_de_Nacimiento;
    
    //Constructor no parametrizado
    public Persona (){
    }
    
    //Constructor parametrizado
    public Persona(String Nombre, int Cédula, int Año_de_Nacimiento) {
        this.Nombre = Nombre;
        this.Cédula = Cédula;
        this.Año_de_Nacimiento = Año_de_Nacimiento;
    }
    
    //Setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }

    public void setAño_de_Nacimiento(int Año_de_Nacimiento) {
        this.Año_de_Nacimiento = Año_de_Nacimiento;
    }

    //Getters
    public String getNombre() {
        return Nombre;
    }

    public int getCédula() {
        return Cédula;
    }

    public int getAño_de_Nacimiento() {
        return Año_de_Nacimiento;
    }
}