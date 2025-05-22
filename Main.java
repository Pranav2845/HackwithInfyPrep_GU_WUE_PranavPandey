/*
Counting Divisors:
Given n integers, your task is to report for each integer the number of its divisors.
For example, if x=18, the correct answer is 6 because its divisors are 1,2,3,6,9,18.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxX = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());       // take input from user for large i/o, like scanner...
            if (arr[i] > maxX) maxX = arr[i];           // max number in array
        }

        int[] divisorCount = new int[maxX + 1];

        // Precompute divisor counts using a sieve-like approach
        for (int i = 1; i <= maxX; i++) {
            for (int j = i; j <= maxX; j += i) {
                divisorCount[j]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(divisorCount[arr[i]]).append('\n');
        }

        System.out.print(sb);
    }
}
