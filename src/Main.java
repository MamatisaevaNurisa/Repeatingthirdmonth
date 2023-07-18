import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException arithmeticException) {
//            System.out.println("Sandy nolgo bolgon go bolboit");
//        }
//        System.out.println("Hello Java");
//
//        System.out.println((3 + Integer.parseInt("5")));

        int[] arr = new int[10];
        try {
            System.out.println(arr[11]);
            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
            //  System.out.println("Tuura emes index");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("JAVA");
        }


        try {
            method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void method() throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
    }


}