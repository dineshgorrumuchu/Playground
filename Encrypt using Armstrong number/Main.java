#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{int c,sum=0,temp,arm;
 temp=n;
 arm=n;
    while(temp!=0)
    {temp=temp/10;
     c=c+1;
    }
 for(int i=1;i<=c;i++)
     {
       temp=n%10;
       sum=sum+power(temp,c);
         n=n/10;
     }
    // std::cout<<sum;
     if(sum==arm)
     return 1;
 else
   return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}