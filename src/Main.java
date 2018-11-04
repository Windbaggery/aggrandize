
public class Main {

	public static void main(String[] args) {
		
		Greeting engGreeting= new EnglishGreeting();
		Greeting itGreeting= new ItalianGreeting();


		Command command = new SayGoodMorning(engGreeting);
		Command command2 = new SayHello(engGreeting);
		Command command3 = new SayBye(engGreeting);
		
		
		command.execute();
		command2.execute();
		command3.execute();
		
		

	}

}
