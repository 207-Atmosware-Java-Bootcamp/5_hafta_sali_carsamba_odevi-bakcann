package com.examples;

import java.util.Scanner;

public class _20x7_VizeFinal {
	
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize final notuna göre geçme
		// not ortalması:50 altında kaldı
		// not ortalması:50 Geçti
		// not ortalaması: 55<=x<=70 BB
		// not ortalaması: 70<=x<=84BA
		// not ortalaması: 84<=x<=100AA
		
		// return: metodu kırmak
		// break: döngüyü kırmak
		// continue: 1 kereye mahsus es geçmek ve sonra döngüye devam etmek
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Vize notunuzu giriniz :");
		int vizeNotu = klavye.nextInt();
		
		System.out.println("Final notunuzu giriniz");
		int finalNotu = klavye.nextInt();
		
		double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
		
		if (vizeNotu >= 0 && vizeNotu <= 100 && finalNotu >= 0 && finalNotu <= 100) {
			
			if (ortalama >= 85 && ortalama <= 100) {
				System.out.println("Tebrikler AA ile geçtiniz. Notunuz: " + ortalama);
			} else if (ortalama >= 71 && ortalama <= 84) {
				System.out.println("Tebrikler BA ile geçtiniz. Notunuz: " + ortalama);
			} else if (ortalama >= 55 && ortalama <= 70) {
				System.out.println("Tebrikler BB ile geçtiniz. Notunuz: " + ortalama);
			} else if (ortalama >= 50 && ortalama <= 54) {
				System.out.println("Tebrikler CC ile geçtiniz. Notunuz: " + ortalama);
			} else {
				System.out.println("Dersten kaldınız. Notunuz: " + ortalama);
			}
		} else {
			System.out.println("Lütfen 0-00 aralığında bir sayı giriniz");
		}
		
	}
	
}
