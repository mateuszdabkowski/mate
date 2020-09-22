package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int age =scanner.nextInt();

        if ( age>=18){
            System.out.println("Jestes osoba pelnoletnia");
        }
        else{
            System.out.println("Jestes dzieckiem");
        }
    }
}
