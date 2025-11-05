package section8.no4.sample1;

public class Sample {
    @NotNull(message = "name is not allowed null")
    private final String name;

    @NotNull(message = "price is not allowed null")
    private final Integer price;

    public Sample(String name,  Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
