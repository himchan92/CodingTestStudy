package String;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] items = text.split(" ");
        int max = 0;
        String result = "";
        for(String item : items) {
            if(max < item.length()) {
                max = item.length();
                result = item;
            }
        }
        System.out.println(result);
        in.close();
    }
}