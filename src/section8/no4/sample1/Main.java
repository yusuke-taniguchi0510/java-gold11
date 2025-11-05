package section8.no4.sample1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample(null, null);

        List<String> messages = NotNullValidator.validate(sample);
        if (messages.isEmpty()) {
            System.out.println("valid object");
            return;
        }

        for (String message : messages) {
            System.out.println(message);
        }
    }
}
