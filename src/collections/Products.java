package collections;

public class Products {
    int id;
    String name;
    float price;

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Products(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}
