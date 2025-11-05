package section8.no2.sample2;

public class Main {
    public static void main(String[] args) {
        Class<Item> clazz = Item.class;

        if (clazz.isAnnotationPresent(SampleValue.class)) {
            SampleValue annotation = clazz.getAnnotation(SampleValue.class);
            System.out.println(annotation.value());
        } else {
            System.out.println("SampleValueアノテーションなし");
        }
    }
}
