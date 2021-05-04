package educative.data_structures.arrays;

// a*b = lcm * hcf

public class LCM {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        int hcf = HCF.gcd(3, 5);

        int lcm = (a * b) / hcf;

        System.out.println(lcm);

    }

}
