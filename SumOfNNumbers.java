package map;
import java.util.*;
public class SumOfNNumbers {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a;
	int sum=0;
	for(int i=0;i<n;i++){
		 a=s.nextInt();
		 sum+=a;
	}
	System.out.println(sum);
	s.close();
}
}
	
