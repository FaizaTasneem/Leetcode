#include<bits/stdc++.h>
using namespace std;

bool isValid(string s) {
    stack<int> mystack;
    for(int i=0; i<s.length(); i++){
        if(s[i]==')' || s[i]=='}' || s[i]==']'){
            if(mystack.empty()==true) {
                //cout<<s[i]<<endl;
                return false;
            }
            else if(s[i]==')' && mystack.top()=='(') {
                //cout<<s[i]<<endl;
                mystack.pop();
            }
            else if(s[i]==')' && (mystack.top()=='{' || mystack.top()=='[')) return false;
            else if(s[i]=='}' && mystack.top()=='{'){
                //cout<<s[i]<<endl;
                mystack.pop();
            }
            else if(s[i]=='}' && (mystack.top()=='(' || mystack.top()=='[')) return false;
            else if(s[i]==']' && mystack.top()=='['){
                //cout<<s[i]<<endl;
                mystack.pop();
            }
            else if(s[i]==']' && (mystack.top()=='(' || mystack.top()=='{')) return false;
        }
        else if(s[i]=='(' || s[i]=='{' || s[i]=='['){
            //cout<<s[i]<<endl;
            mystack.push(s[i]);
        }
    }


    if(mystack.empty()==true) return true;
    return false;
}

int main(){
    cout<<isValid("(])")<<endl;
}
