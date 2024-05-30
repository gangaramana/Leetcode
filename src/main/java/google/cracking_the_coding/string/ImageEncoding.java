package google.cracking_the_coding.string;

class ImageEncoding {
    public static void main(String[] args) {
        ImageEncoding imageEncoding=new ImageEncoding();
        int[][] image=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        imageEncoding.rotate90(image);
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public void rotate90(int[][] image) {
//transpose the matrix

        for (int i = 0; i < image.length; i++) {
            for (int j = i; j < image[0].length; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

//        for (int i=0;i<image.length;i++){
//            for (int j=0;j<image[0].length;j++){
//                System.out.print(image[i][j]+"  ");
//            }
//            System.out.println();
//        }

//reverse the array in rows

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[0].length - 1 - j];
                image[i][image[0].length - 1 - j]= temp;

            }

        }
    }
}

