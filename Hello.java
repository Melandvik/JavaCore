public class Hello {
    public static void main(String[] args){
        System.out.println("Hello world");

        int person1=32;
        int person2=31;
        int person3=1;
        int person4=8;

        System.out.println("Passengar 1 "+printPasseger(person1));
        System.out.println("Passengar 2 "+printPasseger(person2));
        System.out.println("Passengar 3 "+printPasseger(person3));
        System.out.println("Passengar 4 "+printPasseger(person4));

        String xx= printPasseger(person1);
        
        printPasseger(person1,1);
        printPasseger(person2,2);
        printPasseger(person3,3);
        printPasseger(person4,4);

        printPrimes(150);
    }

    private static void printPrimes(int number) {
        for(int i=2;i<=number;i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
  }
    private static boolean isPrime(int number) {
        boolean x=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                x=false;
                break;
            }
        }
        return x;
    }

    public static String printPasseger(int person) {
        
        String result;
        
        if(person>12){
            if(person<67){
                result="adult";
            }else{
                result="senior";
            }
        }else{
            if(person>2){
                result="child";
            }else{
                result="infant";
            }
        }
        return result;
    }

    public static void printPasseger(int person, int index) {
        if(person>12){
            if(person<67){
                System.out.println("passenger "+index+": " + "adult");
            }else{
                System.out.println("passenger "+index+": " + "senior");
            }
        }else{
            if(person>2){
                System.out.println("passenger "+index+": " + "child");
            }else{
                System.out.println("passenger "+index+": " + "infant");
            }
        }
    }
}
