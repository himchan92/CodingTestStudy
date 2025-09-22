package fastcampus.part1;

import java.util.Scanner;

public class Main_2744 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] items = text.toCharArray();

        String result = "";
        for(char item : items) {
            if(Character.isLowerCase(item)) {
                result += String.valueOf(Character.toUpperCase(item));
            }
            else {
                result += String.valueOf(Character.toLowerCase(item));
            }
        }
        System.out.println(result);
        sc.close();
    }
}
