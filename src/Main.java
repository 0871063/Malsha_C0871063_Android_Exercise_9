public class Main {
    public static void main(String[] args) {

        TestCercle circle = new TestCercle();

        circle.setRadius(2);
        circle.setCenter(0, 1);
        System.out.printf("Circle Surface : %.2f \n" , circle.surface());
        System.out.println("Point inside the Circle : " + circle.isInternal(3,3));
    }
}