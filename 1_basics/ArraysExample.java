import java.util.Arrays;

public class ArraysExample{
    public static void main(String[] arg){
        //Creating an array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        //Creating and defining an array
        int[] numbers2 = {2, 1, 5, 6, 3, 4};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //Multi dimentional arrays
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix2));
    }
}