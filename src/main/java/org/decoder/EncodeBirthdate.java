package org.decoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EncodeBirthdate {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> symbols = new ArrayList<>();


    public static void main(String[] args) {

        String str = sc.nextLine();
        if (str.length() == 8) {
            String[] arrOfStr = str.split("");
            symbols.addAll(Arrays.asList(arrOfStr));
            for (int i = 0; i < symbols.size(); i++) {
                switch (symbols.get(i)) {
                    case "0" -> symbols.set(i, "D");
                    case "1" -> symbols.set(i, "R");
                    case "2" -> symbols.set(i, "S");
                    case "3" -> symbols.set(i, "P");
                    case "4" -> symbols.set(i, "3");
                    case "5" -> symbols.set(i, "Y");
                    case "6" -> symbols.set(i, "X");
                    case "7" -> symbols.set(i, "L");
                    case "8" -> symbols.set(i, "B");
                    case "9" -> symbols.set(i, "I");
                    default -> System.out.print(" Invalid->");
                }
                System.out.print(symbols.get(i));
            }
        } else {
            System.out.println("Number of symbols not eight");
        }
    }

}
