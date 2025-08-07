package Recusrion.Arrays;

import java.util.Scanner;

public class Maximum_Value {
    public static int MaxValue(int arr[], int idx) {
        int n = arr.length;
        if (idx == n-1) {
            return arr[idx];
        }
        int afterarray = MaxValue(arr,idx+1);
        int ans = Math.max(arr[idx],afterarray);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {9,5,8,6,4,8,6,3,4,5,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int x = sc.nextInt();
        int finalanswer = MaxValue(arr,x);
        System.out.println(finalanswer);
    }
}
