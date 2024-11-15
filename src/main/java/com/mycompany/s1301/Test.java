package com.mycompany.s1301;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        
        CalculaMayor cm = new CalculaMayor();
        System.out.println( "El mayor es " + cm.mayor(n1, n2, n3));
        
    }
}
