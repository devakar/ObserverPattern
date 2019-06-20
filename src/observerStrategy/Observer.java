package observerStrategy;

public class Observer implements ObserverInterface {
	private Subject subject;
	
	@Override
	public void update() {
		int orderStatus=subject.getOrderStatus();
		System.out.println("The order status is : "+orderStatus);
	}
	
	public void subscribe(Subject subject) {
		this.subject=subject;
	}
}
