#include<iostream>
using namespace std;
int main()
{
  int r,c,m,i,j;
  cin>>r>>c;
  int arr1[r][c];
  int arr2[r][c];
  for (m=1;m<=2;m++)
  {
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(m==1)
      cin>>arr1[i][j];
      else
        cin>>arr2[i][j];
    }
  }
  }
    int arr[r][c];
    {
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          arr[i][j]=arr1[i][j]+arr2[i][j];
          cout<<arr[i][j]<<" ";
        }
        cout<<"\n";
      }
    }
    
  }
  