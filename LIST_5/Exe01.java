
import java.util.Scanner;
public class Exe01 {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
				
					System.out.print("Digite um numero : ");
				int  x = sc.nextInt();
				
				if( x  > 10){
					System.out.print("E maior que 10");
					}
		else{
			System.out.print("E menor que 10");
			}
	}
}

