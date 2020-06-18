#include<iostream>
using namespace std;
int main()
{
  int m,n,sum,r[m],i,j;
  cin>>m>>n;
  int arr[10][10];
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
  {
    cin>>arr[i][j];
  }
  }
  for(i=0;i<m;i++)
  {sum=0;
    for(j=0;j<n;j++)
    {
      if(sum>arr[i][j])
      sum=sum;
      else
        sum=arr[i][j];
    }
      r[i]=sum;
    }
  
  for(i=0;i<m;i++)
  {
    cout<<r[i]<<"\n";
  }
}
    
