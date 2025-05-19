//  exmaple of proper/good code
class bakeGoods {
    void bakeGoods() {
        System.out.println("bake goods");
    }
}

class manageAccount {
    void manageAccount() {
        System.out.println("manage account");
    }
}

class manageInvetory {
    void manageInvetory() {
        System.out.println("manage Inventory");
    }
}

// single response principe
// example for bad code where a sigle class is performing multiple tasks instead
// of a single class we should have an
// individual class for each functionlaity so that changes in one doesnt affect
// the functioning of the other code and
// more readable, maintainable and clean code
class restaurant {

    void bakeGoods() {
        System.out.println("bake goods");
    }

    void manageInvetory() {
        System.out.println("manage inventory");
    }

    void manageAccount() {
        System.out.println("manage expenses");

    }
}

// open closed principle the classes/function/modules should be open for
// extension and closed for modification
/*
 * now if we want to add other shapes as well then instead of writing them in
 * the same class and creating separate
 * functions we should create and abstract class or intefrace for the area and
 * create separate class for each of then shapes
 * and then calculate the area inside those classes so that the current code
 * doesnt gets affected and readablitiy and modularity is maintained
 * also the current unit test cases dont fail
 */

abstract class area {
    abstract Integer calculateArea();
}

class square extends area {
    public Integer side;

    @Override
    Integer calculateArea() {
        return side * side;
    }

}

class circle extends area {
    public double radius;

    @Override
    Integer calculateArea() {
        return (int) (3.14 * radius * radius);
    }

}

class calculateArea {
    public Integer side;

    Integer areaofSquare() {
        return side * side;
    }
}

// liskov substituion principle
// the child class should be seamlessly able to replace the parent class

interface vehicle {
    public void startEngine();
}

class engineVehicle implements vehicle {
    @Override
    public void startEngine() {

    }
}

class nonEngineVehicle implements vehicle {
    @Override
    public void startEngine() {

    }
}

class car extends engineVehicle {

}

class cycle extends nonEngineVehicle {

}
// class car implements vehicle {
// @Override
// public void startEngine() {
// System.out.println("the car engine has started");
// }
// }

// class cycle implements vehicle{
// @Override
// public void startEngine(){
// System.out.println("error");
// }
// }

// interface segregation principle
/*
 * should not have a single interface with multiple functionalities create
 * separate interfaces for these fucntionalities
 * code becomes long uneccessarily and ilegible
 */

// dependency inversion principle 
/* the classes should not depend upon concrete methods instead they should depend upon abstract classes
 * facilitates better testing and maintainability and decoupling
 * reduces coupling
 */

// YAGNI you arent gonna need it
/* focus on meeting and implementing the current functionalities and not overthinking about the future requirements 
 * and uneccesaarily over complicating it, prevents over enngineering
 */

// dry do not repeat yourself and kiss keep it simple stupid
public class solidpriciples {

    public static void main(String[] args) {

        restaurant r = new restaurant();
        r.manageAccount();
        r.bakeGoods();
        r.manageInvetory();
    }
}
