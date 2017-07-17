package logicpro;
import java.util.*;
public class Factorial {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int f=s.nextInt();
		int res=1;
		for(int i=f;i>0; i--){
			 res=res*i;
			
		}
		System.out.println(res);
	}
}
