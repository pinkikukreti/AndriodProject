package org.example;

public class Arrays {

    public static void main(String[] args) {

        String [] abc = {"ford","volvo","Mazda","benz"};
        /*for (int i=0; i<abc.length; i++)

        //abc [1] = "pinki";
        {
            System.out.println("value of abc" + abc[i]);
        }*/

        for(int i=abc.length-1; i>=0; i--){

            System.out.println("print reverse order" + abc[i]);
        }
    }
}
