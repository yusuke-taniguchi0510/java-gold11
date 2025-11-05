package section8.no3;

public class Main {
    public static void main(String[] args) {
        Class<TestItem> clazz = TestItem.class;
        if(clazz.isAnnotationPresent(Test.class)) {
            Test test = clazz.getAnnotation(Test.class);
            String name = test.name();
            int price = test.price();

            TestItem testItem = new TestItem(name, price);
            System.out.println(testItem);
        }
    }
}
