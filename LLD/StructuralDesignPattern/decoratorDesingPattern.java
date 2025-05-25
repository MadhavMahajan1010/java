package StructuralDesignPattern;

/* extending functionlaity without modifying the existing code */
/* traditional approach to implement a coffeeshop which makes different varieties of coffee */
// interface Coffee {

//     public void addMilk(Integer quantity);

//     public void addSugar(Integer spoons);

//     public void addCream(Integer quantity);

//     public void addCoffee(Integer shots);
// }

// class espresso implements Coffee {

//     Integer milk;
//     Integer sugar;
//     Integer cream;
//     Integer coffeeShots;

//     espresso() {
//         this.milk = 0;
//         this.cream = 0;
//         this.sugar = 0;
//         this.coffeeShots = 0;
//     }

//     @Override
//     public void addMilk(Integer quantity) {
//         this.milk = this.milk + quantity;
//     }

//     public void addSugar(Integer sugar) {
//         this.sugar = this.sugar + sugar;
//     }

//     public void addCoffee(Integer shots) {
//         this.coffeeShots = this.coffeeShots + shots;
//     }

//     public void addCream(Integer cream) {
//         this.cream = this.cream + cream;
//     }
// }
/*
 * similary you can implement latte and cappachino classes and define their
 * function respectively
 */
// class cappichino implements coffee{

// }

// class latte implements coffee{

// }

interface Coffee {
    public String getDescription();

    public double getCost();

}

class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    public double getCost() {
        return 2.0;
    }
}

class Cappuchino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuchino";
    }

    public double getCost() {
        return 2.0;
    }
}

class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Latte";
    }

    public double getCost() {
        return 2.0;
    }
}
/*
 * you can do layering using decorator design pattern as well like you can add
 * cream over sugar over espresso milk coffee
 */

abstract class CoffeeDecorator implements Coffee {

    Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    public double getCost() {
        return this.coffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Milk: " + this.coffee.getDescription();
    }

    public double getCost() {
        return this.coffee.getCost() + 2.0;
    }

}

class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return "Sugar: " + this.coffee.getDescription();
    }

    public double getCost() {
        return this.coffee.getCost() + 1.0;
    }

}

public class decoratorDesingPattern {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());  
        System.out.println("Total Cost: $" + coffee.getCost());
    }
}

/* advantages are same as previous all design patterns like readable, maintainable, modular, scalable and flexible code 
 * obeys open closed principle i.e open for extension and closed for modification
 */
