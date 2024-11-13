package storingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice(1 or 2):");
		int a =sc.nextInt();
		sc.close();
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(103,"Jhon"));
		al.add(new Employee(101,"Steve"));
		al.add(new Employee(102,"Alex"));
		
		switch(a) {
			case 1:Collections.sort(al,new EmployeeIdComparator()); 
			for(Employee e: al) {
				System.out.println(e);
			}
				
			break;
			case 2: Collections.sort(al,new EmplyoeeNameComparator());
			
			for(Employee e: al) {
				System.out.println(e);
			}
			break;
			default:
			System.out.println("Invalid Choice is Entered");
			
		}
		}
		
	}

