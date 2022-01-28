package generic.genericclass;

public class Merchandise2<T extends String> {
    private String name;
    private String unit;
    private T quantity;

    public Merchandise2(String name, String unit, T quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public T getQuantity() {
        return quantity;
    }

    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }
}
