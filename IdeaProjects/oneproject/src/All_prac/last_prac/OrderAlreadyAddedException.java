package All_prac.last_prac;

public class OrderAlreadyAddedException extends RuntimeException {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}