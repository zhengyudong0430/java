public class ShellSort {
    public static void main(String[] args) {
         int []arr = {1,5,2,6,8,7,1,1,0,8,45,23,12,5,233,112,23};
         ShellSort(arr);
         for(int i = 0; i<arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
    }
    public static void ShellSort(int []arr){
        int gap = arr.length/2;
        while (gap>1) {
            InsertSort(arr,gap);
            gap/=2;
        }
        InsertSort(arr,1);
    }
    public static void InsertSort(int []arr,int gap) {
        int n = arr.length;
        int j;
        for(int i = gap; i<n; i+=gap) {
            int num = arr[gap];
            for( j = i; j>0&&arr[j-gap]>num;j-=gap) {
                arr[j] = arr[j-gap];
            }
            arr[j] = num;
        }
    }
}
