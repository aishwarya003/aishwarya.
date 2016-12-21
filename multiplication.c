#include<stdio.h>
#include<conio.h>
void main()
{
int m,n,k,a;
printf("\n Enter the table");
scanf("%d",&m);
printf("\nenter the limit");
scanf("%d",&n);
for(k=1;k<=n;k++)
{
 a=m*k;
 printf("\n%d*%d=%d",m,k,a);
}
 getch();
}
