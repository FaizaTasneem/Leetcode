#include<bits/stdc++.h>
using namespace std;

int countPrimes(int n) {
    if(n<=2) return 0;
    //if(n==3) return 1;
    int c=1;
    int x=0;
    for(int i=3; i<n; i++){
        x=0;
        for(int j=1; j<=i/2; j++){
           if(i%j==0) x++;

        }
        if(x==2) {
            cout<<i<<endl;
            c++;
        }
    }
    return c;
}

int main(){
    cout<<countPrimes(10);
}
