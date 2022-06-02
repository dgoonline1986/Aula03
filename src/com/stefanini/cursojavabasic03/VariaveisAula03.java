package com.stefanini.cursojavabasic03;

public class VariaveisAula03 {

	public static void main(String[] args) {
		System.out.println("VARIAVEIS DO TIPO PRIMITIVO \r \n");
		byte numbyte=127;
		System.out.println(numbyte + " Variavel tipo byte 1 byte - 8 bits = -128-127 - números inteiros \r ");
		short numshort=12321;
		System.out.println(numshort + " Variavel do Tipo Short -> 2 bytes - 16 bits = -32768 a +32767 - números inteiros \r ");
		int numInt=2147483647;
		System.out.println(numInt + " Variavel do tipo int- > 4 bytes - 32 bits = -2147483648 a + 2147483647 - números inteiros \r ");
		long numLong=2147483647l;
		System.out.println(numLong + " Variavel do Tipo long->  8 bytes - 64 bits = -922337203685477808 a 922337203685477807 - números inteiros \r");
		float numFloat=10.000f;
		System.out.println(numFloat + " Variavel do tipo float-> 4 bytes - 32 bits = aproximadamente 3.40282347E+38 = Ponto flutuante \r");
		double numDouble=100000000000000.000;
		System.out.println(numDouble +" Variavel do tipo double->  8bytes - 64 bits = 1.79769313486231570W+308 = Ponto Flutuante \r");
		char varChar='F';
		System.out.println(varChar + " Variavel do tipo char- > Caracteres Unicode 16 bits = 0 a 65536 = caracteres");
		boolean varBoolean= true;
		System.out.println(varBoolean + " Variavel do tipo boolean-> 1 byte  Possuem valores True e false = booleano\r \n");
		
		
		System.out.println("VARIAVEIS TIPO CLASSE \r \n");
		
		String texto="Bem vindo";
		System.out.println(texto + " Variavel do tipo String \r");
		
		Integer numeroConta=4000;
		System.out.println(numeroConta + " Variavel do integer \r");
				

	}
}