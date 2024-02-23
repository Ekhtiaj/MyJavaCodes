package array_demo;


import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> number=new ArrayList<Integer>();
        System.out.println("Size= "+number.size());
        //adding elements:
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println("The array is: "+number);
        System.out.println("New size is= "+number.size());

    }

}
