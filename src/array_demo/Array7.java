package array_demo;

public class Array7 {
    public static void main(String[] args) {
        int[][] array=new int[4][4];
        int k=0;
        for (int i=0;i<4;i++){
            for (int j=0;j<i+1;j++){
                array[i][j]=k;
                k++;
            }
        }
        System.out.println();
        for (int i=0;i<4;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
