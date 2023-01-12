package com.example.demo;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String firstname = sc.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String lastname = sc.nextLine();

        System.out.println("Inserisci la tua città");
        String city = sc.nextLine();

        System.out.println("Ciao " + firstname + " " + lastname + " da " + city);
    }

}
