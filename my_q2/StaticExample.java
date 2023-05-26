package my_q2;

public class StaticExample {
    private static int count = 0; // static変数

    public static void incrementCount() { // staticメソッド
        count++;
    }

    public static void main(String[] args) {
        StaticExample.incrementCount(); // インスタンス化せずにstaticメソッドを呼び出す
        System.out.println("Count: " + count); // static変数の値を表示
    }
}
