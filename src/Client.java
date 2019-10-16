public class Client {
    public static void main(String[] args) {
        Vehicule vehicule1 = new Car(new Produce(), new Assemble());
        vehicule1.manufacture();

        Vehicule vehicule2 = new Bike(new Produce(), new Assemble());
        vehicule2.manufacture();

    }
}
