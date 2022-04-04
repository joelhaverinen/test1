
public class CiExample {

	public static void main(String[] args) {
		System.out.println(new CiExample().sayHello());

	}
	// Jotta voidaan yksikkötestatata pitää koodi jakaa pieniin osiin esim alla sayHello
	public String sayHello() {
		return "Hello World";
	}

}
