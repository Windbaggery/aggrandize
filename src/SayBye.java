
public class SayBye implements Command {
	
	private Greeting greeting;
	
	public SayBye(Greeting greeting) {
		this.greeting=greeting;
	}
	
	@Override
	public void execute() {

		this.greeting.SayBye();
		
	}

}
