package org.decoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecodeBirthdate {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> symbols = new ArrayList<>();


    public static void main(String[] args) {

        String str = sc.nextLine();
        if (str.length() == 8) {
            String[] arrOfStr = str.split("");
            symbols.addAll(Arrays.asList(arrOfStr));
            for (int i = 0; i < symbols.size(); i++) {
                switch (symbols.get(i)) {
                    case "D" -> symbols.set(i, "0");
                    case "R" -> symbols.set(i, "1");
                    case "S" -> symbols.set(i, "2");
                    case "P" -> symbols.set(i, "3");
                    case "3" -> symbols.set(i, "4");
                    case "Y" -> symbols.set(i, "5");
                    case "X" -> symbols.set(i, "6");
                    case "L" -> symbols.set(i, "7");
                    case "B" -> symbols.set(i, "8");
                    case "I" -> symbols.set(i, "9");
                    default -> System.out.print(" Invalid->");
                }
                System.out.print(symbols.get(i));
            }
        } else {
            System.out.println("Number of symbols not eight");
        }
    }

}