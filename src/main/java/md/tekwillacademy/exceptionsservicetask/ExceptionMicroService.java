package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroService {
    public static void main(String[] args) {
        String controlVariable = null;

        System.out.println("The String Length it is = " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The String Length it is = " + TextManager.getTheTextLength("Alexandru"));
        System.out.println("The String Length it is = " + TextManager.getTheTextLengthWithIf(controlVariable));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(0, 3));
        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(0, 0));

        System.out.println("Inside my heart is breaking");
    }
}
