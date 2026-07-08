package ClasseEMetodo;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data(10, 4, 2006);
    Data d2 = new Data();
    Data d3 = new Data();
    Data d4 = d1;

    d4.dia = 25;

    d2.dia = 2;
    d2.mes = 5;
    d2.ano = 2026;

    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());
    System.out.println(d3.obterDataFormatada());
    System.out.println(d4.obterDataFormatada());
  }
}
