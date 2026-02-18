#include <iostream>
#include <sstream>
#include <string>
#include <cmath>
#include <vector>

using namespace std;

int operation (int a, int b, char op);
void print_int_vector(const vector<int>& vec);
void print_char_vector(const vector<char>& vec);

int main() {
    string virkne;
    int s1, s2, tmp_result, result;
    char op;
    vector<int> numbers;
    vector<char> operations;

    cout << "Ludzu ievadiet matematisko darbu virkni: " << endl;
    getline(cin, virkne);

    stringstream expr_stream(virkne);
    expr_stream >> s1;
    numbers.push_back(s1);

    while (expr_stream >> op >> s2){
        if (op == '+' || op == '-'){
            numbers.push_back(s2);
            operations.push_back(op);
        }
        else{
            tmp_result = operation(numbers.back(),s2,op);
            numbers.pop_back();
            numbers.push_back(tmp_result);
        }
    }

    cout << "Numbers:" << endl;
    print_int_vector(numbers);
    cout << "Operacijas:" << endl;
    print_char_vector(operations);

    result = numbers.at(0);

    for (int i=0; i < operations.size(); i++){
        result = operation(result,numbers.at(i+1),operations.at(i));
    }

    cout << "Rezultats: " << result << endl;

    return 0;
}

int operation (int a, int b, char op){
    switch (op) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b;
        case '^': return pow(a, b);
        case '%': return a % b;
    }
}

void print_int_vector(const vector<int>& vec){
    for(int val : vec){
        cout << val << " ";
    }
    cout << endl;
}

void print_char_vector(const vector<char>& vec){
    for(int val : vec){
        cout << static_cast<char>(val) << " ";
    }
    cout << endl;
}