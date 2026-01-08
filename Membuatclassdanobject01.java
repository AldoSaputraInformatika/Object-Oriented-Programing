//Membuat Class, Field, dan object.  
class ClassAndObject { //class

    String namapendek;
    String namapanjang; // field

    public static void main(String[] args) {
        var ClassAndObject = new ClassAndObject(); // object
        ClassAndObject.namapendek = "Aldo";
        ClassAndObject.namapanjang = "Saputra";
        String c = ClassAndObject.namapanjang;
        String d = ClassAndObject.namapendek;
        System.out.println(d + " " + c);

    }
}
