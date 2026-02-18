#include <iostream>
#include <sstream>
#include <string>
#include <cmath>

using namespace std;

int operation (int a, int b, char op);

int main() {
    string virkne;
    int s1, s2, result;
    char op;

    cout << "Ludzu ievadiet matematisko darbu virkni: " << endl;
    getline(cin, virkne);

    stringstream expr_stream(virkne);
    expr_stream >> s1;
    result = s1;

    while (expr_stream >> op >> s2){
        result = operation(result,s2,op);
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