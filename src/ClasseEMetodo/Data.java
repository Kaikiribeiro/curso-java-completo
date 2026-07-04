package ClasseEMetodo;

public class Data {
  int dia;
  int mes;
  int ano;

  public Data() {
    this(1, 1, 1970);
  }

  public Data(int dia, int mes, int ano) {
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;
  }

  String obterDataFormatada() {
    return String.format("%02d/%02d/%d", dia, mes, ano);
  }
}
