#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,i;
printf("\nEnter the starting intervals");
scanf("%d",&a);
printf("\nEnter the ending intervals");
scanf("%d",&b);
for(i=a;i<=b;i++)

if(i%2==1)
printf("\n%d",i);
return 0;
}
