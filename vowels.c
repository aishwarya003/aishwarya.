#include<stdio.h>
#include<conio.h>
void main()
{
char i,j,w;
printf("\nenter a character");
scanf("%c",&w);
i=(w=='a'||w=='e'||w=='i'||w=='o'||w=='u');
j=(w=='A'||w=='E'||w=='I'||w=='O'||w=='U');
if(i||j)
{

printf("\nVOWELS");
}
else
printf("\nNOT A VOWELS");
getch();
}
