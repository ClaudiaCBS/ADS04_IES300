
package observer;


public interface IObservavel {
    public void addObserver(IObserver observer);
    public void removeObserver( IObserver observer);
    public void notifyObserver();
    
}
