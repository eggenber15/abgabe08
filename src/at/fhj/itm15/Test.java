package at.fhj.itm15;

public class Test {

	public static void main(String[] args) {
		
		StringStack st1 = new StringStack(5);
		StringStack st2 = new StringStack(10);
		
		System.out.println("Stack 1 leer: " + st1.isEmpty());
		System.out.println("Stack 2 leer: " + st2.isEmpty());
		
		st1.push("dem Stack! :-)");
		st1.push("und komme aus");
		st1.push("Daniel");
		st1.push("Ich heiße ");
		st1.push("Hallo,");
		st1.push("Hallo,");
		
		System.out.println("Stack 1 leer: " + st1.isEmpty());
		
		System.out.println();
		
		st2.push("kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
		st2.push("erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita ");
		st2.push("sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam");
		st2.push("takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur");
		st2.push("At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea");
		st2.push("nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.");
		st2.push("Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam");
		st2.push("et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est");
		st2.push("invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam");
		st2.push("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor");
		
		System.out.println("Stack 2 leer: " + st2.isEmpty());
		
		
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		
		System.out.println("Stack 1 leer: " + st1.isEmpty());
		
		System.out.println();
		
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		System.out.println(st2.pop());
		
		System.out.println("Stack 2 leer: " + st2.isEmpty());
		
	}

}
