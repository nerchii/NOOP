package pchg_intro;

public class SimpleUser {

    private int id;
    private String name;
    private static int cntID = 100;


    public SimpleUser(int id, String name) {
        this.id = cntID++;
        this.name = name;
    }

    public void prefomSomething(){
        System.out.println(Integer.toHexString(this.hashCode()) + " preforming something!!");
    }

}
