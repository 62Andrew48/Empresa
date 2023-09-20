/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lógica_Cliente;

import Lógica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hola
        //Declarar variables
        String nombre = "";
        int cédula = 0;
        int año_de_nacimiento = 0;
        int Año_Actual = 2020;
        
        //Creación de objetos
        Persona objpersona = new Persona ();
        
        //Fijar información
        Scanner scan = new Scanner (System.in);
        
        //Pedir y fijar información de la clase Persona
        System.out.println("Dígite su Nombre completo: ");
        nombre = scan.nextLine();
        objpersona.setNombre(nombre);
        
        System.out.println("Dígite su número de Cédula: ");
        cédula = scan.nextInt();
        objpersona.setCédula(cédula);
        
        System.out.println("Dígite su Año de Nacimiento: ");
        año_de_nacimiento = scan.nextInt();
        objpersona.setAño_de_Nacimiento(año_de_nacimiento);
        
        //Operación de Resta entre Año_de_Nacimiento y Año_Actual
        int Edad_Actual = Año_Actual - objpersona.getAño_de_Nacimiento();
        
        //Creación de Objeto, Constructor parametrizado
        Persona objpersona_1 = new Persona(nombre, cédula, año_de_nacimiento);
            
        //Impresión de los datos de la clase Persona
        System.out.println("\t" + "********Documento de Identificación********");
        System.out.println("Su Nombre es: " + "\t" + objpersona.getNombre());
        System.out.println("Su número de Cédula es: " + "\t" + objpersona.getCédula());
        System.out.println("Su Edad es: " + "\t" + Edad_Actual);
        System.out.println("\t" + "********FIN********");
        
                              System.out.println("\t"); //Para dar más espacio
        
        System.out.println("\t" + "********Documento de Identificación - PERSONA 1********");
        System.out.println("PERSONA 1 - Su Nombre es: " + "\t" + objpersona_1.getNombre());
        System.out.println("PERSONA 1 - Su número de Cédula es: " + "\t" + objpersona_1.getCédula());
        System.out.println("PERSONA 1 - Su Edad es: " + "\t" + Edad_Actual);
        System.out.println("\t" + "********FIN - PERSONA 1 ********");
    }    
}