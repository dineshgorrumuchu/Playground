#include<iostream>
using namespace std;
int gcd(int a,int b)
{ if(b!=0)
gcd(b,a%b);
else return a;
}
int main()
{ int a,b;
 cin>>a>>b;
 gcd(a,b);
   cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
  //Type your code here.
}