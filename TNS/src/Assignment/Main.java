package Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                upper.append(ch);
            } else {
                lower.append(ch);
            }
        }

        System.out.println(lower.toString().trim() + upper.toString());
    }
}