package bg.softuni;

public class Axe implements Weapon {
    public static final int DURABILITY_LOSS = 1;
    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attack, int durability) {
        this.attackPoints = attack;
        this.durabilityPoints = durability;
    }

    @Override
    public int getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public int getDurabilityPoints() {
        return this.durabilityPoints;
    }

    @Override
    public void attack(Target target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("Weapon is broken.");
        }

        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= DURABILITY_LOSS;
    }

}
