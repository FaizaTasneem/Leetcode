#include<bits/stdc++.h>
using namespace std;

int thirdMax(vector<int>& nums) {
    set<int> s;
    vector<int> v;
    set<int>:: iterator itr;
    for(int i=0; i<nums.size(); i++){
        s.insert(nums[i]);
    }
    for(itr=s.begin(); itr!=s.end(); itr++){
        v.push_back(*itr);
    }
    if(v.size()>=3){
        return v[v.size()-3];
    }
    return v[v.size()-1];
}
int main(){
    vector<int> v = {2,1};
    cout<<thirdMax(v)<<endl;
}
