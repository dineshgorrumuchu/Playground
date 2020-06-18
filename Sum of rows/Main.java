#include<iostream>
using namespace std;
int main()
{
  int m,n,arr[10][10],i,j,sum,r[10];
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
            for(j=0;j<n;j++)
            {
              cin>>arr[i][j];
            }         
}
  for(i=0;i<m;i++)
  {sum=0;
    for(j=0;j<n;j++)
    {
      sum=sum+arr[i][j];
    }
   r[i]=sum;
  }
  for(i=0;i<m;i++)
  {
    cout<<r[i]<<"\n";
  }
}
   
      