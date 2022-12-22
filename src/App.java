import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
        //dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
        //do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
        //45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;

        Scanner sc = new Scanner(System.in);
        double total, imposto, dist, custoFab, valor, porc, fabri;
        fabri = 0.27;
        int caso;

        System.out.println("1 - Para descobrir o custo de frabica");
        System.out.println("2 - Para descobrir o custo do carro");
        System.out.println("3 - Para finalizar sessão");
        caso = sc.nextInt();
        while(caso != 3) {
            if(caso == 1) {
                System.out.println("Informe o valor do carro");
                valor = sc.nextFloat();
                
                porc = valor * fabri;
                System.out.println("O custo de fabrica é: R$" + porc);
                
            } else if (caso == 2) {
                System.out.println("Informe o custo de fabrica");
            custoFab = sc.nextFloat();
            imposto = custoFab * 0.45;
            dist = custoFab * 0.28;
            total = custoFab + dist + imposto;
            System.out.println("O seu veiculo custará: R$" + total);
            }
            System.out.println("1 - Para descobrir o custo de frabica");
            System.out.println("2 - Para descobrir o custo do carro");
            System.out.println("3 - Para finalizar sessão");
            caso = sc.nextInt();
        }
    }
}
