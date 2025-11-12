package SuperHero;

public class SimGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        int level = 0;

        System.out.println("Level "+ level);
        System.out.println(hero.toString());

        hero.applyAbility(new FastRunningStrategy());
        level +=1;
        System.out.println("Level "+ level);
        System.out.println(hero.toString());

        level+=1;
        hero.applyAbility(new FlyingStrategy());
        System.out.println("Level "+ level);
        System.out.println(hero.toString());
    }
}
