#include <iostream>

class A {
public:
    int data;
    void display() {
        std::cout << "Data in A: " << data << std::endl;
    }
};

// 'virtual' keyword prevents creating two copies of A in class D
class B: virtual public A {};

class C: virtual public A {};

// Inherits from both B and C.
// D has only one copy of 'data'.
class D: public B, public C {
public:
    void setData(int value) {
        data = value;
    }
};

int main() {
    D obj;

    std::cout << "Virtual Inheritance Demo" << std::endl;

    obj.setData(100);
    obj.display();

    return 0;
}