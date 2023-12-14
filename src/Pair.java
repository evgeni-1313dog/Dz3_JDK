public class Pair<T> {
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + ", " + second;
    }
}
