import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class UnsafeSequence {
    @GuardedBy("this")
    private int value;

    /**
     * Return a unique value.
     */
    public synchronized int getNext() {
        return value++;
    }
}
