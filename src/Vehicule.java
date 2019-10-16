public abstract class Vehicule {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    public Vehicule(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}

class Car extends Vehicule {

    public Car(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car ");
        workShop1.work();
        workShop2.work();
    }
}

class Bike extends Vehicule {

    public Bike(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike ");
        workShop1.work();
        workShop2.work();
    }
}
