package com.softtek.pruebas;

import com.softtek.pruebas.modelo.Calculadora;
import com.softtek.pruebas.modelo.HerenciaEj1_Circulo;
import com.softtek.pruebas.modelo.HerenciaEj1_Figura;
import com.softtek.pruebas.modelo.HerenciaEj1_Rectangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PruebasTestApplicationTests {
	@BeforeEach
	public void inicio(){
		HerenciaEj1_Circulo c1 = new HerenciaEj1_Circulo();
		HerenciaEj1_Rectangulo r1 = new HerenciaEj1_Rectangulo();
	}
	@Test
	void contextLoads() throws Exception {
		//CALCULADORA
		double resultado = Calculadora.sumar(2,3);
		Assertions.assertEquals(5,resultado);

		double resultado1 = Calculadora.restar(6,4);
		Assertions.assertEquals(2,resultado1);

		double resultado2 = Calculadora.multiplicar(5,4);
		Assertions.assertEquals(20,resultado2);


		Assertions.assertThrowsExactly(Exception.class,()->Calculadora.division(20,0));
		double resultado4 = Calculadora.division(25,5);
		Assertions.assertEquals(5,resultado4);


		//CIRCULO
		double areaCirculo = HerenciaEj1_Circulo.areaCirculo(3);
		Assertions.assertEquals(28,areaCirculo);

		//RECTANGULO
		double areaRectangulo = HerenciaEj1_Rectangulo.areaRectangulo(5,6);
		Assertions.assertEquals(30,areaRectangulo);
	}

}
