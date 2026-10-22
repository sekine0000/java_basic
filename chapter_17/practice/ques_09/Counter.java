package chapter_17.practice.ques_09;

public class Counter {
    public int count;

    public void countUp(int n) {
        this.count = this.count + n;
    }

    public void show() {
        System.out.println("合計 " + this.count);
    }

}

/*
 * int型の引数を1つ受け取り、countに足すメソッドcountUpを作る（staticは付けず、thisを使ってフィールドを更新する）
 * 「合計 （count）」の形で1行表示するメソッドshowを作る（staticは付けず、thisを使ってフィールドを読む）
 * 実行して、「合計 30」と表示されることを確かめてください。
 */
