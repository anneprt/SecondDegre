package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double x;
        double x1;
        double x2;

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrer la valeur de a :");
        a = lectureClavier.nextDouble();
        System.out.println("Entrer la valeur de b :");
        b = lectureClavier.nextDouble();
        System.out.println("Entrer la valeur de c :");
        c = lectureClavier.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Tout réel est solution");
                } else {
                    System.out.println("Il n'existe pas de solution");
                }
            } else {
                x = -c / b;
                System.out.println("La solution est " + x);
            }
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("La solution n'existe pas dans les réels");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Il y a deux solutions : " + x1 + " et " + x2);
            }
        }
    }
}
