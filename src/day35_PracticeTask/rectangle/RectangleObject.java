package day35_PracticeTask.rectangle;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(0, 10);

        System.out.println(rectangle1);

        rectangle1.setLength(10);
        rectangle1.setWidth(20);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        System.out.println(rectangle1);






    }
}
