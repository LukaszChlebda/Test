package Builder;

/**
 * Created by lukasz on 23.07.16.
 */
public class Car {
    private String make;
    private String color;
    private double price;

    private Car(final Builder builder) {
        this.make = builder.make;
        this.color = builder.color;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    public static class Builder {
        private final String make;
        private String color;
        private double price;

        public Builder(final String make) {
            this.make = make;
        }

        public Builder color(final String color) {
            this.color = color;
            return this;
        }

        public Builder price(final double price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
