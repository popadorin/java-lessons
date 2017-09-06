package lesson15;

public class Director extends Human {
    private int workExperience;

    public Director() {}

    public Director(String name, int age, int workExperience) {
        super(name, age);
        this.workExperience = workExperience;
    }

    @Override
    public void act() {
        System.out.println("like a bitch");
    }




}
