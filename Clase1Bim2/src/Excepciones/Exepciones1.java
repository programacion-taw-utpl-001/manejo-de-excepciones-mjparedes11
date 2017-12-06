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
public class Exepciones1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int num;
        int den;
        int div=0;
        int val=1;
        
        //int valor=10/0;
        //int valor=Integer.parseInt("Loja");
        
        do {            
            try {
                System.out.println("Ingrese el numerador:");
                num=teclado.nextInt();
                System.out.println("Ingrese el denominador:");
                den=teclado.nextInt();
                div=num/den;
                
                //si se genera una excepcion no se ejecutarán el resto de acciónes es un "Break" del try
                val=0;
            } catch (ArithmeticException e) {
                System.out.println("algo salió mal");
            } 
        } while (val==1);
        
        System.out.println(div);
    }
    
}
