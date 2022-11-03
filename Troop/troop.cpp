#include "troop.hpp"

#include <cstdlib>
#include <iostream>

int Troop::m_troop_count = 0;

Troop::Troop(float health, float speed, std::string name) : m_health(health), m_speed(speed), m_name(name) {
    m_troop_count++;
}

Troop::~Troop() {
    m_troop_count--;
}

void Troop::eat_mushroom() {
    int choice = rand() % 1;

    if (choice) {
        m_speed *= 2;
    } else {
        m_health /= 2;
    }
}

void Troop::fight() {
    int choice = rand() % 1;

    if (choice) {
        m_name = "Sir " + m_name;
    } else {
        m_health -= 5;
    }
}

void Troop::print_info() {
    std::cout << "Name: " << m_name << "\nSpeed: " << m_speed << "\nHealth: " << m_health << std::endl;
}

int main() {
    Troop troop(10, 2.0f, "troop1");
    troop.print_info();
    std::cout << Troop::m_troop_count << std::endl;

    Troop troop2(10, 2.0f, "troop2");

    return 0;
}
