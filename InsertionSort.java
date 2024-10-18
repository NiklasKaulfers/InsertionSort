import java.util.Random;

public class InsertionSort{
    // takes user input and makes it an int[], uses default if null
    // calls the sorting algorithm
    public static void main(String[] args){
        Random random = new Random();
        // lowest possible number
        int lower = 0;
        // highest possible number
        int upper = 100000;
        // amount of numbers in the list
        int amountNumbers = 100000;
        int[] arr = random.ints(amountNumbers, lower, upper).toArray();

        if (args.length > 1){
            arr = new int[args.length];
            for (int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
            }
        }

        System.out.print("initial list: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(""); 

        double startTime = System.currentTimeMillis();
        arr = sort(arr);
        double endTime = System.currentTimeMillis();

        System.out.print("after sort: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("time needed: " + (endTime-startTime) + " ms");
    }



    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int value = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > value){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = value;
        }
        return arr;
    }
}