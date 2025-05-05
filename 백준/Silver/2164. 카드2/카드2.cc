#include <iostream>
#include <deque>
using namespace std;

int main(){
    int N;
    cin >> N;
    deque<int> num;
    for(int i = 1; i <= N; i++){
        num.push_back(i);
    }
    while(num.size() > 1){
        num.pop_front();
        num.push_back(num.front());
        num.pop_front();
    }
    cout << num.front() << endl;
    return 0;
}