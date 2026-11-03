package classes;

public class RPG extends Game{

    @Override
    public void start(){
        System.out.println("nadpisany start()");
    }

    /*
    nie mozna nadpisac poniewaz jest final

    @Override
    public void initialize(){
        System.out.println("nadpisany initialize()");
    }
     */
}
