/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo;

/**
 *
 * @author MIlton Paredes
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    //constructor
    public Estudiante(){}
    public Estudiante (String n, String a){
        nombre=n;
        apellido=a;
    }
    //metodos
    public void establecer_nombre(String n){
        nombre=n;
    }
    public void establecer_apellido(String a){
        apellido=a;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_apellido(){
        return apellido;
   }
    
    @Override
    public String toString(){
        String cadena=String.format("%s %s",obtener_nombre(),obtener_apellido());
        return cadena;
    }
}
