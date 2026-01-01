package javaprograms;

import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {
	ArrayList<String> at=new ArrayList<String>();
	at.add("suhani");
	at.add("shital");
	at.add("sharad");
	at.add("swapnil");
	at.add(null);
	System.out.print(at);
	at.remove(1);
	System.out.println(at);
	System.out.println(at.size());
	at.set(0,"dragon");
	System.out.println(at);
	System.out.println(at.get(0));
	}

}
