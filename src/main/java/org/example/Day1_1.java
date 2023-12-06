package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args) {
        File file = new File("input1_1.txt");
        int sum = 0;

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String numString = parseString(line);
                int number = Integer.parseInt(numString);
                sum += number;
            };

            System.out.println("The final sum is: " + sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static String parseString(String line) {
        String result = "";
        char[] charsInLine = line.toCharArray();

        if(line.isEmpty() || line == "") {
            return result;
        };

        for(char c : charsInLine) {
            if(Character.isDigit(c)) {
                result += c;
                break;
            }
        };
        for(int i = line.length()-1; i >= 0; i--) {
            if(Character.isDigit(charsInLine[i])) {
                result += charsInLine[i];
                break;
            }
        };
        return result;
    }
}
