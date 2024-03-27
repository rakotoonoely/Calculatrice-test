/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdan08.calculatrice;

import java.util.Scanner;

/**
 *
 * @author ndimb
 */
public class Calculatrice {

    /*public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Entrez le premier nombre : ");
        num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        num2 = scanner.nextDouble();

        System.out.println("Sélectionnez une opération :");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choix = scanner.nextInt();
        double resultat = 0;
    }*/

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double soustraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division par zéro !");
        }
    }

}
