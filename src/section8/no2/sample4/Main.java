package section8.no2.sample4;

public class Main {
    public static void main(String[] args) {
        Class<Sample> clazz = Sample.class;
        if (clazz.isAnnotationPresent(DefaultValue.class)) {
            DefaultValue defaultValue = clazz.getAnnotation(DefaultValue.class);
            System.out.println(defaultValue.test());
        } else {
            System.out.println("DefaultValue not found");
        }
    }
}
