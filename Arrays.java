public class Arrays
{
    public static void main(String[] args)
    {
        String[] carBrands = {"Renault", "BMW", "Mercedes", "Audi", "Aston Martin"};
        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println(java.util.Arrays.toString(primeNumbers));
    }
}
