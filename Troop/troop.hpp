#pragma once
#include <string>

class Troop {
public:
    static int m_troop_count;

    Troop(float health, float speed, std::string name);
    ~Troop();

    void eat_mushroom();
    void fight();
    void print_info();

private:
    float m_health;
    float m_speed;
    std::string m_name;
};
