package section8.no2.sample3;

public class Main {
    public static void main(String[] args) {
        Class<Sample> clazz = Sample.class;
        if (clazz.isAnnotationPresent(ArrayValues.class)) {
            ArrayValues values = clazz.getAnnotation(ArrayValues.class);
            for (int i : values.values()) {
                System.out.println(i);
            }
        } else {
            System.out.println("No annotation ArrayValues");
        }
    }
}
