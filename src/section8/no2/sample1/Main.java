package section8.no2.sample1;

public class Main {
    public static void main(String[] args) {
        Class<Item> clazz = Item.class;

        if (clazz.isAnnotationPresent(Test.class)) {
            Test test = clazz.getAnnotation(Test.class);

            System.out.println(test.name());
            System.out.println(test.price());
        } else {
            System.out.println("Itemクラスには@Testアノテーションが付与されていません。");
        }
    }
}
