package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        List<char[]> list = new ArrayList<char[]>();
        for (int i =0;i <= n;i++){
            char[] c = scanner.nextLine().toCharArray();
            list.add(c);
        }
        for(char[] c :  list) {
            String stringFromChars = String.valueOf(c);
            System.out.println(stringFromChars);
        }
    }
}

