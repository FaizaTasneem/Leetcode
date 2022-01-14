#include<bits/stdc++.h>
using namespace std;

int arrangeCoins(int n) {
    int c=n;
    for(int i=1; i<=n; i++){
        c=c-i;
        //cout<<c<<endl;
        if(c==0) return i;
        else if(c<0) return i-1;
    }
    return 0;
}

int main(){
    cout<<arrangeCoins(4)<<endl;
}
