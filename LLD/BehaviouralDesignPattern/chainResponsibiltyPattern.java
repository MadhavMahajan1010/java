/* used to pass a rquest from top to bottom following a herariechy */
package BehaviouralDesignPattern;

abstract class Approver {
    Approver nextApprover;
    Integer level;

    abstract public void setNextApprover(Approver approver);

    abstract public void approveLeave(Integer leaves);
}

class Supervisor extends Approver {
    String name;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public void approveLeave(Integer leaves) {
        if (leaves <= 3) {
            System.out.println("leave is approved by the supervisor");
        } else if (this.nextApprover == null) {
            System.out.println("leaved denied");
        } else {
            this.nextApprover.approveLeave(leaves);
        }
    }

    Supervisor(String name) {
        this.name = name;
        this.level = 3;
    }

}

class Manager extends Approver {
    String name;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public void approveLeave(Integer leaves) {
        if (leaves <= 7) {
            System.out.println("leave is approved by the manager");
        } else if (this.nextApprover == null) {
            System.out.println("leave is denied");
        } else {
            this.nextApprover.approveLeave(leaves);
        }
    }

    Manager(String name) {
        this.name = name;
        this.level = 2;
    }

}

class Director extends Approver {
    String name;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public void approveLeave(Integer leaves) {
        if (leaves <= 14) {
            System.out.println("leave is approved by the director");
        } else {
            System.out.println("leave is denied");
        }
    }

    Director(String name) {
        this.name = name;
        this.level = 1;
    }

}

public class chainResponsibiltyPattern {

    public static void main(String[] args) {

        Approver manager = new Manager("madhav");
        Approver supervisor = new Supervisor("mohan");
        Approver director = new Director("shaam");
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        supervisor.approveLeave(2 );

    }
}
