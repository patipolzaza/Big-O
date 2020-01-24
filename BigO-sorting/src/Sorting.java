
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author int320
 */
public class Sorting {

    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        Random rng = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rng.nextInt(n);
            b[i] = rng.nextInt(n);
        }
//        System.out.println("Enter all the elements:");
//        for (int i = 0; i < n; i++) {
//            a[i] = s.nextInt();
//        }
        double begin = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        double end = System.nanoTime();
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n - 1]);

        System.out.println("Duration Program : " + (end - begin) + " nSeconds.");
        System.out.println("                   " + ((end - begin) / 1000000) + " mSeconds.");
        System.out.println("                   " + ((end - begin) / 1000000000) + " Seconds.");

        begin = System.nanoTime();
        Arrays.sort(b);
        end = System.nanoTime();
        System.out.println("Duration Java : " + (end - begin) + " nSeconds.");
        System.out.println("                   " + ((end - begin) / 1000000) + " mSeconds.");
        System.out.println("                   " + ((end - begin) / 1000000000) + " Seconds.");
        System.out.println("BigO = O(n^2) [Quadratic]");
    }
}
