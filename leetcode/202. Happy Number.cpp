#include<bits/stdc++.h>
using namespace std;

bool isHappy(int x) {
    int r=0;
    string s = to_string(x);
    while(r!=1){

        r=0;
        for(int i=0; i<s.length(); i++){
            int n = s[i]-'0';
            r = r+n*n;
        }
        if(r==1) return true;
        if(r==20) return false;
        cout<<r<<endl;
        s=to_string(r);
    }
    if(s[0]=='1') return true;
    return false;
}

int main(){
    int n;
    cin>>n;
    cout<<isHappy(n);
}
