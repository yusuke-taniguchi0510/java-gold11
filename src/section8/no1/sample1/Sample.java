package section8.no1.sample1;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private List<Object> list = new ArrayList<>();
    void add(Object obj) {
        if (obj instanceof Test) {
            this.list.add(obj);
        }
    }

    void showList() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(i + 1 + "件目 : " +  this.list.get(i));
        }
    }
}