package com.gilbert.accountbank.coding;

// 단어공부 (1157)

import java.util.*;
import java.util.stream.IntStream;

/**
 * 각 알파벳이 몇 번 나오는지 확인한다.
 * 최대 값이 두개이면 ?? 출력
 * 아니면 갯수가 가장 많은 알파벳 출력 (대문자로)
 */
//
public class Quiz1157 {

public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next().toLowerCase(Locale.ROOT);
        in.close();

        // 영문자의 갯수는 26
        int[] arr = new int[26];
        // 있는 문자면 +1
        for (int i = 0; i < S.length(); i++) {
        arr[S.charAt(i) - 'a'] += 1;
        }

        // ArrayList //
        List<Integer> list = new ArrayList<>();
        for (Integer integer : arr) {
            list.add(integer);
        }
        // arr 최댓값
        int max = Collections.max(list);

        // 최댓값의 갯수
        int countMax = Collections.frequency(list, max);

        if (countMax >= 2) {
            System.out.println("?");
        } else {
            int maxIndex = list.indexOf(max) + 65;
            System.out.println((char)maxIndex);
        }
    }
}
