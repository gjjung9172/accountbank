package com.gilbert.accountbank.coding;

import java.util.Scanner;

public class Quiz10809 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // 모든 요소가 -1 인 길이가 26일 배열
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
                System.out.println((int)ch - 'a');
            }
        }

        for (int val : arr) {
            System.out.println("arr = " + val);
        }
    }
}
