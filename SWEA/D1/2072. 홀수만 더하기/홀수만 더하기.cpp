#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    for(int test_case = 1; test_case <= t; test_case++){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int num;
            cin >> num;
            if(num % 2 == 1) sum += num;
        }
        cout << "#" << test_case << " " << sum << endl;
    }
    return 0;
}