#include <iostream>
using namespace std;

int main(){

    int i, j, n;
    cin >> n;

    for(int i = 1; i<= n; i++){
        cout << "*" << "\n";
        for(int j = 1; j<=n; j++){
            cout << "*";
        }
    }
}