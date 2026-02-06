
public class FirstLastOccurrence {

    static int first(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    static int last(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        System.out.println(first(arr, 2) + " " + last(arr, 2));
    }
}
