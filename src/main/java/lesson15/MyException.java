package lesson15;

public class MyException extends Exception {

    private String errorMessage;

    public MyException() {
        this.errorMessage = super.getMessage();
    }

    public void printErrorMessage() {
        System.out.println("error message: " + errorMessage);
    }



}
