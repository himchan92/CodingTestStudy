package String;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] items = text.toCharArray();
        String result = "";
        for(char item : items) {
            if(Character.isUpperCase(item)) {
                result += String.valueOf(Character.toLowerCase(item));
            }
            else {
                result += String.valueOf(Character.toUpperCase(item));
            }
        }
        System.out.println(result);
        in.close();
    }
}