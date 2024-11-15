package com.mycompany.s1301;
 /*
 * Programa que lee tres números distintos
 * y nos dice cuál de ellos es el mayor
 */
public class CalculaMayor {

    public int mayor(int n1, int n2, int n3) {
        int nMayor = 0;
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);      
                nMayor = n1;
            } else {
                System.out.println("el mayor es: " + n3);     
                nMayor = n3;
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
            nMayor = n2;
        } else {
            System.out.println("el mayor es: " + n3);
            nMayor = n3;
        }
        return nMayor;
    }
}