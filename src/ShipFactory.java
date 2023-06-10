public class ShipFactory extends TransportationFactory {
    public Transportation createTransport() {
        return new Ship();
    }
}
