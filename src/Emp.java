

public class Emp{
     private int empid;
private	String firstName;
private	String lastName; 
private	int salary;
private	char grade;
static int count=0;
public static int getCount() {
	return count;
}

private Date joiningDate;


public Emp(String fn,String ln,int sal, char grd, Date joiningDate ){

	this.firstName=fn;
	this.lastName=ln;
	this.salary=sal;
	this.grade=grd;
	this.joiningDate=joiningDate;
    count++;
empid = count;    

}



public void displayDetails(){

	System.out.println("empid:" +Emp.count);
	System.out.println("Firstname: "+firstName);
	System.out.println("lastName: "+lastName);
	System.out.println("salary: " +salary);
	System.out.println("grade: "+grade);
	System.out.println("Joining Date" + joiningDate);
 
	
}
public Invoice[] getInvoices(){
	return null;
}
class Invoice{
}
}	