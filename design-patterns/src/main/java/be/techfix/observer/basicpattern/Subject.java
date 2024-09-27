package be.techfix.observer.basicpattern;

public interface Subject {
    public void registerObserver(Displayer o);
    public void removeObserver(Displayer o);
    public void notifyObservers();
}
