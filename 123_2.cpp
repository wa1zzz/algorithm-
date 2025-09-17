#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main() {
    vector<string> li = {"a", "1", "b", "2", "c", "3"};
    vector<string> li_1; // для букв
    vector<string> li_2; // для чисел
    
    // Разделяем список на буквы и числа
    for (int i = 0; i < li.size(); i++) {
        if (i % 2 == 0) {
            li_1.push_back(li[i]); // четные индексы - буквы
        } else {
            li_2.push_back(li[i]); // нечетные индексы - числа
        }
    }
