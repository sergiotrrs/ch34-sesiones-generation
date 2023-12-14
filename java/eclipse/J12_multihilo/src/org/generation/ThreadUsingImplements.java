package org.generation;

class Feline {
	
}

interface Pet {
	
}

class Cat extends Feline implements Pet, Runnable {
	
	public long getId() {
		return Thread.currentThread().getId();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("id: " + getId() + ", iteration n: " + i);
			try {
				Thread.sleep(1000); // Suspender el hilo
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
	}
	
}


public class ThreadUsingImplements {

	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		Cat pelusa = new Cat();
		Cat wero = new Cat();
		Cat tecate = new Cat();
		Feline michi = new Feline();
		
		Thread hilo01 = new Thread( pelusa );
		Thread hilo02 = new Thread( wero );
		Thread hilo03 = new Thread( tecate );
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
		
		try {
			hilo01.join();
			hilo02.join();
			hilo03.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
		System.out.println("Fin del programa");
		
	}
	
	
}
