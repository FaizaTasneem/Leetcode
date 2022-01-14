#include<bits/stdc++.h>
using namespace std;

vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());
        int i=0;
        int j=0;
        set<int> s;
        vector<int> v;
        //set<int>::iterator itr1;
        while(i<nums1.size() || j<nums2.size()){
            if(nums1[i]==nums2[j]){
                s.insert(nums1[i]);
                //cout<<*itr1;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
        }
        set<int>::iterator itr;
        int k=0;
        for (itr = s.begin(); itr != s.end(); itr++){
            v.push_back(*itr);
            //cout<<v[k];
            k++;
        }

        return v;
}

int main(){
    vector<int> v1 = {1,2,2,1};
    vector<int> v2 = {2,2};
    vector<int> v3 = intersection(v1,v2);
    for(int i=0; i<v3.size(); i++){
        cout<<v3[i]<<" ";
    }

}

