#include<iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;
int main()
{ int i,c=0,c1=0;
 char arr1[50],arr2[50];
  std::cin.getline(arr1,50);
   std::cin.getline(arr2,50);
  
  for(int i=0;arr1[i]!='\0';i++)
  {
    c=c+1;
  }
 
  for(int i=0;i<c;i++)
  {
    
    
  if(arr1[i]==arr2[c-i-1])
  {
    c1=c1+1;
    
  }
 else
 {
   cout<<"It is wrong";
   break;
 }
  }
  
    if(c==c1)
    cout<<"It is correct";

}
  
