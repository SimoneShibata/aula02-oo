package br.edu.unicesumar.numero;


public class Numero {

	public String porExtenso(Integer numero) {
		if (numero < 20) {
			return deUmAVinte(numero);			
		}
		if (numero > 20 && numero < 30) {
			return "vinte e " + deUmAVinte(numero%20);
		}
		if (numero > 30 && numero < 40) {
			return "trinta e " + deUmAVinte(numero%30);
		}
		return "Número inválido";
	}

	private String deUmAVinte(Integer numero) {
		switch (numero) {
		case 0:
			return "zero";
		case 1:
			return "um";
		case 2:
			return "dois";
		case 3:
			return "três";
		case 4:
			return "quatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "sete";
		case 8:
			return "oito";
		case 9:
			return "nove";
		case 10:
			return "dez";
		case 11:
			return "onze";
		case 12:
			return "doze";
		case 13:
			return "treze";
		case 14:
			return "quatorze";
		case 15:
			return "quinze";
		case 16:
			return "dezesseis";
		case 17:
			return "dezessete";
		case 18:
			return "dezoito";
		case 19:
			return "dezenove";
		case 20:
			return "vinte";
		default:
			return "Número inválido";
		}
	}
	
	private String acimaDeVinte(Integer numero) {
		switch (numero) {
		case 30:
			return "trinta";
		case 1:
			return "quarenta";
		case 2:
			return "cinquenta";
		case 3:
			return "sessenta";
		case 4:
			return "setenta";
		case 5:
			return "oitenta";
		case 6:
			return "noventa";
		default:
			return "Número inválido";
		}
	}

}
