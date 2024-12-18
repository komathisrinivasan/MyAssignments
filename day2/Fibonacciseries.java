package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 8, num1 = 0, num2=1;
System.out.println("Fibonacci Series :"+count+"numbers");
for(int i = 1; i<= count; i++) {
	System.out.println(num1+" ");
	int sumOfPrevTwo =num1+num2;
	num1=num2;
	num2=sumOfPrevTwo;
}
	}

}
