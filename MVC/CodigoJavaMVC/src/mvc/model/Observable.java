
package mvc.model;

import mvc.view.Observer;


public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
