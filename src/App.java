import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
        //dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
        //do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
        //45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
        Scanner sc = new Scanner(System.in); 
        Custos c = new Custos();
        
        System.out.println("Informe o valor do carro");
        c.setFabri(0.27);
        c.setValor(sc.nextDouble());
        System.out.println("O custo de fabricação é: R$" + c.CustoFabri( 0, 0, 0));

        System.out.println("Informe o o custo de fabrica");
        c.setCustoFab(sc.nextDouble());
        System.out.println("O seu veiculo custará: R$" + c.CustosImpostos(0, 0, 0));
        

    
        }
    }

