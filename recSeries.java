/**
 * @author Koketso
 **/

import java.util.*;  

public class recSeries{
	public static void recSeries1(int a, int b, int n){
		System.out.printf("%d ", a + ((int)Math.pow(2, n))*b);
		if (n == 0){
			return;
		}

		 recSeries1(a,b,n);
	}

	
	public static void main(String[] args){
		try(Scanner input = new Scanner(System.in)){

			int q = input.nextInt();

			for (int i = 0; i < q; i++){
				int a = input.nextInt();
				int b = input.nextInt();
				int n = input.nextInt();

				recSeries1(a,b,n);
			}
	    }	
    }
}
