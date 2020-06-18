#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 string s1;
  string s2;
   
  std::getline(std::cin,s1);
  std::getline(std::cin,s2);
  
      if(s1!=s2)
  cout<<"It is wrong";
else
  cout<<"It is correct";
  
}