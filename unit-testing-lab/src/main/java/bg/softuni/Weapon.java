package bg.softuni;

public interface Weapon {
    int getAttackPoints();
    int getDurabilityPoints();
    void attack(Target target);
}
