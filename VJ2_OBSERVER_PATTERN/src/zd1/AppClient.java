package zd1;

public class AppClient {

    public static void main(String[] args) {
        NewsPaper dailyNews = new NewsPaper("Daily News");
        NewsPaper monthlyMag = new NewsPaper("Monthly Mag");

        Subscriber_1<String> s1 = new Subscriber_1<>("Alice");
        Subscriber_2<String> s2 = new Subscriber_2<>("Bob");
        Subscriber_1<String> s3 = new Subscriber_1<>("Charlie");

        // Pretplatnici
        dailyNews.addSubscriber(s1);
        dailyNews.addSubscriber(s2);

        monthlyMag.addSubscriber(s2);
        monthlyMag.addSubscriber(s3);

        // Novi brojevi
        dailyNews.releaseNewIssue("Issue 101");
        monthlyMag.releaseNewIssue("March 2025 Edition");

        // Bob prestaje pretplatu na Daily News
        dailyNews.removeSubscriber(s2);

        dailyNews.releaseNewIssue("Issue 102");
    }
}
