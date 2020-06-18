#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,max=0;
  int arr1[10][10],arr2[10][10];
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>arr1[i][j];
    }
  }
  
  
  for(i=0;i<n;i++)
  { for(j=0;j<m;j++)
    {
      arr2[i][j]=arr1[j][i];
    }
}

  
  for(i=0;i<n;i++)
  {max=0;
    for(j=0;j<m;j++)
    {
      if(max>arr2[i][j])
      {
        max=max;
      }
      else
        max=arr2[i][j];
    }
    cout<<max;
    cout<<"\n";
  }
  
      
        

}