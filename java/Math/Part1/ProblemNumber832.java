package Math.Part1;

import java.util.Arrays;

public class ProblemNumber832 {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        int[][] result = flipAndInvertImage(image);
        System.out.println(Arrays.toString(result));
    }
    private static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            // reverse the array
            for(int i = 0; i < (image[0].length + 1) / 2; i++){
                // swap and invert
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }
}
