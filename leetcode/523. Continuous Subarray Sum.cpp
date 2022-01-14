#include<bits/stdc++.h>
using namespace std;

bool checkSubarraySum(vector<int>& nums, int k) {
    int j=0;
    int a[nums.size()];
    for(int i=0; i<nums.size(); i++){
        if(i==0) a[i]=nums[i];
        else a[i]=nums[i]+a[i-1];

        if(i>0 && a[i]%k==0) return true;
        else if(i>=2){
            while(j!=i-2){

                if((a[i]-a[j])%k==0) {

                    return true;
                }
                j++;
            }
            j=0;
        }
    }
    return false;
}

int main(){
    vector<int> v = {1,3,6,0,9,6,9};
    cout<<checkSubarraySum(v,7);
}
