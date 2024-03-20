import java.util.Arrays;

public class NewsFeed {

    public NewsFeed() {

    }

    public String[] getTopics() {

        String[] topics = {"Opinion", "Tech", "Science", "Health"};

        return topics;
    }

    public static void main(String[] args) {

        NewsFeed sampleFeed = new NewsFeed();

        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        System.out.println(Arrays.toString(topics));
    }
}
