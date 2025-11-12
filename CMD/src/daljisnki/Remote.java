package daljisnki;

public class Remote {
    private Command command;
    private boolean flag;

    public Remote() {
        this.flag = true;
    };

    public void setComand(Command cmd){
        this.command = cmd;
    }

    public void pressButton(){
        if(flag){
            command.exicute();
            flag = false;
        } else {
            command.undo();
            flag = true;
        }
    }


}
