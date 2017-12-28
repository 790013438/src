package snippets;

public class LinkedHashMap {
    /**
     * HashMap.Node subclass for normal LinkedHashMap entries.
     */
    static class Entry<K,V> extends MockHashMap.Node<K,V> {
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, MockHashMap.Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
}
