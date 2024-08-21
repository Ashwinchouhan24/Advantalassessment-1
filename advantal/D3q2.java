package advantal;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class D3q2 {
    public static void checkAge(int age) throws InvalidAgeException  {
        if (age < 18) {
            
            throw new InvalidAgeException("Age " + age + " is not valid. Must be 18 or older.");
        } else {
            System.out.println("Age " + age + " is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            
            checkAge(15);
        } catch (InvalidAgeException e) {
           
            System.err.println("Caught Exception: " + e.getMessage());
        }

        try {
            checkAge(20);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}

