#include<iostream>
using namespace std;
void eoro(int n,int *a)
{ int e=0,o=0;
  for(int  i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      e=e+1;
    }
    else
    {
      o=o+1;
    }
  }
    if(e==n)
      cout<<"\nThe array is Even";
    else if(o==n)
      cout<<"\nThe array is Odd";
    else
      cout<<"\nThe array is Mixed";
  
}
      
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int arr[20];
  cout<<"\nEnter the elements in the array";
  for( int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  eoro(n,arr);
}