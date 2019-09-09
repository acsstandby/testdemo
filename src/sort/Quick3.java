package sort;

import java.util.Arrays;

public class Quick3 {
    public static void main(String[] args) {
        int[] arr={12,3,1,5,8,4,9,0,2};
        int low=0;
        int high=arr.length-1;
        quick(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[]arr,int low,int high){
        int i=low;
        int j=high;
        int temp=0;
        if (low>high){
            return;
        }
        int key=arr[low];
        while (i<j){
            while (i<j&&arr[j]>=key){
                j--;
            }
            while (i<j&&arr[i]<=key){
                i++;
            }
            if (i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
        quick(arr, low, j-1);
        quick(arr, j+1, high);

    }
}
