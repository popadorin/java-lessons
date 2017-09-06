package lesson15;

// exception handling lesson

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Oleg", 24);
        Android android = new Android();
        Director director = new Director();
        Android t100 = new T100();

        Director director1;

        try {
            director1 = (Director) human;
        } catch (ClassCastException ex) {
//            System.out.println("Class cast exception, not any human can be director!");
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println("jora");
            }
        }


    }
}
