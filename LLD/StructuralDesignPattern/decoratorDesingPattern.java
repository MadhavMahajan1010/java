package StructuralDesignPattern;

/* extending functionlaity without modifying the existing code */
interface Coffee {

    public void addMilk(Integer quantity);

    public void addSugar(Integer spoons);

    public void addCream(Integer quantity);

    public void addCoffee(Integer shots);
}

class espresso implements Coffee {

    Integer milk;
    Integer sugar;
    Integer cream;
    Integer coffeeShots;

    espresso() {
        this.milk = 0;
        this.cream = 0;
        this.sugar = 0;
        this.coffeeShots = 0;
    }

    @Override
    public void addMilk(Integer quantity) {
        this.milk = this.milk + quantity;
    }

    public void addSugar(Integer sugar) {
        this.sugar = this.sugar + sugar;
    }

    public void addCoffee(Integer shots) {
        this.coffeeShots = this.coffeeShots + shots;
    }

    public void addCream(Integer cream) {
        this.cream = this.cream + cream;
    }
}
/*
 * similary you can implement latte and cappachino classes and define their
 * function respectively
 */
// class cappichino implements coffee{

// }

// class latte implements coffee{

// }
public class decoratorDesingPattern {
    public static void main(String[] args) {

    }
}
