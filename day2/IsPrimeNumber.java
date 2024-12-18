package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =44;
boolean flag = false;
if(num==0 || num==1) {
	flag = true;
}
for(int i=2; i<=num/2; i++) {
	if(num %i ==0) {
		flag=true;
		break;
	}
}
if(!flag) {
	System.out.println(num +" Is a PrimeNumber");
}
else {
	System.out.println(num +" Is not a PrimeNumber");
}
	}

}
