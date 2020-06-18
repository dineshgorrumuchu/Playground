#include<iostream>
using namespace std;
int main()
{
  char s[200];
  int vc=0,cs=0,n=0,ws=0,ss=0;
  std::cin.getline(s,200);
  for( int i=0;s[i]!='\0';i++)
  {
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      vc=vc+1;
      else if(((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')))
      cs=cs+1;
      else if(s[i]>='0'&& s[i]<='9')
      n=n+1;
      else if(s[i]==' ')
      ws=ws+1;
      else
      ss=ss+1;
  }
  
  cout<<"Vowels:"<<vc<<"\n";
  cout<<"Consonants:"<<cs<<"\n";
  cout<<"White Spaces:"<<ws<<"\n";
  cout<<"Digits:"<<n<<"\n";
  cout<<"Symbols:"<<ss;
}