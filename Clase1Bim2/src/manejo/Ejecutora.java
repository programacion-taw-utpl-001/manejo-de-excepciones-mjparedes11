/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo;

import java.util.Scanner;

/**
 *
 * @author MIlton Paredes
 */
public class Ejecutora {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int contador=1;
        String nm;
        String ns;
        Estudiante [] lista_e=new Estudiante[5];
        double [] notas_m=new double[5];
        double [] notas_s=new double[5];
        Estudiante es= new Estudiante();
            
        do {            
            System.out.println("estudiante: "+contador);
            try {
                String n;
                String a;
                System.out.println("Ingrese el nombre del estudiante:");
                n=teclado.nextLine();
                System.out.println("Ingrese el apellido del estudiante:");
                a=teclado.nextLine();
                es.establecer_nombre(n);
                es.establecer_apellido(a);
                lista_e[contador]=es;
                
                
                
                System.out.println("Ingrese la nota de matemáticas:");
                nm=teclado.nextLine();
                notas_m[contador]=Double.parseDouble(nm);
                System.out.println("Ingrese la nota de sociales: ");
                ns=teclado.nextLine();
                notas_s[contador]=Double.parseDouble(ns);
                
                contador=contador+1;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Surgio un error ingrese el estudiante otra vez");
            }
        } while (contador<5);
        
        Asignacion as =new Asignacion(lista_e, notas_m, notas_s);
        for (int i = 0; i < 4; i++) {
            System.out.println(as);
        }
        
        
    }
}
