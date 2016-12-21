#include<stdio.h>
#include<conio.h>
void main()
{
int n;
printf("\nenter year");
scanf("%d",&n);
if((n%400==0)||(n%100!=0)&&(n%4==0))
  printf("\nLeap year");
  else
  printf("\nNon leap year");
}
