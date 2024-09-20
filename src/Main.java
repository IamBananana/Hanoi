public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int antall = 3;

        flyttMange(antall, 'A', 'B', 'C');
        System.out.println(Math.round(Math.pow(2, antall)-1) + " forflytninger");
    }
    public static void flyttMange(int ant, char A, char B, char C) {
        if (ant == 1) {
            flyttEn(A, B);
        }
        else {
            flyttMange(ant-1, A, C, B);
            flyttEn(A, B);
            flyttMange(ant-1, C, B, A);
        }
    }
    private static void flyttEn(char A, char C){
        System.out.println("Flytt " + A + " til " + C);
    }
}