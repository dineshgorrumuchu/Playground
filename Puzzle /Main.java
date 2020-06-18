#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j;
  cin>>r>>c;
  int arr1[c][r];
  int arr[r][c];
  for(i=0;i<r;i++)
  {
    
    for(j=0;j<c;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      arr1[i][j]=arr[j][i];
    }
    
  }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      
cout<<arr1[i][j]<<" ";
 
    }
    cout<<"\n";
    
}
}