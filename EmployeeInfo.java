package Myapplication;
public class EmployeeInfo extends BankAccDetails implements EmployeeInterface {
            String ename;
            int eno;
            double sal;
            public void Employeeinfo(String ename,int eno,double sal) {
            	this.ename=ename; this.eno=eno;
            	this.sal=sal;
            }
            
            public void employeeDetails() {
            	System.out.println("Name:"+ename);
            	System.out.println("Emp ID:"+eno);
            	            }
            public void employeeAddress(String Address) {
            	System.out.println("Address:"+Address);

            }
            public void details(){
        		System.out.println("Salary:"+sal);	}
           public void AccDetails() {
            	System.out.println("Bank Employee");
            }
            public void show() {
            	System.out.println("These are the End of Details");
            }
            public static void main(String args[]) {
            	try {
            	    new BankRbi();
            		EmployeeInfo ei=new EmployeeInfo();
            		ei.Employeeinfo("Ankitha",1234,25000);
            		ei.employeeDetails();
                ei.employeeAddress("Ongole");
            		new BankRbi();	
            		ei.AccDetails();
            		ei.details();
            		BankRbi.getBankDetails();
            		new BankRbi(2300,4.5,5);
            		ei.show();
            	}
            	catch(Exception e) {
            		System.out.println("I can Handle"+e);
            	}
            }
}

