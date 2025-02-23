package OneDimentional;

import java.util.Scanner;



public class OneD {


    public static void main(String[] args) {
        refractoredDryCode();
    }
    /**
     * 
     * @param firstArray
     * @param secondArray
     * @return
     */
    public static boolean areEqualArrays(int[] firstArray, int[] secondArray)
    {
        int arraySize = firstArray.length != secondArray.length ? firstArray.length : 0;
        boolean flag = false;

        if(arraySize == 0) return false;

        for(int i = 0 ; i < arraySize; i++)
        {
            if(firstArray[i] == secondArray[i])
            {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 
     * @param list
     * @return
     */
    public static int sumArray(int[] list)
    {
        int sum = 0;
        for(int i = 0; i < list.length; i++)
        {
            sum += list[i];
        }
        return sum;
    }

    /**
     * 
     * @param list
     * @return
     */
    public static int indexLargestElement(int[] list)
    {
        int largestIndex = 0;
        for(int i = 0 ; i < list.length; i++)
        {
            if(list[largestIndex] < list[i])
            {
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    /**
     * Finds the location of an item from an array
     * 
     * @param list Array of numbers
     * @param searchItem Element to find in the list
     * @return int Location of searchItem
     */
    public static int seqSearch(int[] list, int searchItem)
    {
        int location = 0;
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            
            if(list[location] == searchItem)
            {
                found = true;
            } else {
                location++;
            }
        }

        return found ? location : -1;
    }

    /**
     * 
     * @param list
     * @return
     */
    public static double largest(double ...list)
    {
        double largestElement = 0.0;
        int arraySize = list.length;

        if(arraySize != 0)
        {
            for (int i = 0; i < list.length; i++) {
                if(largestElement < list[i])
                {
                    largestElement = list[i];
                }
            }
        }
        return largestElement;
    }


    public static void foreachExample(int []list)
    {
        for (int element : list) {
            System.err.println(element);
        }
    }

    // public static void arrayOfObject(Clock[] clocks)
    // {
    //     for (int i = 0; i < clocks.length; i++) 
    //     {
    //         System.out.println("Clock #" + (i + 1) + " " + clocks.toString());
    //     }
    // }

    public static void exampleDryCode()
    {
        Scanner console = new Scanner(System.in);

        // Student 1
        System.out.println("Enter grades for Student 1 (Math, Science, English):");
        double math1 = console.nextDouble();
        double science1 = console.nextDouble();
        double english1 = console.nextDouble();
        double avg1 = (math1 + science1 + english1) / 3;
        System.out.println("Average grade for Student 1: " + avg1);

        // Student 2
        System.out.println("Enter grades for Student 2 (Math, Science, English):");
        double math2 = console.nextDouble();
        double science2 = console.nextDouble();
        double english2 = console.nextDouble();
        double avg2 = (math2 + science2 + english2) / 3;
        System.out.println("Average grade for Student 2: " + avg2);

        // Student 3
        System.out.println("Enter grades for Student 3 (Math, Science, English):");
        double math3 = console.nextDouble();
        double science3 = console.nextDouble();
        double english3 = console.nextDouble();
        double avg3 = (math3 + science3 + english3) / 3;
        System.out.println("Average grade for Student 3: " + avg3);

        console.close();
    }

    public static void refractoredDryCode()
    {
        Scanner s = new Scanner(System.in);

        int numberOfStudents = 3;

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("Enter Grades for Student " + (i + 1) +  " (Math, Science, English): ");
            double math = s.nextDouble();
            double science = s.nextDouble();
            double english  = s.nextDouble();

            double average = (math + science + english) / 3;

            System.out.println("Average for Student" + (i + 1) +  ": " + average);
            System.out.println();
        }
        s.close();
    }

}
