import java.util.ArrayList;
import java.util.List;

interface Notifier {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver(String notification);
}
interface Observer {
    void update( String groupName, String notification);
}

class User implements Observer {
    String user;
    public User(String user) {
        this.user = user;
    }
    @Override
    public void update( String group, String notification) {
        System.out.println(user + " получил от " + group + ": " + notification);
    }
}
class Group implements Notifier {
    private List observer = new ArrayList<>();
    String group;
    public Group(String group){
        this.group = group;
    }
    @Override
    public void addObserver(Observer obs) {observer.add(obs);
    }
    @Override
    public void removeObserver(Observer obs) {
        int i = observer.indexOf(obs);
        if(i>=0) observer.remove(i);
    }
    @Override
    public void notifyObserver(String notification) {
        for(int i = 0; i < observer.size(); i++) {
           Observer obs = (Observer) observer.get(i);
            obs.update(group, notification);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Group g1 = new Group("1 группы");
        Group g2 = new Group("2 группы");
        Group g3= new Group("3 группы");
        Group g4 = new Group("4 группы");
        Group g5 = new Group("5 группы");
        Group g6 = new Group("6 группы");
        Group g7 = new Group("7 группы");
        User u1 = new User("Пользователь 1");
        User u2 = new User("Пользователь 2");
        g1.addObserver(u1);
        g2.addObserver(u1);
        g3.addObserver(u1);
        g4.addObserver(u2);
        g5.addObserver(u2);
        g6.addObserver(u2);
        g7.addObserver(u2);
        g4.removeObserver(u2);
        g1.notifyObserver( "уведомление");
        g2.notifyObserver( "уведомление");
        g3.notifyObserver( "уведомление");
        g4.notifyObserver( "уведомление");
        g5.notifyObserver( "уведомление");
        g6.notifyObserver( "уведомление");
        g7.notifyObserver( "уведомление");
    }
}