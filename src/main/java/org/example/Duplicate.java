
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;

public class Duplicate {

    public static void main(String[] args) {


        // Write a program of string which conatins the string p
        //Write a program where i replaces with e

        String str = "pinki";

        String result = str.replace("i","e");

        System.out.println("Print e instead of i:"+ result);





    }



       /* String string = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);

    }

    public static void test2w (){
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i= arr.length-1; i<=0,i--){

            System.out.prinln("Reverse array"+ [i])
        }


        public static void main (String[] args ){
            // write a program to reverse a String without using STring inbuilt fucntion
            String str = "Automation";
            StringBuilder str2 = new StringBuilder(); //used Stringbuilder to reverse the string
            str2.append(str);
            str2 = str2.reverse();
            System.out.println(str2);

      ////Write a program in java to iterate Arraylist using for loop
            public static void main (String [] args ){

              Arraylist lst = new ArrayList();
                 lst.add(20);
                 lst.add(30);
                 lst.add(40);
                 System.out.println(lst.size());
                Iterator itr = lst.iterator();
                while(itr.hasNext()){
                    System.out .Println (itr.next());
                }

                for(int i=0; i&lt;list.size(); i++) {
                    System.out.println(list.get(i));


                    //Write a program to demonstarte an explicit wait condition check

                    WebDriverWait  wait = new WebDriverWait();

                    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Softwaretesting")));
                    element2.click();

                    //Write a Java Program to find the duplicate characters in a string.

                    public static void main (String [] args ){

                        String str3 = new String("pinkki");

                        int count = 0;
                        char[] chr = str.toCharArray();
                        System.out.Println( "Duplicate characters");

                        for (int i=0;i&lt; str3.length(); i++){

                            for(int j=i+1;j&lt;str.length();j++{

                                if (chr[i] = =chr[j]){

                                    System.out.prinlm(char[j])
                                count++;
                                    break;

                                }


                                String str1 = "Saket Saurav        is a QualityAna    list";

                                //1. Using replaceAll() Method

                                String str2 = str1.replaceAll("\\s", "");

                                System.out.println(str2);

                            }
                        }

//File src=new File("C:\\webdriver\\DataSource.xls");

                        //to read the data from excel

                        //Let's see an example to replace all the occurrences of a single character.

                        String abc = "This is a very good website";

                        //We need to replace e from a

                        String abc2 = abc.replaceAll("e","a");

                        System.out.prinln(abc2);



                    }



*/








            }











