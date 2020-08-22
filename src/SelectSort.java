public class SelectSort {
    public static void main(String[] args) {
        int []arr = {1,3,4,12,6,57,9,0};
        Sort(arr);
        for(int i = 0; i<arr.length;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int []arr) {
        for(int bound = 0; bound<arr.length; bound++) {
            for(int cur = bound; cur<arr.length;cur++) {
                if(arr[cur]<arr[bound]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[bound];
                    arr[bound] = tmp;
                }
            }
        }
    }
}
