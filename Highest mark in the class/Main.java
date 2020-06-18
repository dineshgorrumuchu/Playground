#include<iostream>
using namespace std;
int main()
{
  int n,i,hm=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
}
  for(i=0;i<n;i++)
  {
    if(hm<arr[i])
    {
      hm=arr[i];
    }
    else
      continue;
    
  }
  cout<<hm;
}