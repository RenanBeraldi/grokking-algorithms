public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int guess = arr[middle];
            if (guess == target) {
                return middle;
            }
            if (guess < target) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
