#include<iostream>
#include<string>
using namespace std;
int main() 
{ int i;
  std::string s;
  std::getline(std::cin,s);
  for(std::string::reverse_iterator i=s.rbegin();i<s.rend();i++)
  {
    cout<<*i;
}
}