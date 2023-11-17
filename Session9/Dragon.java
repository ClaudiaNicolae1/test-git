package Session9;

public class Dragon extends Monster{

    public Dragon(String name, String place) {
        super(name,place);
    }

    @Override
    void attack() {
        System.out.println("Dragon attacks " + "from " + place);
    }
}