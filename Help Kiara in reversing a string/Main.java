#include<iostream>
#include<string>
using namespace std;
int main() 
{ char arr[100];
 int i=0;
 int c=0;
 std::cin.getline(arr,100);
 for(i=0;arr[i]!='\0';i++)
   c=c+1;
 for(i=c-1;i>=0;i--)
   cout<<arr[i];
}
 
 
  
