package com.thizgroup.time.study.sort;

import java.util.Arrays;
import org.junit.Test;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.sort.SortTest
 * @Description: 八大基础排序
 * @date 2020/6/22 10:42
 */
public class SortTest {

  /**
   * 冒泡排序
   */
  public void bubblingSort(int arr[]){

    /**
     * 第一个数和第二个数比较，如果第一个数大于第二个数则交换，然后第二个数和第三个数比较，依次类推，直到倒数第二个数和最后一个数比较，
     * 这样，经过n-1次比较后，最后一个数为数组的最大值；
     * 第二轮循环从第二个数开始，直到数组的倒数第二个数，重复上述步骤，循环直到只剩下数组的第一个
     */

    for(int i=arr.length-1;i>0;i--){
      for(int j=0;j<i;j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

  }

  /**
   * 选择排序
   */
  public void selectSort(int arr[]){
    /**
     * 从数组的第一个数开始查找，直到数组的最后一个数，找出最小的数的下标，跟数组的第一个数交换
     * 第二轮循环从数组的第二个数开始查找，直到数组的最后一个数，找出最小的数的下标，跟数组的第二个数交换，
     * 直到剩下数组的最后一个数
     */
    for(int i=0;i<arr.length;i++){
      int min = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
          min = j;
        }
      }
      if(min != i){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
    }
  }

  /**
   * 快速排序
   */
  public void quickSort(int arr[],int L,int R){
    /**
     * 在数组中寻找一个支点，经过一趟排序后，支点左边的数比支点小，支点右边的数比支点大，
     * 然后在左边寻找新的支点，重复上述步骤，直到数组剩余一个元素
     */
     int mid = (L+R)/2;
     int i = L;
     int j = R;
     while(i<=j){
       while(arr[mid]>arr[i]) i++;
       while(arr[mid]<arr[j]) j--;
       if(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
     }
     if(i<R){
       quickSort(arr,i,R);
     }
     if(j>L){
       quickSort(arr,L,j);
     }
  }

  /**
   * 插入排序
   */
  public void insertSort(int arr[]){
    /**
     * 对于一个无序数组，把数组的第一个元素看成有序的，拿数组的第二个元素跟数组的第一个元素比较，
     * 如果第二个元素大于第一个元素，则不做任何操作，如果第二个元素小于第一个元素，则交换，
     * 这样，数组的前两个元素此时是有序的，
     * 拿数组的第三个元素和第二个元素比较，如果大于不做任何操作，
     * 如果小于，则数组的第二个元素后退到第三个元素的位置，第三个元素继续和第一个元素比较，
     * 如果大于，把第三个元素插入第二个元素的位置，如果小于，把第三个元素插入第一个元素的位置，
     * 再把第一个元素插入第二个元素的位置
     */

    for(int i=1;i<arr.length;i++){
      int j = i-1;
      int temp = arr[i];
      while(j>=0 && temp<arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }
  }

  @Test
  public void sortTest(){
    int arr[] = {3,1,5,23,14,16,17,18};
    System.out.println(Arrays.toString(arr));
   /* bubblingSort(arr);*/
    //selectSort(arr);
    //quickSort(arr,0,arr.length-1);
    //insertSort(arr);
    //heapSort(arr);
    //shellSort(arr);
    //mergeSort(arr,0,arr.length-1);
    int max = getMax(arr, 0, arr.length - 1);
    System.out.println(max);
    radixSort(arr);
    System.out.println(Arrays.toString(arr));
    //System.out.println(Arrays.toString());
  }

  /**
   * 堆排序：
   * 是基于完全二叉树来对数组进行排序，第一次建堆找到数组中的最大值与数组的最后一个元素交换，
   * 然后使用剩下的数建堆，找到最大值与数组的倒数第二个数交换，直到数组剩余一个元素
   */
  public static void heapify(int arr[],int currentNode,int size){
    if(currentNode<size){
      int max = currentNode;
      int left = currentNode*2+1;
      int right = currentNode*2+2;
      if(left<size){
        if(arr[max]<arr[left]){
          max = left;
        }
      }
      if(right<size){
        if(arr[max]<arr[right]){
          max = right;
        }
      }
      if(max != currentNode){
        int temp = arr[currentNode];
        arr[currentNode] = arr[max];
        arr[max] = temp;
        //继续进行比较
        heapify(arr,max,size);
      }
    }
  }

  public static void maxHeapify(int arr[],int size){

    for(int i=size-1;i>=0;i--){
      heapify(arr,i,size);
    }
  }

  public static void heapSort(int arr[]){

    for(int i=0;i<arr.length;i++){
      maxHeapify(arr,arr.length-i);
      int temp = arr[arr.length-1-i];
      arr[arr.length- 1-i] = arr[0];
      arr[0] = temp;
    }
  }

  /**
   * 希尔排序：把一个数组进行分组，然后分别对分组的数组进行排序，分组数不断递减，(最终只有一个分组相当于插入排序)
   */
    public static void shellSort(int arr[]){

      for(int step=arr.length/2;step>0;step/=2){//分组

        for(int i=step;i< arr.length;i++){
          int j = i;
          int temp = arr[j];
          while(j-step>=0 && arr[j-step]>temp){
            arr[j] = arr[j-step];
            j = j - step;
          }
          arr[j] = temp;
        }
      }

    }

  /**
   * 归并排序：将一个数组拆分成两个小数组，让两个小数组有序，然后将两个数组的数据按照大小先后的顺序放入原来的数组中
   */
  public static void mergeSort(int arr[],int L,int R){

    if(L == R){
      return;
    }else {
      int M = (L+R)/2;
      mergeSort(arr,L,M);
      mergeSort(arr,M+1,R);
      merge(arr,L,M+1,R);
    }
  }

  private static void merge(int[] arr, int L, int M, int R) {

    int[] leftArray = new int[M-L];
    int[] rightArray = new int[R-M+1];

    for(int i=L;i<M;i++){
      leftArray[i-L] = arr[i];
    }
    for(int j=M;j<=R;j++){
      rightArray[j-M] = arr[j];
    }

    int k = L;
    int i=0;
    int j=0;

    while(i<leftArray.length && j<rightArray.length){
      if(leftArray[i]<=rightArray[j]){
        arr[k] = leftArray[i];
        k++;
        i++;
      }else {
        arr[k] = rightArray[j];
        k++;
        j++;
      }
    }

    while(i<leftArray.length){
      arr[k] = leftArray[i];
      i++;
      k++;
    }
    while (j<rightArray.length){
      arr[k] = rightArray[j];
      k++;
      j++;
    }
  }

  /**
   * 基数排序：桶排序，先将数组的每个数的个位，根据个位放入指定的桶中，
   * 然后按照顺序从上到下从左到右回收桶中的元素
   * 接着，取出每个数的十位，重复上述步骤，直到取出最大值的最高位为止；
   */
  public static void radixSort(int arr[]){
    int max = getMax(arr, 0, arr.length - 1);
    for(int i=1;max/i>0;i*=10){
      int[][] array = new int[arr.length][10];
      for(int j=0;j<arr.length;j++){
        int k = (arr[j]/i)%10;
        array[j][k] = arr[j];
      }

      int g = 0;
      for(int m=0;m<10;m++){
        for(int l=0;l<arr.length;l++){
          if(array[l][m] !=0){
            arr[g++] = array[l][m];
          }
        }
      }
    }
  }

  public static int getMax(int arr[],int L,int R){

    if(L == R){
      return arr[L];
    }else {
      int a = arr[L];
      int b = getMax(arr,L+1,R);
      if(a>b){
        return a;
      }else {
        return b;
      }
    }
  }


}
