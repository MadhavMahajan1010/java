package CreationalDesignPattern;

/* useful in cases where we want to create variety of objects belonging to different classes
   instead of creating each object separatley we can create a centralized class to create those objects
   helps to write clean, modular, maintainable and decoupled code
 */

interface vehicle2 {
    void start();
}

class car2 implements vehicle2 {

    @Override
    public void start() {
        System.out.println("car is getting started");
    }
}

class bike2 implements vehicle2 {
    @Override
    public void start() {
        System.out.println("bike is getting started");
    }
}

class vehicleFactory2 {

    public static vehicle2 getVehicle(String type) {

        vehicle2 v;
        if (type.equals("car")) {
            v = new car2();
            return v;
        } else if (type.equals("bike")) {
            v = new bike2();
            return v;
        }
        return null;
    }
}


public class factoryDesignPattern {

    public static void main(String args[]) {

        vehicle2 car = vehicleFactory2.getVehicle("car");
        car.start();
        vehicle2 bike = vehicleFactory2.getVehicle("bike");
        bike.start();
    }

}
