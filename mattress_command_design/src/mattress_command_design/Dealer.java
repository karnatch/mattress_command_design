package mattress_command_design;

import java.util.ArrayList;
import java.util.List;
public class Dealer {
	private List<Order> orderList = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	public void finishOrder() {
		for(Order order: orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
