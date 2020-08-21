

public class InsertSort {
    public static void main(String[] args) {
        int []arr = {1,3,4,12,6,57,9,0};
        Sort2(arr);
        for(int i = 0; i<arr.length;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
    /*public static void Sort(int []arr) {
        int n = arr.length;
        for(int i = 1; i<n; i++) {
            for(int j = i; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
    }*/
    public static void Sort2(int []arr) {
        int n = arr.length;
        for(int i = 1; i<n; i++) {
            int j;
            int tmp = arr[i];
            for(j=i-1;j>=0;j--) {
                if(arr[j]>tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
