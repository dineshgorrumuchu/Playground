#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  int i,c=0;
   char s[100];
  std::cin.getline(s,100);
  int l=strlen(s);
  for(i=0;i<l;i++)
  {
    if(s[i]==' ')
      c=c+1;
  }
  if(c<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}
   
