/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcmaven;

import java.util.Scanner;

/**
 *
 * @author 5im15aaduerst
 */
public class main {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (exit == false) {
            System.out.println("geben sie eine zahl ein");
            int z1 = sc.nextInt();
            System.out.println("geben sie noch eine zahl ein");
            int z2 = sc.nextInt();
            c.calculate(z1, z2);
            System.out.println("taste drücken um erneut zu rechnen oder exit eingeben um zu beenden");
            String x = sc.next();
            if(x.equals("exit")){
            exit = true;
            }
        }
    }

}
