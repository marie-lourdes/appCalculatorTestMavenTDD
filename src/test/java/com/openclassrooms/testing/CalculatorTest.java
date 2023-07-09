package com.openclassrooms.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	
	// Arrange
	private static Calculator calculator;
	
	/*cette annotation @BeforeAll designe une methode static, le code est executé avant l executions de tous les test:
    on instancie UNE seule fois la classe calculator (vs BeforeEach qui executerai la method à chaque test*/
	@BeforeAll 
	private static void setUp() { // cette methode est static pour que java execute la methode a partir de la classe CalculatorTest meme avec une espace de nom de la classe et non d'une instance de cette classe
		calculator = new Calculator();
	}

	@Test
	void testAddTwoPositiveNumbers() {
		
		// Arrange
		int a = 2;
		int b = 3;
		//Calculator calculator = new Calculator();
			
		// Act
		int somme = calculator.add(a, b);

		// Assert
		assertEquals(5, somme);
	}
	
	// Pour bien definir ce qu'on veut tester , il est recommandé de commencer a rebours par l etape Assert, puis Act, enfin Arrange
	@Test
	void testMultiplyTwoPositiveNumbers() {
		
		// Arrange
		int a = 5;
		int b = 4;
		
		// Act
		Integer somme = calculator.multiply(a, b);
		
		// Assert
		assertEquals(20, somme);
		
	}

}
