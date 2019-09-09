package sort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int[] arr={10,2,3,4,6,8,9,7};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr){
        for(int i=1;i<arr.length;i++){
            int insertNode=arr[i];
            int j=i-1;
            while (j>=0&&insertNode<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=insertNode;
        }
    }

}
