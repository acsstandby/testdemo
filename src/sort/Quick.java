package sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,6,7,10,8,9};
        int low=0;
        int high=arr.length-1;
        quick(arr,low,high);
        System.out.println(Arrays.toString(arr));

    }
    public static void quick(int[] arr,int low,int high){
        int i;
        int j;
        int key;
        int temp=0;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        key=arr[i];
        while(i<j){
            //从右往左走,找到比基准数小的数
            while(arr[j]>=key&&i<j){
                j--;
            }
            //从左往右走，找到比基准数大的数
            while(arr[i]<=key&&i<j){
                i++;
            }
            //找到了就进行交换
            if(i<j){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        arr[low]=arr[i];
        arr[i]=key;
        //递归左边
        quick(arr, low,j-1);
        //递归右边
        quick(arr,j+1,high);

    }

}
