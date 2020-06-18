#include<iostream>
using namespace std;
int digit(int n)
{
    int temp=0,sum=0;
    if (n<1)
    return 0;
    else
    {
    while(n!=0)
       { temp=n%10;
       sum=sum+temp;
       
       n=n/10;
       } 
       if(sum<10)
       return sum;
       else
       {
      digit(sum);
       }
       
    }

    
    
}
int main()
{
    int n;
    cin>>n;
    digit(n);
    cout<<digit(n);
}