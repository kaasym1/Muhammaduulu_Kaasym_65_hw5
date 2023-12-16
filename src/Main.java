public static void main(String[] args) {

        Hero[] heroes = createHeroes();
        System.out.println("HEROES: ");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + " Damage: " + hero.getDamage() +
                    " Super power: " + hero.getSuperPower());
        }

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtectionTipe("block");
        System.out.println("BOSS: ");
        System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage()
                + " Protection Type: " + boss.getProtectionTipe());
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(50, 30, "magic");
        Hero hero2 = new Hero(45, 30);
        Hero hero3 = new Hero(40, 30);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
