public class PlaneFactory extends TransportationFactory {
    public Transportation createTransport() {
        return new Plane();
    }
}
