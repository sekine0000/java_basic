package chapter_18.practice.ques_09;

public class Runner {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.showCount();
    }

}

// RunnerのmainからCounterを3回newしたあと、Counter.showCount()を呼ぶ
