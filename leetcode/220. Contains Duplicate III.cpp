#include<bits/stdc++.h>
using namespace std;

bool containsNearbyAlmostDuplicate(int nums[], int k, int t) {
    for(int i=0; i<2; i++){
        int j=i+1;
        while(j<2 && (j-i)<=k){
            long x=nums[j]-nums[i];
            cout<<x<<endl;
            if(x<0) x=-x;
            if(abs(x)<=t && abs(i-j)<=k) return true;
            j++;
        }
    }
    return false;
}

int main(){
    int a[] = {-2147483648,2147483647};

    cout<<containsNearbyAlmostDuplicate(a,1,1);
}
