package SuperHero;

public class FlyingStrategy implements AbilityStrategy{
    @Override
    public void applyAbility() {
        System.out.println( "Flying applied.");
    }
}
