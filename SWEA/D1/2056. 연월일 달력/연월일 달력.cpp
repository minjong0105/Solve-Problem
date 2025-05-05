#include <iostream>
#include <string>
using namespace std;

int days[13]{
    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31    
};

int main(){
    int T;
    cin >> T;
    for(int t = 1; t <= T; t++){
        string s;
        cin >> s;
        string year = s.substr(0, 4);
        string month = s.substr(4, 2);
        string day = s.substr(6, 2);
        int m = stoi(month);
        int d = stoi(day);
        bool x = false;
        if(m >= 1 && m <= 12){
            if(d >= 1 && d <= days[m]){
                x = true;
            }
        }
        cout << "#" << t << " ";
        if(x){
            cout << year << "/" << month << "/" << day << '\n';
        }else{
            cout << -1 << '\n';
        }
    }
    return 0;
}