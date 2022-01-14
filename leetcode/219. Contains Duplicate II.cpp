#include<bits/stdc++.h>
using namespace std;

bool containsNearbyDuplicate(int nums[], int c, int k) {
    for(int i=0; i<c; i++){
        for(int j=i+1; j-i<=k; j++){
            if(nums[i]==nums[j] && abs(i-j)<=k) return true;

        }
    }
    return false;
}

int main(){
    int a[] = {1,2,3,1};

    cout<<containsNearbyDuplicate(a,4,3);
}
