package section8.no1.sample1;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();

        sample.add(new Object());
        sample.add(new Object());
        // 1件目
        sample.add(new Test() {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        });
        // 2件目
        sample.add(new Test() {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        });
        sample.add(new Object());
        // 3件目
        sample.add(new Test() {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        });

        // addの時点でTestインターフェースを実現したクラスのみが追加されているため3件しか表示されない。
        // このように処理対象とするか、しないかのためだけに使用するインターフェースをマーカーインターフェースという。
        sample.showList();
    }
}
