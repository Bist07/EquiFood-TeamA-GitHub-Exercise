package com.equifood;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    // Returns array with int modification:
    // 0 - Returns sorted array
    // 1 - Returns sorted array in reverse order
    // 2 - Returns sorted array of odd numbers
    // 3 - Returns sorted array of even numbers
    // 4 - Returns sorted array of prime numbers

    public static List<Integer> arraySort(List<Integer> list, int modification){
        Collections.sort(list);
        // add modifications here
        if(modification == 1){
            Collections.reverse(list);
        }


        if(modification == 4){   //Function to remove all non-prime numbers from the list NOT COMPLETE
           int ListLength = list.size();
           boolean isPrime = false;
         for(int i=0; i<ListLength; i++){
            isPrime= prime(list.get(i));
            if(isPrime){
            }else{
                list.set(i, 0);   //Replaces all composite numbers with zero
                }
            }
         }
         return list;
    }
        
       static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)      //returns true if number is prime
            return false;
        }
        return true;
       } 
       
      


    // Asks user for integers separated by spaces then returns list
    public static List<Integer> userInput(Scanner scanner){
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter your integers separated by a space: ");
        String[] strNums = null;

        if (scanner.hasNextLine()){
            strNums = scanner.nextLine().split(" ");
        }

        if (strNums != null){
            for (String strNum: strNums) {
                try {
                    list.add(Integer.parseInt(strNum.trim()));
                } catch(Exception e){
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
        return list;
    }

    // Asks user for integer modification then returns that integer
    public static int modInput(Scanner scanner){
        System.out.println("Which modification would you like to use?: ");
        System.out.println("0 - Returns sorted array");
        System.out.println("1 - Returns sorted array in reverse order");
        System.out.println("2 - Returns sorted array of odd numbers");
        System.out.println("3 - Returns sorted array of even numbers");
        System.out.println("4 - Returns sorted array of prime numbers");
        int mod;
        mod = scanner.nextInt();

        while(mod < 0 || mod >= 4){
            System.out.println("Please enter a valid modification between 0-4");
            mod = scanner.nextInt();
        }

        return mod;
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        list = userInput(scanner);
        
        if(!list.isEmpty()){
            int mod = 0;
            mod = modInput(scanner);
            
            scanner.close();

            List<Integer> output = new ArrayList<Integer>();
            output = arraySort(list, mod);
            System.out.println(output);
        }


    
        

    }


}
