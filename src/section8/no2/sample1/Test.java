package section8.no2.sample1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // デフォルトの生存期間は中間のCLASS
public @interface Test {
    String name();
    int price();
}
