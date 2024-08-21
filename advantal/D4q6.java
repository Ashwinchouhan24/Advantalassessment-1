package advantal;
 class D3q6 {
    public static void performOperations(int[] array, int index, int divisor)
            throws InvalidInputException, DivisionByZeroException, ArrayIndexException {
        if (array == null || array.length == 0) {
            throw new InvalidInputException("Array cannot be null or empty.");
        }

        if (index < 0 || index >= array.length) {
            throw new ArrayIndexException("Array index is out of bounds: " + index);
        }

        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero.");
        }

        // Perform division
        int result = array[index] / divisor;
        System.out.println("Result of division: " + result);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Test with valid input
            performOperations(numbers, 2, 5);
            performOperations(numbers, 10, 2); 
            performOperations(numbers, 2, 0);
            performOperations(null, 2, 5);

        } catch (InvalidInputException | DivisionByZeroException | ArrayIndexException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        System.out.println("End of program.");
    }
}
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

// Custom exception for array index out of bounds
class ArrayIndexException extends Exception {
    public ArrayIndexException(String message) {
        super(message);
    }
}

