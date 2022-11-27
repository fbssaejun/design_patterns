package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

  private List<Observer> observers;
  private String message;
  private boolean changed;

  public MyTopic() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void register(Observer obj) {
    if (obj == null) {
      throw new NullPointerException("Null Observer");
    }
    if (!observers.contains(obj)) {
      observers.add(obj);
    }
    obj.setSubject(this);
  }

  @Override
  public void unregister(Observer obj) {
    observers.remove(obj);
  }

  @Override
  public void notifyObservers() {
    List<Observer> observersLocal = null;
    if (!changed) {
      return;
    }
    observersLocal = new ArrayList<>(this.observers);

    for (Observer obj : observersLocal) {
      obj.update("updated!");
    }
    this.changed = false;
  }

  @Override
  public Object getUpdate(Observer obj) {
    return this.message;
  }

  // method to post message to the topic
  public void postMessage(String msg) {
    System.out.println("Message Posted to Topic:" + msg);
    this.message = msg;
    this.changed = true;
    notifyObservers();
  }
}
