#include<iostream>
using namespace std;
struct col{
  char name[50];
  char city[50];
  int y;
  float cgpa;
};
int main()
{
  cout<<"Enter the number of colleges"<<"\n";
  int n;
  cin>>n;
  col s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name"<<"\n";
    cin>>s[i].name;
    cout<<"Enter city"<<"\n";
    cin>>s[i].city;
    cout<<"Enter year of establishment"<<"\n";
    cin>>s[i].y;
    cout<<"Enter pass percentage"<<"\n";
    cin>>s[i].cgpa;
    
  }
  cout<<"Details of colleges"<<"\n";
    for(int i=0;i<n;i++)
    {
      cout<<"College:"<<i+1<<"\n";
      cout<<"Name:"<<s[i].name<<"\n";
      cout<<"City:"<<s[i].city<<"\n";
      cout<<"Year of establishment:"<<s[i].y<<"\n";
      cout<<"Pass percentage:"<<s[i].cgpa<<"\n";
    }
        
  
  
  
    
}