package chapter_18.practice.ques_09;

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("合計 " + count);
    }
}

// Counterに、staticなint型のフィールドcount（初期値0）を作る
// Counterに、引数なしのコンストラクタを作り、その中でcountに1を足す
// Counterに、staticなvoidメソッドshowCountを作り、「合計 （count） 」の形で1行表示する
// 2つ目のファイルは同じ場所に置き、ファイル名はRunner.java、クラス名はRunner
// RunnerのmainからCounterを3回newしたあと、Counter.showCount()を呼ぶ
// 実行して、「合計 3」と表示されることを確かめてください。
