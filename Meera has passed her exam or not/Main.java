#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
      {
        cin>>arr[i];
      }
      int no,non;
      cin>>no;
      for(int i =0;i<n;i++)
      {
        if(no==arr[i])
         non=arr[i];
         
      }
      if(no==non)
        {
            
          cout<<"She passed her exam";
        }
      else{
      cout<<"She failed";
        
      }
          
}
