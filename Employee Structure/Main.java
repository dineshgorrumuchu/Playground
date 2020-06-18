#include<iostream>
using namespace std;
struct employee{
  char name[50];
  int id;
  int age;
  char d[50];
  int sal;
};

int main()
{
  //Type your code here.
  employee e;
  cout<<"Enter name:"<<"\n";
  cin>>e.name;
  cout<<"Enter ID:"<<"\n";
  cin>>e.id;
  cout<<"Enter age:"<<"\n";
  cin>>e.age;
  cout<<"Enter designation:"<<"\n";
  cin>>e.d;
  cout<<"Enter Salary:"<<"\n";
  cin>>e.sal;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<e.name<<"\n"<<"ID of the Employee : "<<e.id<<"\n"<<"Age of the Employee : "<<e.age<<"\n"<<"Designation of the Employee : "<<e.d<<"\n"<<"Salary of the Employee : "<<e.sal;
}
