public interface Observable {
    public void subscribe(Observator observator);
    public void unsubscribe(Observator observator);
    public void notifyObserver();
}
