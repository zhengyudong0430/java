

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
        for(int bound = 1; bound<arr.length; bound++) {
            int tmp = arr[bound];
            int cur;
            for (cur = bound-1;cur>=0; cur--) {
                if(arr[cur]>tmp) {
                    arr[cur+1] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+1] = tmp;
        }
    }
    }

