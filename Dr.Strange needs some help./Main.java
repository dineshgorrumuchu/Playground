#include<iostream>
using namespace std;
int fun(int,int);

int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int s=fun(m,n);
  //cout<<s;
  if(req<=s)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int fun(int a,int b)
{ int sum=1;
  for(int i=1;i<=b;i++)
  {
    sum=sum*a;
    
  }
  return sum;
 
}
     
    
    
  