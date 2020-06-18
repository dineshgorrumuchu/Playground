#include<iostream>
using namespace std ;
int power(int a,int n)
{
    if(n<1)
    return 1;
    else
    return a*power(a,n-1);
}
int main()
{
    int a,n;
    cin>>a>>n;
    power(a,n);
  cout<<"Enter the value of a";
  cout<<"\nEnter the value of n";
    
    cout<<"\nThe value of "<<a<< " power "<<n<< " is "<<power(a,n);
}