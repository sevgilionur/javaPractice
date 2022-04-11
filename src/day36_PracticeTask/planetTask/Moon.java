package day36_PracticeTask.planetTask;

public class Moon extends Planet{

    String name;
    public Moon(double mass, double radius, double surfaceGravity, double surfaceArea, double population) {
        super("Moon", mass, radius, surfaceGravity, surfaceArea, population);
    }
}
