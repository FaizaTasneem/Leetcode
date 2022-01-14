#include<bits/stdc++.h>
using namespace std;

double divide(int dividend, int divisor) {
    double c=0;
    double sum=0;
    double n=divisor;
    double d=dividend;

    if(dividend==0) return 0;
    else if(dividend>0 && divisor>0){
        while(sum<=d){
            sum=sum+n;
            c++;
        }
    }
    else if(dividend>0 && divisor<0){
        n=-n;
        while(sum<=d){
            sum=sum+n;
            c++;
        }
        c=(c-1)*(-1);
        return c;
    }
    else if(dividend<0 && divisor>0){
        d=d*(-1);
        while(sum<=d){
            sum=sum+n;
            c++;
        }
        c=(c-1)*-1;
        return c;
    }
    else if(dividend<0 && divisor<0){
        n=-n;
        d=-d;
        while(sum<=d){
            sum=sum+n;
            c++;
        }
    }

    return (c-1);

}

int main(){
    int dvnd;
    int dvsr;
    cin>>dvnd>>dvsr;
    cout<<divide(dvnd,dvsr);
}
