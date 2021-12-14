package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the first list: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);


        System.out.println("Enter the second list: ");
        ArrayList<String> B = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println(B);

        ArrayList<String> C = new ArrayList<>();
        Collections.reverse(B);
        int a = 0;
        while (C.size() < A.size()+ B.size()) {
            C.add(A.get(a));
            C.add(B.get(a));
            a++;
        }
        System.out.println(C);
        Collections.sort(C, Comparator.comparing(String::length));
        System.out.println(C);
    }
}
