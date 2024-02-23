package array_demo;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array={5,2,6,-34,35,38};
        Arrays.sort(array);
        for (int i=0;i<6;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i=5;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        String[] names={"Ekhtiaj","Eafat","Ekramul","Al-amin","Shihabul"};
        Arrays.sort(names);
        System.out.println();
       for(int i=0;i<5;i++){
           System.out.print(names[i]+" ");
       }
        System.out.println();
       for(int i=4;i>-1;i--){
           System.out.print(names[i]+" ");
       }

    }
}
