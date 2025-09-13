package String;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String text1 = in.nextLine();
        String result1 = sb1.append(text1).reverse().toString();

        String text2 = in.nextLine();
        String result2 = sb1.append(text2).reverse().toString();

        String text3 = in.nextLine();
        String result3 = sb1.append(text3).reverse().toString();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        in.close();
    }
}
