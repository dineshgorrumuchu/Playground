#include<iostream>
using namespace std;
int main()
{
  char arr[50];
  int c=0,i;
  
  std::cin.getline(arr,50);
  for(int i=0;arr[i]!='\0';i++)
  {
    c=c+1;
  }
  
  cout<<"The number of letters in the name is "<<c;
}