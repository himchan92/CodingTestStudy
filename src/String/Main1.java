package String;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String keyword = sc.nextLine();
        String[] result = text.split("");
        int count = 0;
        for(String item : result) {
            if(item.toUpperCase().equals(keyword.toUpperCase())) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
