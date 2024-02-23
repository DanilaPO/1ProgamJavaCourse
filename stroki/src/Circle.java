public class Circle {
    public static void main(String[] args) {
        int circleRadius = 4;

        double circleArea = Math.PI * Math.pow(circleRadius, 2); // площадь круга
        System.out.println("Площадь круга = " + circleArea); // площадь круга

        double circumference = 2 * Math.PI * circleRadius; // длина круга
        System.out.println("Длина круга = " + circumference); // длина круга

        double radiusThroughArea = Math.sqrt(circleArea / Math.PI); // радиус через площадь
        System.out.println("Радиус через площадь круга = " + radiusThroughArea); // радиус через площадь

        double radiusThroughCircumference = circumference / (2 * Math.PI); // радиус через длину круга
        System.out.println("Радиус через длину круга = " + radiusThroughCircumference);// радиус через длину круга

        double circleAngle = 30; // площадь сектора круга
        double circleSectorArea = Math.PI * Math.pow(circleRadius, 2) * (circleAngle / 360); // площадь сектора круга
        System.out.println("Площадь сектора круга = " + circleSectorArea); // площадь сектора круга
    }
}