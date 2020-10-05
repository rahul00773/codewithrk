package app;

public class GetMaximumElementFromArray {

    public static void main(String[] args){

        int[] arr = {5,10,100,20,30};

        System.out.println("Maximun element from an array"+getMaximumElement(arr));
    }

    public static int getMaximumElement(int[] arr){

        int maxElement = arr[0];

        for(int i =1; i<arr.length; i++){

            if(maxElement<arr[i]){

                maxElement = arr[i];
            }

        }

        return maxElement;
    }
    
}
