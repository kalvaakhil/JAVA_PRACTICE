public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String cannotDivideByZero) {
        super(cannotDivideByZero);
    }
}
