#include<iostream>
using namespace std;
int main()
{
  string s;
  std::getline(std::cin,s);
  s.erase(7,4);
  s.erase(21,4);
    cout<<s;
}