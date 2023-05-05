/*nested while looping*/
#include<stdio.h>
int main()
{
	int i,n,val;
	printf("enter a number");
	scanf("%d",&n);
	i=1;
	while(i<=n)
	{
		printf("/n");
		val=1;
		while(val<=1)
		{
			printf("%d",val);
			val=val+1;
		}
		i=i+1;
	}
	return 0;
		}	

