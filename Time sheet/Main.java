#include<iostream>
using namespace std;
int main()
{
  int arr[7],i,j,bsat,bs,sum=0;
  for(i=0;i<7;i++)
  cin>>arr[i];
  for(i=0;i<7;i++)
  {
    if(i==0)
    {
      arr[0]=arr[0]*100;
      bs=arr[0]*(0.5);
      arr[0]=bs+arr[0];
      
    }
    else if(i==6)
    { 
        arr[6]=arr[6]*100;
      bsat=arr[6]*(0.25);
      arr[6]=bsat+arr[6];
      
      
    }
    else if(arr[i]>8)
    {
      arr[i]=(arr[i]*100)+((arr[i]-8)*15);
      
     
    }
    else
      
      { 
          arr[i]=(arr[i]*100);
      }
      
    
  }
    

  for(i=0;i<7;i++)
  {
      
    sum=sum+arr[i];
}
cout<<sum;
}

  