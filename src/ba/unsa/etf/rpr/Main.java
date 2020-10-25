package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Unesite neki broj n: ");
	int n = in.nextInt();
	for (int i=1; i<=n; i++){
	    if (i % sumaCifara(i) == 0) System.out.println("" + i);
    }
    }

    private static int sumaCifara(int i) {
        int suma = 0;
        while(i != 0){
            suma = suma + (i % 10);
            i = i / 10;
        }
        return suma;
    }
}
