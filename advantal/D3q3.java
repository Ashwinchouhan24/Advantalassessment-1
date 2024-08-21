package advantal;
public class D3q3 {

    public static void main(String[] args) {
        try {
           
            int result = 10 / 0;
            System.out.println("Result of division: " + result);
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing an element: " + numbers[5]);

           
            int num = Integer.parseInt("abc");
            System.out.println("Parsed number: " + num);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

