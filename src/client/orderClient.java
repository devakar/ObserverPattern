package client;

import observerStrategy.Observer;
import observerStrategy.ObserverInterface;
import observerStrategy.Subject;
import observerStrategy.SubjectInterface;

public class orderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s = new Subject();
		
		Observer o1 = new Observer();
		Observer o2 = new Observer();
		Observer o3 = new Observer();
		
		s.addObserver(o1);
		s.addObserver(o2);
		s.addObserver(o3);
		
		o1.subscribe(s);
		o2.subscribe(s);
		o3.subscribe(s);
		
		s.sendNotification();
		
		s.setOrderStatus(1);
		
		s.sendNotification();
	}

}
