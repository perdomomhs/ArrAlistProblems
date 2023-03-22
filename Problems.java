import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Problems {

    /* 1-Point Penalty
        v) Array/collection access confusion ([] get)
        w) Extraneous code that causes side-effect (e.g., printing to output, incorrect precondition check)
        x) Local variables used but none declared
        y) Destruction of persistent data (e.g., changing value referenced by parameter)
        z) Void method or constructor that returns a value
     */


    /******
     * Array Problems 
     *****/

     public static double mean(int[] arr){

     }

     /* I imported the java.util.Arrays class for you. With this class you can sort any array of primitives
      * Simply call Arrays.sort(array) and the contents of the array will be sorted in ascending order 
      * WARNING: Only use Arrays.sort on arrays of primitives and Strings
      */

     //Hint: Sort it first
     public static int median(int[] arr){

     }

     //Hint: Sort it first
     public static int mode(int[] arr){

     }

     //Don't sort it. Just do it the normal way
     public static int max(int[] array){

     }
     
     //returns the INDEX of the second highest number om the array. 
     public static int secondMaxIndex(double[] arr){

     }
    
     //return an array with the first n elements of the array. When n>arr.length, then just return arr.
     public static String[] firstN(String[] arr){
        
     }


     //get rid of the first n elements of the array. If n>=arr.length, then return an array of size 0;
     public static int[]  chopNOff(int[] arr){

     }

     //return an array with the numbers that are divisble 3
     //Hint: Count them first. 
     public static int[] onlyDiv3(int[] arr){

     }

     //Returns the biggest (absolute) difference between two conscutive elements 
     public static int bigDiffConsecutive(int[] arr){

     }

     //Returns the biggest difference betweeen ANY two numbers in the array
     //Hint: Sort it first
     public static double bigDiff(double[]  arr){

     } 


     // The following problem use the Athlete class. Take a look at it before you do the problems

     //Return the names of the athletes with the Jersey number n
     public static String[] withJersey(Athlete[] aths, int n){
        
     }

     //Return the average number of points for the given school
     public static double schoolAvg(Athlete[] aths, String school){

     }

     //Return an array of the Athletes except any athlete who's jersey is in the exlcuded jerseys
     //Hint: Count first using a double for loop 
     public static Athlete[] excludeJerseys(Athlete[] aths, int[] exJerseys){

     }




     /****
      * ArrayList Problems
      *
      *****/

     public static double mean(int[] arr){

     }

     /* Sorting ArrayList:
      * https://www.programiz.com/java-programming/library/arraylist/sort
      * WARNING: This will only work for Integer,Douuble,Boolean, and String ArrayList
      */

     //Hint: Sort it first
     public static double median(ArrayList<Double> alist){

     }

     //Hint: Sort it first
     public static double mode(ArrayList<Double> alist){

     }

     //Don't sort it. Just do it the normal way
     public static double max(ArrayList<Double> array){

     }

     public static int secondMaxIndex(ArrayList<Double> alist){

     }
    
     //return an array with the first n elements of the array. When n>arr.length, then just return arr.
     public static ArrayList<String> firstN(ArrayList<String> alist){
        
     }


     //get rid of the first n elements of the array. If n>=arr.length, then return an ArrayList of size 0;
     public static ArrayList<Integer> chopNOff(ArrayList<Integer> alist){

     }

     //return an array with the numbers that are divisble 3
     public static ArrayList<Integer> onlyDiv3(ArrayList<Integer> alist){

     }

     //Returns the biggest (absolute) difference between two conscutive elements 
     public static int bigDiffConsecutive(ArrayList<Integer> alist){

     }

     //Returns the biggest difference betweeen ANY two numbers in the array
     //Hint: Sort it first
     public static double bigDiff(ArrayList<Double>  alist){
        
     } 


     // The following problem use the Athlete class. Take a look at it before you do the problems

     //Return the names of the athletes with the Jersey number n
     public static ArrayList<String> withJersey(ArrayList<Athlete> aths, int n){
        
     }

     //Return the average number of points for the given school
     public static double schoolAvg(ArrayList<Athlete> aths, String school){

     }

     //Return an array of the Athletes except any athlete who's jersey is in the exlcuded jerseys 
     public static ArrayList<Athlete> excludeJerseys(ArrayList<Athlete> aths, int[] exJerseys){

     }
     //returns a list of the top N athletes with the most points
     public static ArrayList<Athlete> topN(ArrayList<Athlete> athletes){

     }

     //return a String with the best (highest points) player from each school
     //Exmple: 
     //String  str = "Joe  -  Magnolia+\n
     //               Ana - MagWest+\n
     //               Steve - Consol"
     public static String bestFromEachSchool(ArrayList<Athlete> alist){

     }

}