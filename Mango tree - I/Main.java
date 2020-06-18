
#include <iostream>

using namespace std;

int main()
{
    int n1,n2,n3,sum=0,temp=0;
    cin>>n1>>n2>>n3;
    for(int i=1;i<=n1;i++)
    {
        for(int j=1;j<=n2;j++)
        {
            sum=sum+1;
            
            if(i==1 || j==1 || j==n2)
            {
                if(n3==sum)
                temp=sum;
            }
            
        }
        
    }

if(temp==n3)
cout<<"Yes";
else cout<<"No";
}
