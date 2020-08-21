public class BubbleSort {
    public static void main(String[] args) {
         int []arr = {1,3,4,12,6,57,9,0};
         sort(arr);
         for(int i = 0; i<arr.length;i++ ) {
             System.out.print(arr[i]+" ");
         }
    }
    public static void sort(int []arr) {
        int count = 0;
        int n = arr.length;
        int flg = 0;
        int len = n-1;
        int flg1 = len;
        for(int i = 0; i<n-1; i++) {
            for(int j = 0; j<len; j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = 1;
                    flg1 = j;
                    count++;
                }
            }
            if(flg == 0) {
                return;
            }
            len = flg1;
        }
        System.out.println(count);
    }
}
