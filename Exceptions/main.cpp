#include <iostream>
#include <fstream>
#include <exception>

int main() {
    int a;
    int b;
    int c;

    std::cin.exceptions();
    std::cin.exceptions(std::ifstream::failbit);

    try {
        std::cout << "Input a: ";
        std::cin >> a;
        
        std::cout << a << std::endl;

        if (std::cin.fail()) {
           throw std::runtime_error("Not a number");
        }

        std::cout << "Input b: ";
        std::cin >> b;

        if (std::cin.fail()) {
             throw std::runtime_error("Not a number");
        }

        if (b == 0) {
            throw std::runtime_error("You cannot divide by zero");
        }

        c = a / b; 

        std::cout << "c: " << c << std::endl;
    } catch(std::exception& e) {
        std::cout << e.what() << std::endl;
    }

    return 0;
}
