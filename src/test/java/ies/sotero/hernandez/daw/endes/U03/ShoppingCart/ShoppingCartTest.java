package ies.sotero.hernandez.daw.endes.U03.ShoppingCart;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ShoppingCartTest{
	private ShoppingCart sc1;
	private Product p1, p2;
	private final int cero = 0;

	
	@BeforeEach
	public void shoppingCartAndProducts() {
		
		sc1 = new ShoppingCart();

		p1 = new Product("Vela", 2);
		p2 = new Product("Pila", 1);
	}

	
	@Test
	public void esCero() {
		
		assertEquals(cero, sc1.getItemCount());
	}
	
	
	@Test
	public void vacio() throws ProductNotFoundException {
		
		sc1.addItem(p1);
		sc1.empty();
		
		assertEquals(cero, sc1.getItemCount());	
	}

	
	@Test
	public void incrementar() {
		
		int i = sc1.getItemCount() + 1;
		sc1.addItem(p1);

		assertEquals(i, sc1.getItemCount());
	}

	
	@Test
	public void sumaBalances() {
		
		double i = sc1.getBalance() + p2.getPrice();
		sc1.addItem(p2);

		assertEquals(i, sc1.getBalance());
	}
	
	
	@Test
	public void decrementar() throws ProductNotFoundException{
		
		sc1.addItem(p1);
		
		int i = sc1.getItemCount() -1;
		sc1.removeItem(p1);

		assertEquals(i, sc1.getItemCount());
	}
	
	
	@Test
	public void borrarElemento() {
	    
	    try {
	        sc1.removeItem(p2);
	        fail("ProductNotFoundException");
	    } catch (ProductNotFoundException e) {
	    }    
	    
	}
	
	

	
	
	
	

}
