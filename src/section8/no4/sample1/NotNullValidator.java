package section8.no4.sample1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NotNullValidator {
    public static List<String> validate(Object target) {
        try {
            List<String> messages = new ArrayList<>();
            Class<?> clazz = target.getClass();
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true); // private fieldでも触れるように変更

                NotNull annotation = field.getAnnotation(NotNull.class);
                if (annotation == null) { // アノテーションがついてないのでスルー
                    continue;
                }

                if (field.get(target) != null) { // 値がnullじゃないのでOKとし、スルー
                    continue;
                }

                messages.add(annotation.message()); // ここまで来たということはアノテーションがついているが値がnullのため注釈パラメータの値をListに追加
            }

            return messages;
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
