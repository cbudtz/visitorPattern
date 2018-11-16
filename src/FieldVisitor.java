public class FieldVisitor {
//TODO move to gameBoard
    Field[] fields = new Field[]{new Street("Gade",1),new Jail("Fængsel",2)};


    public static void main(String[] args) {
      new FieldVisitor().run();
    }

    private void run() {

        for (Field f : fields){
            f.accept(this);
        }
    }


    public void visit(Jail jail){
        System.out.println("Du er i fængsel");
        System.out.println("Du skal betale " + jail.getBail());

    }

    public void visit(Street street){
        System.out.println("Du er landet på en gade ");
        System.out.println("Vi du købe de nfor " + street.getPrice());

    }


}
