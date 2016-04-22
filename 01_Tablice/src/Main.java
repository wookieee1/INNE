
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

	//pobierz od usera ile chcesz miec elementow w tablicy
	Scanner sc=new Scanner(System.in);
	int r=Integer.parseInt(sc.nextLine());
	
	int[] tab = new int[r]; //w taki sposob przygotowales tablice ktora jest w stanie przechowac
	//r elementow typu int
	
	//do kolejnych elementow tablicy odnosisz sie za pomoca indeksu tablicy
	tab[0] = 10; //w taki sposb pierwszy element tablicy ma wartosc 10
	tab[12] = 23; //element 13 ma wartosc 23
	
	//petla for jest idealnie stworzona do pracy z tablicami
	for (int i = 0; i < tab.length; i++)
	{
		//i to indeks kolejnego eloementu tablicy ktory bedzie przegladany
		//tab.length to rozmiar twojej tablicy
		System.out.println("Podaj kolejny element tablicy");
		tab[i] = Integer.parseInt(sc.nextLine());
	}
	
	System.out.println("ELEMENTY TABLICY");
	for (int i = 0; i < tab.length; i++) {
		System.out.println(tab[i]);
	}
}
}