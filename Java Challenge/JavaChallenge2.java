package week2.day2;

public class JavaChallenge2 {
	public static int floorSqrt(int n) {
		int res= 1;
		while(res * res <= n) {
			res++;
		}
		return res-1;
	}

	public static void main(String[] args) {
	int n = 8;
	System.out.println(floorSqrt(n));

	}

}
