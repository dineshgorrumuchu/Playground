#include<iostream>
using namespace std;
int fib(int n)
{
       if(n<=1)
         return n;
  else return fib(n-1)+fib(n-2);
     
  
}   
  
    
int main()
{
  int n;
  cin>>n;
  fib(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
}