package zd1;

import java.util.ArrayList;

public class NewsPaper {

    private String name;
    private ArrayList<ObserversSubscribers<?>> subscribers;

    public NewsPaper(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(ObserversSubscribers<?> subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(ObserversSubscribers<?> subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Object issue) {
        for (ObserversSubscribers<?> sub : subscribers) {
            ((ObserversSubscribers<Object>) sub).update(issue);
        }
    }

    public void releaseNewIssue(Object issue) {
        System.out.println("New issue released: " + issue + " of " + name);
        notifySubscribers(issue);
    }
}
