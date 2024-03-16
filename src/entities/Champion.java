package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other){
        int danoRecebido = other.attack - this.armor;
        if (danoRecebido <= 0){
            danoRecebido = 1;
        }
        this.life -= danoRecebido;

        if (this.life < 0){
            this.life = 0;
        }
    }

    public String status(){
        if (getLife() != 0){
        return String.format("%s: %d de vida", getName(), getLife());
        } else {
            return String.format("%s: %d de vida (morreu)", getName(), getLife());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
