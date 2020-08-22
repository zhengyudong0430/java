public class ShellSort {
    public static void main(String[] args) {
         int []arr = {1,5,2,6,8,7,1,1,0,8,45,23,12,5,233,112,23};
         ShellSort(arr);
         for(int i = 0; i<arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
    }
public static void ShellSort(int []arr) {
        int gap = arr.length/2;
        while (gap>1) {
            InsertSort(arr,gap);
            gap/=2;
        }
        InsertSort(arr,1);
}
public static void InsertSort(int []arr,int gap) {
        for(int bound = gap;bound<arr.length; bound+=gap) {
            int cur = bound-gap;
            int tmp = arr[bound];
            for(;cur>=0;cur-=gap) {
                if(arr[cur]>tmp) {
                    arr[cur+gap] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+gap] = tmp;
        }
}
    }

