package uygulama;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject {

    private List<IObserver> aboneler=new ArrayList<>();

    public Publisher() {

    }

    public void attach(IObserver observer) {
        aboneler.add(observer);
    }

    public void detach(IObserver observer) {
        aboneler.remove(observer);
    }

    public void notify(String mesaj) {
        for(IObserver observer:aboneler){
            observer.update(mesaj);
        }
    }
}
