package Myapplication;
public class Myapplication{
  static{
    System.out.println("----Bank Employee Details----");
  }
  public BankRbi(double p,double t, double r){
    System.out.println("Interest:"+((p*t*r)/100));
      }
  public BankRbi() {
		System.out.println("Home Loan and Personal Loan Details:");
	}
	public static final void getBankDetails() {
		  System.out.println("Home Laon Interest in 4%");
		  System.out.println("Personal loan Interset is 7%");
	  }
