package sample;
import java.util.*;
public class ArmstrongNumberBetweenTwoIntervals {
public static void main(String[] args){
	int a,b;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("The armstrong numbers between"+a+" are "+b);
	print(a,b);
	s.close();
}
public static boolean isArmstrong(int num){
	int temp,i,j=0;
	temp=num;
	while(temp!=0){
		i=temp%10;
		j+=i*i*i;
		temp/=10;
	}
	if(temp==j){
		return true;
	}
	else{
		return false;
	}
}
public static void print(int a,int b){
	
	while(a<=b){
		if(isArmstrong(a)){
	
		System.out.println(a);
		}
		a++;
	}
}
}

