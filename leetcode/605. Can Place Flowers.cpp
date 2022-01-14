#include<bits/stdc++.h>
using namespace std;

bool canPlaceFlowers(int flowerbed[], int n) {
    int c=0;
    for(int i=0; i<6; i++){
        if(i==0 && flowerbed[i]==0){
            if(flowerbed[i+1]==0) {
                flowerbed[i]=1;
                c++;
            }
        }
        else if(i==5 && flowerbed[i]==0){
            if(flowerbed[i-1]==0){
                flowerbed[i]=1;
                c++;
            }
        }
        else if(flowerbed[i]==0){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                flowerbed[i]=1;
                c++;
            }
        }

    }
    if(c>=n) return true;
    return false;
}

int main(){
    int n;
    cin>>n;
    int a[] = {1,0,0,0,0,1};
    cout<<canPlaceFlowers(a,n);

}
