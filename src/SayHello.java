
public class SayHello implements Command{
	
	private Greeting greeting;
	
	public SayHello(Greeting greeting) {
		this.greeting=greeting;
	}
	
	@Override
	public void execute() {

		this.greeting.SayHello();
		
	}
	


}
