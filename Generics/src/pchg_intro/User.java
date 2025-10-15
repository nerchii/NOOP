package pchg_intro;

public class User <T extends SimpleUser> {
    private T SimpleUser;

    public User() {
    }

    public void setSimpleUser(T simpleUser) {
        SimpleUser = simpleUser;
    }

    private void printUser(){
        System.out.println(this);
    }
}
