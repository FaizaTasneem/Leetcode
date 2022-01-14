#include<bits/stdc++.h>
using namespace std;

bool isPerfectSquare(int num) {
    int l=0;
    int r=num;
    int mid=0;

    while(l<r){
        mid=floor((l+r)/2);
        double sqr=(double)mid*(double)mid;

        if(sqr==num) return true;
        else if(sqr>num) r=mid;
        else if(sqr<num) l=mid+1;

    }
    return false;
}

int main(){
    int n;
    cin>>n;
    cout<<isPerfectSquare(n)<<endl;
}
