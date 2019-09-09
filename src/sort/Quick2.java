package sort;

import java.util.Arrays;

public class Quick2 {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,6,7,10,8,9};
        int low=0;
        int high=arr.length-1;
        quick(arr,low,high);
        System.out.println(Arrays.toString(arr));

    }
    public static void quick(int[] arr,int low,int high){
        int i=low;
        int j=high;
        if(low>high){
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
                int temp=0;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[i];
        arr[i]=key;
        quick(arr,low,j-1);
        quick(arr,j+1,high);
    }

}
