#include <iostream>
#include <queue>
using namespace std;

int main(){
    for(int t = 1; t <= 10; t++){
        int test_case;
        cin >> test_case;
        queue<int> q;
        for(int i = 0; i < 8; i++){
            int x;
            cin >> x;
            q.push(x);
        }

        int x = 1;
        while(true){
            int front = q.front();
            q.pop();
            front -= x;
            if(front <= 0){
                q.push(0);
                break;
            }else{
                q.push(front);
            }
            x++;
            if(x > 5) x = 1;
        }

        cout << "#" << t << ' ';
        while(!q.empty()){
            cout << q.front() << ' ';
            q.pop();
        }
        cout << '\n';
    }
    return 0;
}