public class Console {
    public static void main(String[] args) {
        Pythagorean pythag = new Pythagorean();
        Double hypotenuse = pythag.calculateHypotenuse(5, 8);
        System.out.print(hypotenuse);

    }
}