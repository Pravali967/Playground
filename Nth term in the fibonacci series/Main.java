#include<stdio.h>
int main()
{
  //Type your code here
  int n,i;
  scanf("%d",&n);
  if(n==1)
  {
    printf("1");
  }
 else if(n==2)
 {
   printf("2");
 }
  else
  {
    int t1=1,t2=2,nth_term;
    for(i=3;i<=n;i++)
    {
      nth_term=t1+t2;
      t1=t2;
      t2=nth_term;
    }
    printf("%d",nth_term);
  }
  return 0;
}