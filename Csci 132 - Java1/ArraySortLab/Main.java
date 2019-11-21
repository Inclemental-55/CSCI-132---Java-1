package com.company;

public class Main {

    public static void main(String[] args) {
        int[] stuff;
        int[] sizes = {100,200,500,1000,10000};
        System.out.println("N   | Bubble  | Insertion | Selection");
        for(int x : sizes) {
            System.out.print(x + " |");
            bubbleSort(randomArray(x));
            System.out.print(x + " |");

            insertionSort(randomArray(x));
            System.out.print(x + " |");

            selectionSort(randomArray(x));
            System.out.print(x + " |");
            System.out.println("");
        }
    }

    private static void bubbleSort(int[] intArray) {
        long startTime = System.currentTimeMillis();
            int size = intArray.length;
            int hold;
            for(int point=0; point < size; point++){
                for(int behind=1; behind < (size-point); behind++){
                    if(intArray[behind-1] > intArray[behind]) {
                        hold = intArray[behind - 1];
                        intArray[behind - 1] = intArray[behind];
                        intArray[behind] = hold;
                    }
                }
            }
         //for(int x=0;x < intArray.length;x++)
         //System.out.println(intArray[x]);
        long finishTime = System.currentTimeMillis();
        System.out.print( (finishTime - startTime));
    }

    private static void insertionSort(int[] intArray) {
        long startTime = System.currentTimeMillis();
        int size = intArray.length;
        for (int i = 1; i < size; ++i) {
                int point = intArray[i];
                int behind = i - 1;
                while (behind >= 0 && intArray[behind] > point) {
                    intArray[behind + 1] = intArray[behind];
                    behind = behind - 1;
                }
            intArray[behind+1] = point;
            }
        //for(int x = 0; x < size; x++)
        //   System.out.println(intArray[x]);
        long finishTime = System.currentTimeMillis();
        System.out.print((finishTime - startTime));
        }

    public static void selectionSort(int[] intArray){
        long startTime = System.currentTimeMillis();
        int n = intArray.length;
        for (int i = 0; i < n-1; i++)
        {
            int index = i;
            for (int j = i+1; j < n; j++)
                if (intArray[j] < intArray[index])
                    index = j;
            int temp = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = temp;
        }
        long finishTime = System.currentTimeMillis();
        //for(int x=0;x < intArray.length;x++)
        //System.out.println(intArray[x]);
        System.out.print((finishTime - startTime));

    }
    private static int[] randomArray(int size){
        int[] stuff = new int[size];
        for (int i = 0; i < stuff.length; i++)
            stuff[i] = (int) (Math.random() * size);
        return stuff;
    }
}
