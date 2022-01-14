#include<bits/stdc++.h>
using namespace std;

int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
    int st=start;
    int d1=0;
    int d2=0;
    int len1=0;
    int len2=0;
    if(start<destination){
        len1=destination-start;
        len2=distance.size()-destination;
    }
    else{
        len1=(distance.size()-start)+(destination-0);
        len2=start-destination;
    }

    for(int i=1; i<=len1; i++){
        //cout<<st<<endl;
        d1=d1+distance[st];
        st=(st+1)%distance.size();

    }
    for(int i=1; i<=len2; i++){
        //cout<<st<<endl;
        d2=d2+distance[st];
        st=(st+1)%distance.size();

    }
    if(d1>d2) return d2;
    return d1;
}

int main(){
    vector<int> v = {7,10,1,12,11,14,5,0};
    vector<int> v1 = {3,6,7,2,9,10,7,16,11};
    cout<<distanceBetweenBusStops(v1,6,2)<<endl;
    //cout<<distanceBetweenBusStops(v,7,2)<<endl;
}
