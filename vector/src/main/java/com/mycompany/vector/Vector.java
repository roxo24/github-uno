/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vector;
import java.util.Scanner;
/**
 *
 * @author roxo2
 */
public class Vector {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        int[] conteo = new int[10];
        double suma = 0;
        
        
        System.out.println("Ingrese 10 números (entre 0 y 9):");
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero " + i);
            num[i] = teclado.nextInt();
            suma += num[i];
            conteo[num[i]]++;

        }

        
        System.out.println("Cantidad de repeticiones");
        for (int i = 0; i < 10; i++) {
            if (conteo[i] > 0) {
                System.out.println("el numero " + i + " se ingreso " + conteo[i] + " veces.");
            }
        }

        
        double promedio =  suma / 10;
        System.out.println("El promedio es: " + promedio);
    }
}
