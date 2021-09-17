package mattress_command_design;

public class BuyMattress implements Order {
	private Mattress mattress;
	public BuyMattress(Mattress matt) {
		this.mattress = matt;
	}
	
	public void execute() {
		mattress.buy();
	}
}
