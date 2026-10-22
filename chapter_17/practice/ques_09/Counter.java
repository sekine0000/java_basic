package chapter_17.practice.ques_09;

public class Counter {
    public int count;

    public void countUp(int n) {
        this.count = this.count + n;
    }

}

/*
 * int型の引数を1つ受け取り、countに足すメソッドcountUpを作る（staticは付けず、thisを使ってフィールドを更新する）
 * 「合計 （count）」の形で1行表示するメソッドshowを作る（staticは付けず、thisを使ってフィールドを読む）
 * 2つ目のファイルは同じ場所に置き、ファイル名はRunner.java、クラス名はRunner
 * RunnerのmainからCounterをnewし、countUpを10と20で2回呼んでからshowを呼ぶ
 * 実行して、「合計 30」と表示されることを確かめてください。
 */
