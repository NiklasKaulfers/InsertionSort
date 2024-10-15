public class InsertionSort{
    // takes user input and makes it an int[], uses default if null
    // calls the sorting algorithm
    public static void main(String[] args){
        int[] arr = {12, 29, 14, 46, 74, 23, 91, 14, 9,123,123,543,2,4,65,34,7586,4,8769,5436,98,546,756,432,823,734865,673,973,65762,7263,764,878,435,245,6356,7863,526,862,6253, 521, 10, 47, 28, 12, 83, 27, 89, 637, 20834, 73, 267, 758, 1786,213,4352,4526,465777,6758,5886,4536,3456,6788976,5364,896786,24532,8968798,546745,345354,7868,543645,432534,6574567,23434,7568678,345645676,57885678,45674325,645756,45,654756,356456,6457456,342435,23423,5436657,7568678,56,123};
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