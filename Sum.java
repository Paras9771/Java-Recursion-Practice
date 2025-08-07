package Recusrion.Arrays;

import java.util.Scanner;

public class Sum {
    public static int sumvalue(int arr[], int idx) {
        int n = arr.length;
        if (idx == n) {
            return 0;
        }
        int smallanswer = sumvalue(arr,idx+1);
        int ans = arr[idx]+smallanswer;
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,20,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the value");
        int x = sc.nextInt();
        System.out.println(sumvalue(arr,x));
    }
}
