#include<stdio.h>
#include<conio.h>
void main()
{
int m,n,i;
printf("\nenter the starting limits");
scanf("%d",&m);
printf("\nenter the ending limits");
scanf("%d",&n);
for(i=m;i<=n;i++)
{
    if(i%2==0)

    printf("\n%d",i);
}
  getch();
}
