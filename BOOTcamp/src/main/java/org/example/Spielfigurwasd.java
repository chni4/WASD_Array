package org.example;

import java.util.Scanner;
public class Spielfigurwasd {
    public static void main(String[] args) {
        //Figur input

        Scanner sc = new Scanner(System.in);
        char Figurlogik = sc.next().charAt(0);


        char[][] spielbrett = new char[11][11];
            gyatX(Figurlogik);
        printout(spielbrett);
    }

    public static int gyatX(char Figurlogik) {
        if (Figurlogik == 'A') {
            return -1;
        } else if (Figurlogik == 'D') {
            return 1;
        } else {
        return gyatY(Figurlogik);
        }
    }
    public static int gyatY(char input) {
        if (input == 'W') {
            return 1;
        } else if (input == 'S') {
            return -1;
        } else {
            return 0;
        }
    }

    public static void printout(char[][] Spielbrett) {

        for (char[] chars : Spielbrett) {
            for (int x = 0; x < Spielbrett.length; x++) {
                System.out.print("[" + chars[x] + "]");
            }
            System.out.println("");
        }

    }
        }

