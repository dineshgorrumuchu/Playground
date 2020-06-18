#include<iostream>
#include<math.h>
using namespace std;
struct sum{
  int in;float f;
};
int main()
{ sum s[2];
 float d=0;
 for(int i=0;i<2;i++)
 {
   cin>>s[i].in;
   cin>>s[i].f;
 }
 for(int i=0;i<2;i++)
 {
   s[i].in=s[i].in+s[i+1].in;
   s[i].f=s[i].f+s[i+1].f;
 }
 if(s[0].f>=12.0)
 {
 s[0].f=(s[0].f-12.0);
   
   s[0].in=1+s[0].in;
 
 cout<<s[0].in<<"'"<<"-"<<s[0].f<<"\"";
 }
 else
   cout<<s[0].in<<"'"<<"-"<<s[0].f<<"\"";
}
 
  
