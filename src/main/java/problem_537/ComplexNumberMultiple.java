package problem_537;

public class ComplexNumberMultiple {
    public static void main(String[] args) {
        ComplexNumberMultiple complexNumberMultiple = new ComplexNumberMultiple();
        String hh = complexNumberMultiple.complexNumberMultiply("1+1i", "1+1i");
        System.out.println(hh);


    }

    public String complexNumberMultiply(String a, String b) {


        String[] first = a.split("\\+");
        String[] second = b.split("\\+");
        int ii = Integer.valueOf(first[0]);

        int real = Integer.valueOf(first[0]) * Integer.valueOf(second[0]) +
                Integer.valueOf(first[1].split("i")[0]) * Integer.valueOf(second[1].split("i")[0]) * -1;
        int complex = Integer.valueOf(first[0]) * Integer.valueOf(second[1].split("i")[0]) +
                Integer.valueOf(first[1].split("i")[0]) * Integer.valueOf(second[0]);
//        System.out.println(real + "+" + complex + "i");
        return real + "+" + complex + "i";
    }
}
