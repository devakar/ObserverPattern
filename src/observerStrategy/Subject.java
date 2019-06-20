package observerStrategy;

import java.util.ArrayList;

public class Subject implements SubjectInterface {
	private ArrayList<ObserverInterface> observers;
	private int orderStatus;
	
	public Subject() {
		this.observers = new ArrayList<ObserverInterface>();
		this.orderStatus=0;
	}
	
	@Override
	public void addObserver(ObserverInterface o) {
		observers.add(o);
	};
	
	@Override
	public void sendNotification() {
		for (ObserverInterface o : observers) {
		      o.update();
		    }
	};
	
	public void setOrderStatus(int status) {
		this.orderStatus=status;
	}
	
	public int getOrderStatus() {
		return orderStatus;
	}
}
