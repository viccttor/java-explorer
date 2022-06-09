package br.com.javaExplorer.classeObjeto.data;

public class Date {

	int dia;
	int mes;
	int ano;

	Date() {
		ano = 1;
		mes = 1;
		ano = 1970;
	}

	Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}

	String imprimirDataFormatada() {
		return String.format("\n%d/%d/%d", dia, mes, ano);

	}

}
