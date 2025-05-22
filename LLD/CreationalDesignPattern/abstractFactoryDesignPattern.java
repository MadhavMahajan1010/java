package CreationalDesignPattern;

interface vehicle {
    void start();
    void stop();
}

class honda implements vehicle {
    @Override
    public void stop() {
        System.out.println("honda vehicle is stopped");
    }

    public void start() {
        System.out.println("honda is starting");
    }
}

class toyota implements vehicle {
    @Override
    public void stop() {
        System.out.println("toyota vehicle is stopped");
    }

    public void start() {
        System.out.println("toyota is starting");

    }
}

class bmw implements vehicle {
    @Override
    public void stop() {
        System.out.println("bmw vehicle is stopped");
    }

    public void start() {
        System.out.println("bmw is starting");

    }
}

interface vehicleFactory {
    vehicle getVehicle();
}

class hondafactory implements vehicleFactory {
    @Override
    public vehicle getVehicle() {
        return new honda();
    }
}

class toyotaFactory implements vehicleFactory {
    @Override
    public vehicle getVehicle() {
        return new toyota();
    }
}

class bmwFactory implements vehicleFactory {
    @Override
    public vehicle getVehicle() {
        return new bmw();
    }
}

public class abstractFactoryDesignPattern {

    public static void main(String[] args) {
        vehicleFactory hondaFactory = new hondafactory();
        vehicle honda = hondaFactory.getVehicle();
        honda.start();
        honda.stop();
    }

}
