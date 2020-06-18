#include<iostream>
using namespace std;
int printresult(int *a,int n,int s)
{ int sum=0;
  for(int i=0;i<n;i++)
  {
    sum=a[i]+sum;
  }
if(sum<=s)
  cout<<"YES";
 else
   cout<<"NO";
} 
int main()
{
  int n,s;
  cin>>n>>s;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  printresult(arr,n,s);
  
}