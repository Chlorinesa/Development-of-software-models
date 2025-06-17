import java.util.ArrayList;
import java.util.List;
abstract class Transport{
    String name;
    List<String> accessiries = new ArrayList<>();
    public String toString(){
        return "Transport model: " + name + accessiries;
    }
}
abstract  class TransportFactory{
    public abstract Transport createTransport();
}

class TruckFactory extends TransportFactory{
    public Transport createTransport(){
        return new Truck();
    }
}
class ShipFactory extends TransportFactory{
    public Transport createTransport(){
        return new Ship();
    }
}
class PlaneFactory extends TransportFactory{
    public Transport createTransport(){
        return new Plane();
    }
}
class Truck extends Transport{
    public Truck(){
        name = "Truck";
        accessiries.add("transportation by road");
    }
}
class Ship extends Transport{
    public Ship(){
        name = "Ship";
        accessiries.add("transportation by sea");
    }
}
class Plane extends Transport{
    public Plane(){
        name = "Plane";
        accessiries.add("transportation by air");
    }
}
public class Main {
    public static void main(String[] args) {
        TransportFactory TFtruck = new TruckFactory();
        TransportFactory TFship = new ShipFactory();
        TransportFactory TFplane = new PlaneFactory();
        Transport truck = TFtruck.createTransport();
        Transport ship = TFship.createTransport();
        Transport plane = TFplane.createTransport();
        System.out.println(truck);
        System.out.println(ship);
        System.out.println(plane);
    }
}