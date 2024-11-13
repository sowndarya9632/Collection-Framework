package interviewprograms;

import java.util.ArrayList;

public class Demo {		
	public static void main(String[] args) {

		ArrayList al = new ArrayList(); 
		al.add(10);      // l.add(new Integer(10));
		al.add(10.34);   // l.add(new Double(10.34));
		al.add("Java");  // l.add(new String("Java"));
		al.add(30);      //l.add(new Integer(30));

		for(Object obj:al) {

			if(obj instanceof Integer) {

				System.out.println(obj);
			}
		}
			
			System.out.println("----------------------");
			
		for(int i=0;i<al.size();i++) {
			if(al.get(i) instanceof Integer) {
				System.out.println(al.get(i));
			}
		}

	}

}
