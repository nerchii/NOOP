package pchg_intro;

public class AdvancedUser extends SimpleUser{
    public AdvancedUser(int id, String name) {
        super(id, name);
    }

    @Override
    public void prefomSomething() {
        System.out.println("Advanced preformance");
    }
}
