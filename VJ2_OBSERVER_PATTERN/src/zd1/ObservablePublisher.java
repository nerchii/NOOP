package zd1;
import java.util.ArrayList;
import java.util.List;

public class ObservablePublisher {

    private List<ObserversSubscribers<?>> subscribers = new ArrayList<>();

    public void addSubscriber(ObserversSubscribers<?> sub) {
        subscribers.add(sub);
    }

    public void removeSubscriber(ObserversSubscribers<?> sub) {
        subscribers.remove(sub);
    }

    public void notifySubscribers(Object issue) {
        for (ObserversSubscribers<?> sub : subscribers) {
            ((ObserversSubscribers<Object>) sub).update(issue);
        }
    }
}
