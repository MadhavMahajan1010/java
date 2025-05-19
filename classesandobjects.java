class movie {

    public String title;
    public Integer duration;

    // parametrized constructor
    public movie(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    // copy constructor
    public movie(movie other) {
        this.title = other.title;
        this.duration = other.duration;
    }

    public void displayDetails() {
        System.out.println("name: " + this.title + ", duraton: " + this.duration);
    }

};

class vehicle {

    public String name;
    public String color;
    public Integer tyres;

    // vehicle(String name, Integer tyres, String color) {
    // this.color = color;
    // this.tyres = tyres;
    // this.name=name;
    // }

    // operator overloading example of static or compile time polymorphism

    public void start(vehicle v) {
        System.out.println("first definition");
    }

    public void start(vehicle v, Integer tyres) {
        System.out.println("second definition");
    }
};

// example of method overriding of dynamic or run time polymorphism

class car extends vehicle {
    @Override
    public void start(vehicle v) {
        System.out.println("this is an object of car");
    }
}

class bike extends vehicle {
    @Override
    public void start(vehicle v) {
        System.out.println("this is an object of bike");

    }
}

class truck extends vehicle {
    @Override
    public void start(vehicle v) {
        System.out.println("this is an object of truck");

    }
}

// inheritance is-a relation
// class animal {

// void display() {
// System.out.println("this is animal object");
// }
// }

// single level inheritance
// class mammal extends animal {
// void display() {
// System.out.println("this is mammal object");
// }
// }

// // multilevel inheritance
// class dog extends mammal {
// void display() {
// System.out.println("this is dog object");
// }
// }

// class cat extends animal {
// void display() {
// System.out.println("this is cat object");
// }
// }

// java doesn't support multiple inheritance

interface lion {
    void sound();
}

interface tiger {
    void sound();
}

class liger implements tiger, lion {
    public void sound() {
        System.out.println();
    }
}

// interface dog {
// public void sound();
// }

// interface cat {
// public void walk();
// }

// can implement multiple classes but extend only one class
// class hybrid extends animal implements dog, cat {
// @Override
// public void walk() {
// System.out.println("walking");
// }

// @Override
// public void sound() {
// System.out.println("barking");
// }
// }

// encapsulation
// data hiding we are restricting access to certain data members directly for
// security and integrity purposes
// in order to access the private data members we use getters and for valid
// updation we use setters; provides flexibility to the developers to change the
// restricted members without affected the external code
// data integrity we czn control how the user can modify and access the
// properties

class account {

    private String accountNumber;
    private Integer balance;
    private Integer transactionFee = 2;

    account(String accountNumber, Integer balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // getters

    Integer getBalance() {
        return this.balance;
    }

    // setters

    void deposit(Integer amount) {

        if (amount < 0) {
            return;
        } else {
            balance = balance + amount;
            System.out.println("balance: " + balance);
        }
    }

    void withdraw(Integer amount) {

        if (amount > balance) {
            return;
        } else {
            balance = balance - amount;
            balance = balance - transactionFee;
            System.out.println("balance: " + balance);
        }
    }
}

// abstraction

// abstract classes can't be initiated direclty they are made to be implmenented
// by other classes
abstract class animal {
    // abstract methods
    // we are just writing the function prototype/signature but not defining it here
    abstract void sleep();

    abstract void makeSound();

    // concrete methods
    // function definition along with signature
    void walk() {
        System.out.println("walking");
    }
}

class cat extends animal {
    @Override
    void sleep() {
        System.out.println("the cat is sleeping");
    }

    @Override
    void makeSound() {
        System.out.println("the cat is making sound meow meow");
    }
}

class dog extends animal {
    @Override
    void sleep() {
        System.out.println("the dog is sleeping");
    }

    @Override
    void makeSound() {
        System.out.println("the dog  is making sound woof woof");
    }
}

interface alien {
    void makeSound();
}

class swampFire implements alien {
    @Override
    public void makeSound() {
        System.out.println("Swamp Fire !!!");
    }
}

// generics

class temp<T> {

    T obj;

    temp(T obj) {
        this.obj = obj;
    }

    void displayData() {
        System.out.println(this.obj);
    }
}

public class classesandobjects {

    public static <T> void display(T value) {
        System.out.println("value is " + value);
    }

    public static void main(String[] args) {

        movie movie = new movie("inception", 148);
        // movie.displayDetails();

        movie movie2 = new movie(movie);
        // movie2.displayDetails();
        movie2.duration = 137;

        // vehicle v1 = new vehicle("scooter", 2, "black");
        // v1.start(v1);
        // v1.start(v1, v1.tyres);
        // movie2.displayDetails();
        // movie.displayDetails();

        vehicle v;
        v = new car();
        v.start(v);
        v = new bike();
        v.start(v);
        v = new truck();
        v.start(v);

        // animal a = new animal();
        // a.display();
        // a = new dog();
        // a.display();
        // // a = new mammal();
        // a.display();
        // hybrid h = new hybrid();
        // h.sound();
        // h.walk();

        account a = new account("1234", 1000);
        System.out.println(a.getBalance());
        a.deposit(2000);
        a.withdraw(500);
        System.out.println(a.getBalance());

        dog d = new dog();
        cat c = new cat();
        d.sleep();
        d.walk();
        c.sleep();
        c.walk();
        d.makeSound();
        c.makeSound();
        display(20);
        display("madhav");
        display(0.2);
        temp t = new temp<Integer>(20);
        t.displayData();
        t = new temp<String>("madhav");
        t.displayData();
    }

}

// types of relationships

/*
 * inheritance is an is-a relationship
 * association is when there are 2 classes and one class an object of the other
 * class as its data member/property
 * based on this whether these 2 classes can exist independently or not we have
 * aggregation and composition
 * if they can exist independently it is called aggregation else composition
 * dependency is when a class has a member function which uses another class's
 * object as an argument
 * realization is when a class implements an interface
 */
