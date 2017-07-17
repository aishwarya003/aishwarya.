package sample;
import java.util.*;
public class PrimeNumberBetweenIntervals {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		int temp=0;
		//while(a<b){
			//temp=0;
			for(int j=a;j<=b;++j){
				for(int i=2;i<=j/2;i++){
			
				if(j%i==0){
					temp=1;
					break;
				}
			}
				if(temp==0){
					System.out.println(j);
				}
				temp=0;
			}
		}
	}

