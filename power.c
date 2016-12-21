#include<stdio.h>
#include<conio.h>
void main()
{
int num,value,result;
printf("\nEnter the number");
scanf("%d",&num);
printf("\n enter the power ");
scanf("%d",&value);
result=pow(num,value);
printf("\nPower value is:%d",result);
}
