package sort.QuickSort.quicksort_a;

import java.util.Arrays;

/**
 * @author ronin
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,70,2,-8,9,15,3};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int left,int right){
        //左下标
        int l = left;
        //右下标
        int r = right;
        //中轴值
        int mid = arr[(l+r)/2];
        int temp = 0;
        //while循环的目的是把比中轴值大的值放到右边,把中轴值小的值放到左边
        while(l<r){
           //在中轴的左边一直找，直到大于等于mid的值才退出
           while(arr[l]<mid){
                l++;
            }
           //在中轴的右边一直找，直到小于等于mid的值才退出
           while(arr[r]>mid){
                r--;
           }
           //如果l>=r,说明mid左右两边的值已经按照左边全是小于等于mid，右边全是大于等于mid
           if(l>=r){
              break;
           }
           temp = arr[l];
           arr[l] = arr[r];
           arr[r] = temp;
           //如果交换完成后,发现arr[l]==mid,则r--
            if(arr[l]==mid){
                r--;
            }
           //如果交换完成后,发现arr[r]==mid,则l++
            if(arr[r]==mid){
                l++;
            }
            //向左递归
            if(left<r){
                quickSort(arr,left,r-1);
            }
            //向右递归
            if(right>l){
                quickSort(arr,l+1,right);
            }
        }
    }
}
