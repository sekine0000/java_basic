package chapter_17.practice.ques_09;

public class Runner {
    public static void main(String[] args) {
        Counter count = new Counter();
        count.countUp(10);
        count.countUp(20);
        count.show();
    }

}

/*
 * RunnerのmainからCounterをnewし、countUpを10と20で2回呼んでからshowを呼ぶ
 * 実行して、「合計 30」と表示されることを確かめてください。
 */
