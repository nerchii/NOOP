package SuperHero;

public class Hero {
    private AbilityStrategy ability;

    public Hero(){
        this.ability = new ZeroStrategy();
    }

    public void applyAbility(AbilityStrategy ability){
        this.ability = ability;
        ability.applyAbility();
    }

    @Override
    public String toString() {
        return "Heros ability:" + ability.getClass().getSimpleName() ;
    }
}
