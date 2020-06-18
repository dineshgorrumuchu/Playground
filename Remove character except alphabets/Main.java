#include<iostream>
#include<cstring>
using namespace std;
int main()
{int i,c=0;
  char s[200];
  int arr[200];
  std::cin.getline(s,200);
 
 for(i=0;s[i]!='\0';i++)
 {
   c=c+1;
     
 
 
 }
 
  
   
  for(i=0;i<c;i++)
  {
    if(isalpha(s[i]))
{
      cout<<s[i];
}
  }
    
  
}