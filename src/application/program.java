package application;

import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle x, y;
		x = new	Rectangle();
		y = new Rectangle();
		
		System.out.println("Enter the measures of rectangle x: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.println("Enter the measures of rectangle y: ");
		y.width = sc.nextDouble();
		y.height = sc.nextDouble();
		
		double areaX = x.area();
		System.out.println("Área do retangulo x: " + areaX);
		double areaY  = y.area();
		System.out.println("Área do retangulo y: " + areaY);
		
		double perimeterX = x.perimeter();
		System.out.println("Perimetro do retangulo x: " + perimeterX);
		double perimeterY = y.perimeter();
		System.out.println("Perimetro do retangulo y: " + perimeterY);
		
		double diagonalX = x.diagonal();
		System.out.println("Diagonal do retângulo x: " +  diagonalX);
		double diagonalY = y.diagonal();
		System.out.println("Diagonal do retângulo y: " + diagonalY);
		
		
		
		
		sc.close();

	}

}
