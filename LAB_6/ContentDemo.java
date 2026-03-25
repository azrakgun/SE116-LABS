import java.util.ArrayList;
import java.util.List;

public class ContentDemo {

        public static void main(String[] args) {

            ArrayList<Content> list = new ArrayList<>();

            list.add(new Movie(" 1 ", "Inception", 148, true));
            list.add(new Movie(" 2 ", "Shrek", 85, false));
            list.add(new Series(" 3 ", "Breaking Bad", 47, 62));
            list.add(new Series(" 4 ", "Black Mirror", 60, 6));
            list.add(new Documentary(" 5 ", "Planet Earth", 50, 5, 8));
            list.add(new Documentary(" 6 ", "Food Inc.", 94, 2, 3));

            for (Content content : list) {
                System.out.println("-----------------------------");
                content.displayInfo();
                System.out.println("Total Duration: " + content.calculateTotalDuration());
                System.out.println("Category: " + content.getRecommendationCategory());
            }
        }
    }
