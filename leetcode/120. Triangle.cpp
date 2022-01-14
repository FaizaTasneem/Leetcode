#include<bits/stdc++.h>
using namespace std;
int minimumTotal(vector<vector<int>>& triangle) {
    int sp=INT_MAX;

    for(int i=1; i<triangle.size(); i++){
        for(int j=0; j<=i; j++){
            if(j==0) {
                triangle[i][j]=triangle[i][j]+triangle[i-1][j];
            }
            else if(j==i) {
                triangle[i][j]=triangle[i][j]+triangle[i-1][j-1];
            }
            else{
                triangle[i][j]=min(triangle[i][j]+triangle[i-1][j],triangle[i][j]+triangle[i-1][j-1]);
            }
            cout<<triangle[i][j]<<endl;
            //cout<<i<<j<<endl;
        }
    }

    for(int i=0; i<triangle[triangle.size()-1].size(); i++){
        if(sp>triangle[triangle.size()-1][i]) sp=triangle[triangle.size()-1][i];
    }
    return sp;
}

int main(){
    vector<vector<int>> v = {{-1},{2,3},{1,-1,-3}};
    vector<vector<int>> v1 = {{2},{3,4},{6,5,7},{4,1,8,3}};
    //minimumTotal(v1);
    cout<<minimumTotal(v)<<endl;
}
