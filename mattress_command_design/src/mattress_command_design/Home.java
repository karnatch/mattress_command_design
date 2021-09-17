package mattress_command_design;

public class Home {
	public static void main(String[] args) {
		Mattress matt = new Mattress();
		BuyMattress buyMatt = new BuyMattress(matt);
		SellMattress sellMatt = new SellMattress(matt);
		Dealer D = new Dealer();
		D.addOrder(buyMatt);
		D.addOrder(sellMatt);
		D.finishOrder();
	}
}
