import java.util.Arrays;

public class NewsFeed {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles = new String[10];

    public NewsFeed() {
    }

    public void setFavoriteArticles(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }
    public String[] getTopics() {
        return topics;
    }

    public int getNumTopics () {
        return topics.length;
    }

    public String getTopTopic() {
        return topics[0];
    }

    public void viewTopic (int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args) {
        System.out.println("This is your daily news feed update");
        System.out.println("===================================");
        NewsFeed kompas = new NewsFeed();
        NewsFeed test;

//        if (args[0].equals("Human")) {
//            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
//            test = new NewsFeed(humanTopics);
//        } else if (args[0].equals("Robot")) {
//            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
//            test = new NewsFeed(robotTopics);
//        }


        // System.out.println("The top topic is : " + kompas.getTopTopic());

        kompas.viewTopic(3);
        kompas.viewTopic(3);
        kompas.viewTopic(3);
        kompas.viewTopic(3);
        kompas.viewTopic(1);
        kompas.viewTopic(2);

        System.out.println("The " + kompas.topics[1] + " topic has been viewed " + kompas.views[1] + " times!.");
        System.out.println("The " + kompas.topics[2] + " topic has been viewed " + kompas.views[2] + " times!.");
        System.out.println("The " + kompas.topics[3] + " topic has been viewed " + kompas.views[3] + " times!.");

        kompas.setFavoriteArticles(0, "Did We Will Landing on Moon Again ?");
        kompas.setFavoriteArticles(1, "How the Prince Doing Now ?");
        kompas.setFavoriteArticles(8, "Oil Price Rise Up Again!");

        System.out.println("Your all-time favorite articles : " + Arrays.toString(kompas.favoriteArticles));
        System.out.println("The number of topics is : " + kompas.getNumTopics());
    }
}
