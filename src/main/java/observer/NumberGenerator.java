package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // observer.Observer 를 저장
    private List<Observer> observers = new ArrayList<>();

    // observer.Observer 를 추가
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //observer.Observer 를 제거
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // observer.Observer 에 통지
    public void notifyObserver() {
        for (Observer o :
                observers) {
            o.update(this);
        }
    }

    // 수 취득
    public abstract int getNumber();

    // 수 생성
    public abstract void execute();
}
