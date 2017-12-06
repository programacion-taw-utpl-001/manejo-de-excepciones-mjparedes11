/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author MIlton Paredes
 */
public class Demo {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        edad= teclado.nextInt();
        
        //limpiar buffer (el amacenamiento instantaneo)
        teclado.nextLine();
        
        System.out.println("Ingrese su nombre:");
        nombre= teclado.nextLine();
        
        //System.out.println("ingrese su edad");
        //edad= teclado.nextInt();
        
        //muestra de datos
        System.out.printf("Su nombre es: %s \n",nombre);
        System.out.printf("Su edad es: %d \n",edad);
    }
}
