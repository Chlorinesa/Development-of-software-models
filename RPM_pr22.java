interface PowerSocket380V{
    void insert380V();
    void pullout380V();
}
class Chargerfor380V implements PowerSocket380V{
    public void insert380V() {
        System.out.println("Charger380 insert into powerSocket380V");
    }
    public void pullout380V() {
        System.out.println("Charger380 pull out powerSocket380V");
    }
}
class CentralProcessor{
    private PowerSocket380V powerSocket;
    public CentralProcessor(PowerSocket380V powerSocket){
        this.powerSocket = powerSocket;
    }
    public void work(){
        powerSocket.insert380V();
        powerSocket.pullout380V();
    }
}
interface PowerSocket220V{
    void insert220V();
    void pullout220V();
}
class Chargerfor220V implements PowerSocket220V{
    public void insert220V() {
        System.out.println("Charger220 insert into powerSocket380V");
    }
    public void pullout220V() {
        System.out.println("Charger220 pull out powerSocket380V");
    }
}
class PowerSocketAdapter implements PowerSocket380V{
    PowerSocket220V powerSocket220V;
    public PowerSocketAdapter(PowerSocket220V powerSocket220V){
        this.powerSocket220V = powerSocket220V;
    }
    public void insert380V() {
        powerSocket220V.insert220V();
    }
    public void pullout380V() {
        powerSocket220V.pullout220V();
    }
}
public class Main {
    public static void main(String[] args) {
        PowerSocket380V chargerfor380V = new Chargerfor380V();
        CentralProcessor cpfor380V = new CentralProcessor(chargerfor380V);
        cpfor380V.work();
        PowerSocketAdapter chargerfor220V = new PowerSocketAdapter(new Chargerfor220V());
        CentralProcessor cpfor220V = new CentralProcessor(chargerfor220V);
        cpfor220V.work();
    }
}