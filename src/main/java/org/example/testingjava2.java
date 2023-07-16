package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class testingjava2 extends Home {



  public void testmethod(){

         room1();
          room2();
          room3();
          System.out.println(holyplace);
           terracearea1();
            terracearea();
           System.out.println(garden);
          System.out.println(terrace);


 }

    public static void main(String[] args) {

        ArrayList<Integer> abc=new ArrayList<Integer>();//Creating arraylist

        abc.add(1);//Adding object in arraylist
        abc.add(2);
        abc.add(3);
        abc.add(4);
//Traversing list through Iterator
        Iterator itr=abc.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
