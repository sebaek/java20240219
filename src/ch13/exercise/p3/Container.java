package ch13.exercise.p3;

public class Container<K, V> {
    private K key;
    private V value;


    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
