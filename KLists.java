import java.util.*;

public class KLists{
    //this is for creating the outer array
    public static double[][] outerArray = {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.7}};

    //this is for creating the single array
    public static double[] singleArray;

    public static double[] mergeKLists(double[][] bigArray){
        int count = 0;
        for (int n = 0; n < bigArray.length; n++){
            for (int m = 0; m < bigArray[n].length; m++){
                count++;
            }
        }

        singleArray = new double[count];

        //puts them into single array
        int i = 0;
        for (int j = 0; j < bigArray.length; j++){
            for (int k = 0; k < bigArray[j].length; k++){
                singleArray[i] = bigArray[j][k];
                i++;
            }
        }

        return singleArray;
    }

    //Using a bubble sort array
    public static double[] sortArray(double[] smallArray){
        if (smallArray == null){
            return smallArray;
        }

        int n = smallArray.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (smallArray[j] > smallArray[j+1]){
                    double temp = smallArray[j];
                    smallArray[j] = smallArray[j+1];
                    smallArray[j+1] = temp;
                }
            }
        }

        return smallArray;
    }

    public static void main(String[] args){
        System.out.println("Outer Array: " + Arrays.deepToString(outerArray));
        mergeKLists(outerArray);
        sortArray(singleArray);
        System.out.println("Sorted Array: " + Arrays.toString(singleArray));
    }
}