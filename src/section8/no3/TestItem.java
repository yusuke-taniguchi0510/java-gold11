package section8.no3;

@Test(name = "名前", price = 1)
public class TestItem {
    private final String name;
    private final int price;

    public TestItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TestItem{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
