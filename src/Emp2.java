
import java.util.Scanner;
public class Emp2{
// static int count=0;
	
	public static void main(String[] args){
	int i;
        int a,b,c;
        Scanner sc=new Scanner(System.in);
	
	
	      for (i=1;i<5;i++)
                {
       
	 
		

	System.out.println("Enter your firstname");
        String firstName=sc.next();
	
	System.out.println("Enter your lastname");
        String lastName=sc.next();

        System.out.println("Enter your salary");
        int salary=sc.nextInt();

	System.out.println("Enter your grade");
        char grade=sc.next().charAt(0);

	System.out.println("Enter your date of joining");
        a=sc.nextInt();
        System.out.println("Enter your month of joining");
        b=sc.nextInt();
        System.out.println("Enter your year of joining");
        c=sc.nextInt();
         Emp e = null; 
         Date d = new Date(a,b,c);
         e = new Emp(firstName, lastName, salary, grade,d);
      
      
        e.displayDetails();
       e.getInvoices();
	
 }
	
         
        
 
	System.out.println("No.of employees created are:"+ Emp.count);	
		
		


              
        	
	}
}