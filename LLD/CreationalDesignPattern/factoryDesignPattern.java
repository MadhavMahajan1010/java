package CreationalDesignPattern;

/* useful in cases where we want to create variety of objects belonging to different classes
   instead of creating each object separatley we can create a centralized class to create those objects
   helps to write clean, modular, maintainable and decoupled code
 */

interface vehicle {
    void start();
}

class car implements vehicle {

    @Override
    public void start() {
        System.out.println("car is getting started");
    }
}

class bike implements vehicle {
    @Override
    public void start() {
        System.out.println("bike is getting started");
    }
}

class vehicleFactory {

    public static vehicle getVehicle(String type) {

        vehicle v;
        if (type.equals("car")) {
            v = new car();
            return v;
        } else if (type.equals("bike")) {
            v = new bike();
            return v;
        }
        return null;
    }
}

public class factoryDesignPattern {

    public static void main(String args[]) {

        vehicle car = vehicleFactory.getVehicle("car");
        car.start();
        vehicle bike = vehicleFactory.getVehicle("bike");
        bike.start();
    }

}
