package zd1;

public class Subscriber_1<T> implements ObserversSubscribers<T> {

    private T type;

    public Subscriber_1(T type) {
        this.type = type;
    }

    @Override
    public void update(T issue) {
        System.out.println("Subscriber_1 received new issue: " + issue);
    }

    public T getType() {
        return type;
    }
}
