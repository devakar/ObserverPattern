package observerStrategy;

public interface SubjectInterface {
	void addObserver(ObserverInterface o);
	void sendNotification();
}
