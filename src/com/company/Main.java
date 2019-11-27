package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        List list = new ArrayList<char[]>();
        for (int i =1;i <= n;i++){
            String str = scanner.nextLine();
            char[] c = str.toCharArray();
            list.add(c);
        }
        for(int i = 0;i < list.size();i++){
         System.out.println(list.get(i));
         }

    }
}


