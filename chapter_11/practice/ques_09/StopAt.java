package chapter_11.practice.ques_09;

public class StopAt {
    public static void main(String[] args) {
        int limit = 7;
        for (int i = 1; i <= 20; i++) {
            if (i > limit) {
                break;
            }
            System.out.println(i);
        }
    }

}
