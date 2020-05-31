package lab_1;

public class Primes {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }


    public static boolean isPrime(int n) {
        int m=0;
        for(int inter=1;inter<=n;inter++){
            if (n%inter==0) m+=1;

        }
        if(m<=2)return true;
        else return false;
    }
}
