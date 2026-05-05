class ArrayDemo {
    public static void main(String[] args) {

        // 1D Array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}