public class Jail extends Field {
    public String inJail = "Im in jail";
    public int bail = 100;

    public Jail(String name, int position) {
        super(name, position);
    }

    @Override
    public void accept(FieldVisitor v){
        v.visit(this);
    }

    public int getBail() {
        return bail;
    }
}
