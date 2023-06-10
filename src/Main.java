
public class Main {
    public static void main(String[] args) {

        TruckFactory truckTransport = new TruckFactory();
        Transportation truck = truckTransport.createTransport();
        ShipFactory shipTransport = new ShipFactory();
        Transportation ship = shipTransport.createTransport();
        PlaneFactory planeTransport = new PlaneFactory();
        Transportation plane = planeTransport.createTransport();

        truck.trans();
        ship.trans();
        plane.trans();
    }
}