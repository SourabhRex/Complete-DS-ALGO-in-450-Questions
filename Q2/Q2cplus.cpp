#include<bits/stdc++.h>
using namespace std;

void maxmin(int arr[],int n)
{   int mn=INT32_MAX,mx=INT32_MIN;
    for(int i=0;i<n;i++)
    {
        if (mn>arr[i])
            mn=arr[i];
        if(mx<arr[i])
            mx=arr[i];
    }
    cout<<"min= "<<mn<<"\nMax= "<<mx;
}

int main(int argc, char const *argv[])
{
    int n;
    cout<<"ENter no of terms: ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter "<<i<<"th number: ";
        cin>>arr[i];
    } 
    maxmin(arr,n);
    return 0;
}
