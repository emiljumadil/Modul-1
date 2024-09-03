public class Answer2 {
    private static Object Public;

    public static void main(String[] args) {
//        2. Find diameter, cirumferece and area of a circle
        int radius = 5;

//        Diameter, circumferece and area of a circle
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);
    }
}



