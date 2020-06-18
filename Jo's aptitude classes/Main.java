#include<iostream>
using namespace std;
int small(int ,int,int);
int main()
{
  int a,b,c,d;
    int gcd=0;
  cin>>a>>b>>c>>d;
  int mall=small(a,b,c);
  
  
 

  while(mall>=1)
  {
    if(a%mall==0 && b%mall==0 && c%mall==0)
    {
      gcd=mall;
      break;
    }
    mall--;
  }
  if(gcd==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
int small(int a,int b,int c){ int mall;
  if(a<b && a<c)
  {
    mall=a;
  }
  else if(b<c)
  {
    mall=b;
  }
    else
    mall=c;
    return mall;
  }