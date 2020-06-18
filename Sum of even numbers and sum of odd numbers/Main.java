#include<iostream>
using namespace std;
int main()
{
  int n,sum,sum2,i,j;cin>>n;
  int arr[15];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
      for(int i=0;i<n;i++)
      {
        if(arr[i]%2==0)
        {
          sum=sum+arr[i];
        }
        else
          sum2=sum2+arr[i];
      }
      cout<<"The sum of the even numbers in the array is "<<sum;
      cout<<"\nThe sum of the odd numbers in the array is "<<sum2;
  
}