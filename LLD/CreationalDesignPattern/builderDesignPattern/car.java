// it is used when dealing with complex objects i.e they have a lot of attributes in them
/* if you have a lot of attributes and you only want to initilaize siome attributes and not all
 * then you would have to create a lot of constructors so it becomes very cumbersome
 */
package CreationalDesignPattern.builderDesignPattern;

public class car {

    String engine;
    Integer seats;
    String color;
    String sunroof;
    Integer wheels;

    private car(carBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.sunroof = builder.sunroof;
        this.color = builder.color;
        this.wheels = builder.wheels;
    }

    public static class carBuilder {
        String engine;
        Integer seats;
        String color;
        String sunroof;
        Integer wheels;

        public carBuilder setWheels(Integer wheels) {
            this.wheels = wheels;
            return this;
        }

        public carBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public carBuilder setSunroof(String sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public carBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public carBuilder setSeats(Integer seats) {
            this.seats = seats;
            return this;
        }

        public car build() {
            return new car(this);
        }
    }
}

class builderDesignPattern {
    public static void main(String[] args) {

        car.carBuilder builder = new car.carBuilder();
        car car1 = builder.setColor("red").setEngine("asdf").setSeats(4).setWheels(5).build();
        System.out.println(car1);
    }
}