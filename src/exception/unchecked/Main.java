package exception.unchecked;

public class Main {
    public static void main(String[] args) {
        //Null Pointer Exception
        String s1 = null;
        System.out.println(s1.equals("my string"));

        //Array Index Out of Bounds Exception
        String[] arr = new String[]{"one", "two", "three"};
        System.out.println(arr[arr.length - 1]);
//        System.out.println("Hello");

    }
}
