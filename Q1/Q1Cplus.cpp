#include<bits/stdc++.h>
using namespace std;

void revarr(int (&b)[],int n)
{   int temp;
    for(int i=0;i<n/2;i++)
    {
        temp=b[i];
        b[i]=b[n-1-i];
        b[n-1-i]=temp;
    }
}

int main(int argc, char const *argv[])
{
    /* code */
    int n, a[50];
    cout<<"enter no of terms: ";
    cin>> n; 
    for(int i=0;i<n;i++)
    cin>>a[i];
    revarr(a, n);
    cout<<"reversed array is :";
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    return 0;
}

