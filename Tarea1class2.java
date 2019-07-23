/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1class2;

import java.util.Scanner;

/**
 *
 * @author Keyra Lima
 */
public class Tarea1class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 1
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.print("Ingrese un primer número: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        num2 = entrada.nextInt();
        resultado = num1*num2;
        System.out.println("Su resultado es: "+resultado);
    }
   
            
    
}
