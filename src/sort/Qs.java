package sort;


import java.util.Arrays;

public class Qs {
    public static void main(String[] args) {
        int[] arr={10,1,2,4,5,7,9,8,0,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int low,int high){
        int i;
        int j;
        int temp=0;//临时变量
        int key;
        if (low>high){
            return;
        }
        i=low;
        j=high;
        key=arr[low];

        while (i<j){
            //右边要向左走找到一个比基准值小的数
            while(key<=arr[j]&&i<j){
                j--;

            }
            //左边要向右走找到一个比基准值大的数
            while(key>=arr[i]&&i<j){
                i++;

            }
            //如果找到了就进行交换
            if(i<j){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            //最后将基准为与i和j相等位置的数字交换

        }
        arr[low]=arr[i];
        arr[i]=key;
        //递归调用左半数组
        quickSort(arr,low,j-1);
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
}
