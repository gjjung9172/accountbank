package com.gilbert.accountbank.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// 문자열 반복
public class Quiz2675 {

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        // 테스트 케이스 입력 값 지정
//        int T = in.nextInt();
//
//        // 테스트 케이스 개수만큼 반복
//        for (int i = 0; i < T; i++) {
//
//            // 반복 출력 횟수 저장
//            int R = in.nextInt();
//
//            // 반복 출력할 문자열 저장
//            String S = in.next();
//
//            // 문자열 길이만큼 반복. 한글자씩 세분화 반복
//            for (int j = 0; j < S.length(); j++) {
//
//                // 반복 출력 횟수 만큼 반복
//                for (int k = 0; k < R; k++) {
//                    System.out.print(S.charAt(j));
//                }
//            }
//            // 줄 바꿈
//            System.out.println();
//        }
//    }

//    Use Buffer
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < T; i++) {
//
//            String[] str = br.readLine().split(" ");	// 공백 분리
//
//            int R = Integer.parseInt(str[0]);	// String -> int
//            String S = str[1];
//
//            for(int j = 0; j < S.length(); j++) {
//                for(int k = 0; k < R; k++) {
//                    System.out.print(S.charAt(j));
//                }
//            }
//            System.out.println();
//        }
//    }

    //  use StringBuilder
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for (byte val : str[1].getBytes()) {
                for (int j = 0; j < R; j++) {
                    sb.append((char) val);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }


}
