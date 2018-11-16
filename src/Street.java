public class Street extends Ownable{
    private int price = 200;


    @Override
    public void accept(FieldVisitor v){
        v.visit(this);
    }

    public Street(String name, int position) {
        super(name, position);
    }

    public int getPrice() {
        return price;
    }
}
