public class HeapSort{
    public static void main(String[] args) {
        int []arr = {1,3,4,12,6,57,9,0};
        heapSort(arr);
        for(int i = 0; i<arr.length;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void heapSort(int[] array) {
        createHeap(array);
        int heapSize = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, 0 , heapSize - 1);
            heapSize--;
            shiftDown(array, heapSize, 0);
        }
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }

    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if (array[child] > array[parent]) {
                swap(array, child, parent);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}