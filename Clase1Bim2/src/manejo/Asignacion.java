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
public class Asignacion {
    Estudiante [] lista_personas;
    double [] notas_matemáticas;
    double [] notas_sociales;
    
    //costructores
    public Asignacion(){}
    
    public Asignacion(Estudiante[] e, double[] nm, double[] ns){
        for (int i = 0; i < 5; i++) {
            lista_personas[i]=e[i];
            notas_matemáticas[i]=nm [i];
            notas_sociales[i]=ns[i]; 
       }
    }
    
    //metodos de la clase

    public Estudiante[] getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(Estudiante[] ps) {
        lista_personas = ps;
    }

    public double[] getNotas_matemáticas() {
        return notas_matemáticas;
    }

    public void setNotas_matemáticas(double[] nm) {
        notas_matemáticas = nm;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] ns) {
        notas_sociales = ns;
    }
    
    public double prom_m(){
        double promm=0;
        for (int i = 0; i < 4; i++) {
            double val=promm+notas_matemáticas[i];
            val=val/notas_matemáticas.length;
        }
        
        return promm;
    }
    
    public double prom_s(){
        double proms=0;
        for (int i = 0; i < 10; i++) {
            double val=proms+notas_sociales[i];
            val=val/notas_sociales.length;
        }
        return proms;
    }
    
    public double promt(){
        double promt=0;
        for (int i = 0; i < 4; i++) {
            promt=notas_matemáticas[i]+notas_sociales[i];
        }
        return promt/2;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("%s\n"
                + "Matemáticas: %.2f\n"
                + "Sociales: %.2f\n"
                + "Promedio: %.2f",getLista_personas(),getNotas_matemáticas(),getNotas_sociales(),promt());
        return cadena;
    }
}
