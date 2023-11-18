class CustomException extends Exception {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}

public class Result {
    static int validate (int marks) throws CustomException {
        if(marks<0 || marks>100) {
            throw new CustomException("Marks are out of bound");
        }
        else {
            return marks;
        }
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(validate(Integer.parseInt(args[0])));
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
