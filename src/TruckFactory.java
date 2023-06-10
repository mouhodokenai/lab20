public class TruckFactory extends TransportationFactory{
    public Transportation createTransport() {
        return new Truck();
    }
}
