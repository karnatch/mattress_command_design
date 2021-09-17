package mattress_command_design;

public class SellMattress implements Order{
	private Mattress mattress;
	
	public SellMattress(Mattress matt) {
		this.mattress = matt;
	}
	
	public void execute() {
		mattress.sell();
	}
}
