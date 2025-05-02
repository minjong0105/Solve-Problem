#include <iostream>
#include <unordered_set>
using namespace std;

int main(){
    unordered_set<int> remainderset;
    for(int i = 0; i < 10; i++){
        int num;
        cin >> num;
        remainderset.insert(num%42);
    }
    cout << remainderset.size() << endl;
    return 0;
}