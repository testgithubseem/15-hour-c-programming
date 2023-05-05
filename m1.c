/*program to perform basic input output operations in c programming*/
#include<stdio.h>
#include<conio.h>
int main()
{
	int a,b,sum;
	printf("enter integers to add\n");
	/*taking formatted input from user*/
	scanf("%d %d",&a,&b);
	sum=a+b;
	/*printing formatted output */
	printf("%d+%d=%d",a,b,sum);
	getch();
	return 0;
}
