package Recusrion.Arrays;

import java.util.Scanner;

public class Print_Recursively {
    public static void PrintArray(int arr[], int index) {
        int n = arr.length;
        // Base Case
        if(index == n) {
            return;
        }
        System.out.print(arr[index]+" ");
        PrintArray(arr,index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,3,7,5};
        int index = 0;
        PrintArray(arr,index);
    }
}
