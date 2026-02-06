
public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        boolean found = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                found = true;
                break;
            } else if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(found);
    }
}
