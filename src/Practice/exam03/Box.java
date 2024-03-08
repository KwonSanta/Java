package Practice.exam03;

public class Box<T> {
    // field
    public T content;

    // method
    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
