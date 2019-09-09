package sort;

import java.util.Arrays;

public class insert1 {
    public static void main(String[] args) {
        int[] arr={2,3,12,8,5,9,7,6,0};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertNode = arr[i];
            int j = i - 1;
            while (j >= 0 && insertNode < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertNode;
        }

    }}