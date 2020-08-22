public class QuickSort {
    public static void main(String[] args) {
        int []arr = {1,3,4,12,6,57,9,0};
        SortHelper(arr,0,arr.length-1);
        for(int i = 0; i<arr.length;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void SortHelper(int []arr,int left,int right) {
        if(left>=right) {
            return;
        }
        int index = partion(arr,left,right);
        SortHelper(arr,0,index-1);
        SortHelper(arr,index+1,right);
    }

    private static int partion(int[] arr, int left, int right) {
      int baseValue = arr[right];
      int i = left;
      int j = right;
      while (i<j) {
          while (i<j&&arr[i]<=baseValue) {
              i++;
          }
          while (i<j&&arr[j]>=baseValue) {
              j--;
          }
          if(i<j) {
              int tmp = arr[i];
              arr[i] = arr[j];
              arr[j] = tmp;
          }
      }
     int tmp = arr[i];
      arr[i] = arr[right];
      arr[right] = tmp;
      return i;
    }
}
