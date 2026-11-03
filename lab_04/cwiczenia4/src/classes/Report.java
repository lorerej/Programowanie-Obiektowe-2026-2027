package classes;

public class Report extends Document{
    @Override
    public Report copy(){
        return new Report();
    }
}
