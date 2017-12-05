@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /** Return a unique value. */
    public int getNext() {
        return value++;
    }
}
