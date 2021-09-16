#include <bits/stdc++.h>
using namespace std;
 #define N 100000
 bool greater_than_1(int x){
   return (x>1);
 }
int main()
{
   int n1,n2,n3;
   cin>>n1>>n2>>n3;
  int temp;
  short hash[N]={0};
   for(int i=0;i<n1;i++)
    {
        cin>>temp;
        hash[temp]++;
    }
    for(int i=0;i<n2;i++)
    {
        cin>>temp;
        hash[temp]++;
    }
    for(int i=0;i<n3;i++)
    {
        cin>>temp;
        hash[temp]++;
    }
    int count=count_if(hash,hash+N,greater_than_1);
    cout<<count<<endl;
    for(int i=0;i<N;i++){
            if(hash[i]>1)
                cout<<i<<endl;
    }
    return 0;
}
