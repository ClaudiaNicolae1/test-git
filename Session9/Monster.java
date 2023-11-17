package Session9;

public abstract class Monster {
    protected String name;
    protected String place;
    abstract void attack();
    public Monster(String name, String place){
        this.name = name;
        this.place = place;
    }
    public Monster(){}


}