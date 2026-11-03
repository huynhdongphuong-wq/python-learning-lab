#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

bool check_prime_number(int n) {
    if (n <= 1){
        return false;
    }

    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int n;
    cout << "Enter the volume of the array: ";
    cin >> n;

    vector<int> a(n);
    cout << "Enter an element from the array:\n ";
    for (int i = 0; i < n; i++) {
        cout << "a[" << i << "]";
        cin >> a[i];
    }

    int count = 0;
    cout << "Every prime numbers in the array are:\n";
    for (int i = 0; i < n; i++) {
        if (check_prime_number(a[i])) {
            cout << a[i] << " " << endl;
            count++;
        }
    }

    cout << "The total number of prime numbers from this array is: " << count << endl;

    return 0;
}