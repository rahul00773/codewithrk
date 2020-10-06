package app;

public class FindMissingElementFromArray {

    public static void main(String[] args){


        int[] arr ={1,2,3,4,5,6,8,9,10};
        int n =10;

        System.out.println("Missing element from the array is " + getMissingElement(arr, n));

    }

    public static int getMissingElement(int[] arr, int n){

        int totalSum =  (n*(n+1))/2;

        int arrSum= 0;

        for (int i =0; i<arr.length; i++){

            arrSum = arrSum+arr[i];

        }

        return totalSum-arrSum;

    }
    
}
