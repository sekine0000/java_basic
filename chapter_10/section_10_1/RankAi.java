package chapter_10.section_10_1;

public class RankAi {
    public static void main(String[] args) {
        int pages = 320;
        String label;

        if (pages >= 500) {
            label = "大作";
        } else if (pages >= 300) {
            label = "読みごたえあり";
        } else if (pages >= 150) {
            label = "標準";
        } else {
            label = "短編";
        }

        System.out.println(pages + " ページは " + label + " です");
    }
}
