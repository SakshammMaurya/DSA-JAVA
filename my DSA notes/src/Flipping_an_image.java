//    https://leetcode.com/problems/flipping-an-image/description/
public class Flipping_an_image {
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {

            for(int i=0;i<image.length;i++) reverse(image[i],image.length);
            for(int i=0;i<image.length;i++){
                for(int j=0;j<image.length;j++){
                    if(image[i][j]==1) image[i][j]=0;
                    else image[i][j]=1;

                }
            }
            return image;
        }

        static int[] reverse(int[] arr,int n){
            int i, k, t;
            for (i = 0; i < n / 2; i++) {
                t = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = t;
            }
            return arr;

        }
    }
}
