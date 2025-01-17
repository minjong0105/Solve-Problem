#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main(){
    string str;
    int count = 0;
    getline(cin, str);
    stringstream ss(str);
    string word;
    while(ss >> word) count ++;
    cout << count << endl;
    return 0;
}