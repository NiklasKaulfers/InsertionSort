public class InsertionSort{
    // takes user input and makes it an int[], uses default if null
    // calls the sorting algorithm
    public static void main(String[] args){
        int[] arr = {12, 29, 14, 46, 74};
        if (!args.length == 0){
            arr = new int[args.length];
            for (int i = 0; i <= args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
            }
        } 
        System.out.println(arr[1] + "");   
    }
}J