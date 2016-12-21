#include<stdio.h>
#include<conio.h>
void main()
{
char a;
printf("\n enter a character");
scanf("%c",&a);
if(a>='a'&&a<='z'||a>='A'&&a<='Z')
     printf("\nyes character");
else
 printf("\n No character");
 getch();
}
