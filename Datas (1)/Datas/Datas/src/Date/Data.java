package Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Data {
    //Atributos 
    private int ano;
    private int mes;
    private int dia;
    Scanner sc = new Scanner(System.in);
    Calendar c = Calendar.getInstance();

    public void pegaData(Boolean niver) {
        if (!niver) {
            System.out.println("Digite o ano atual:");
            this.ano = sc.nextInt();
            System.out.println("Digite o mês atual:");
            this.mes = sc.nextInt();
            System.out.println("Digite o dia atual:");
            this.dia = sc.nextInt();
        } else {
            System.out.println("Digite o ano de seu nascimento:");
            this.ano = sc.nextInt();
            System.out.println("Digite o mês de seu nascimento:");
            this.mes = sc.nextInt();
            System.out.println("Digite o dia de seu nascimento:");
            this.dia = sc.nextInt();
        }
        
    }

    public void mostraData() {
        System.out.println("A data que você digitou é: ");
        System.out.println(this.ano + " / " + this.mes + " / " + this.dia);
    }

    public void dataStatus() {
        System.out.println("Dia do mês atual: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês atual: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Ano atual: " + c.get(Calendar.YEAR));
        System.out.println("A hora atual: " + c.get(Calendar.HOUR));
        System.out.println("O minuto atual: " + c.get(Calendar.MINUTE));
        System.out.println("O segundo atual: " + c.get(Calendar.SECOND));
    }

    public void ValidaVacina() {
        pegaData(false);
        System.out.println("A próxima data que você terá de tomar a vacina é: " + this.ano + " / " + (c.get(Calendar.MONTH) + 3) + " " + this.dia);
    }

    public void comparaDatas() {
        pegaData(true);
        LocalDate l = LocalDate.of(this.ano, this.mes, this.dia);
        LocalDate lb = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        Period periodo = Period.between(l, lb);
        System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias ");
        if (periodo.getYears() < 14) {
            System.out.println("Não pode trabalhar");
        } else if (periodo.getYears() <= 16) {
            System.out.println("Pode ser menor aprendiz");
        } else if (periodo.getYears() > 16 && periodo.getYears() < 65) {
            System.out.println("Pode trabalhar empregado");
        } else {
            System.out.println("Pode aposentar");
        }
    }

   
    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
