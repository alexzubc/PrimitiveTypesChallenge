package academy.programming;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;

        long longTotal = (50000L + 10L * (myByte + myShort + myInt));
        System.out.println((longTotal));

        short shortTotal = (short) (1000 +  10 *
                (myByte + myShort + myInt));
    }
}