
class ClassAndObject {

    String namapendek;
    String namapanjang;

    public static void main(String[] args) {
        var ClassAndObject = new ClassAndObject();
        ClassAndObject.namapendek = "Aldo";
        ClassAndObject.namapanjang = "Saputra";
        String c = ClassAndObject.namapanjang;
        String d = ClassAndObject.namapendek;
        System.out.println(d + " " + c);

    }
}
