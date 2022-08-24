package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        bemVindoEoCardapio();


        Scanner produtos = new Scanner(System.in);
        Scanner formaDePagamento = new Scanner(System.in);

        int produto = produtos.nextInt();
        int pagamento = formaDePagamento.nextInt();

        //variavies do desconto
        double descontoDebito = 0.15;
        double descontoCredito = 0.02;

        // CERVEJA
        if(produto == 1){

            double cerveja = 30.99;
            //PAGAMENTO DEBITO
            if(pagamento == 1){

                double totalDesconto = 0;
                double totalCerveja = 0;

                totalDesconto = cerveja * descontoDebito;
                totalCerveja = cerveja - totalDesconto;

                System.out.println("Voce comprou Cerveja com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalCerveja);

            }
            //PAGAMENTO CREDITO
            else{

                double totalDesconto = 0;
                double totalCerveja = 0;

                totalDesconto = cerveja * descontoCredito;
                totalCerveja = cerveja - totalDesconto;

                System.out.println("Voce comprou Cerveja com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalCerveja);
            }

        }

        // VINHO
        if(produto == 2) {

            double vinho = 979.99;
            //PAGAMENTO DEBITO
            if(pagamento == 1){

                double totalDesconto = 0;
                double totalVinho = 0;

                totalDesconto = vinho * descontoDebito;
                totalVinho = vinho - totalDesconto;

                System.out.println("Voce comprou Vinho com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalVinho);

            }
            //PAGAMENTO CREDITO
            else{

                double totalDesconto = 0;
                double totalVinho = 0;

                totalDesconto = vinho * descontoCredito;
                totalVinho = vinho - totalDesconto;

                System.out.println("Voce comprou Vinho com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalVinho);
            }
        }

        //VODKA
        if(produto == 3) {

            double vodka = 399.99;
            //PAGAMENTO DEBITO
            if(pagamento == 1){

                double totalDesconto = 0;
                double totalVodka = 0;

                totalDesconto = vodka * descontoDebito;
                totalVodka = vodka - totalDesconto;

                System.out.println("Voce comprou Vodka com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalVodka);

            }
            //PAGAMENTO CREDITO
            else{

                double totalDesconto = 0;
                double totalVodka = 0;

                totalDesconto = vodka * descontoCredito;
                totalVodka = vodka - totalDesconto;

                System.out.println("Voce comprou Vodka com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalVodka);
            }

        }

        //ENERGETICO
        if(produto == 4) {

            double energetico = 6000.00;
            //PAGAMENTO DEBITO
            if(pagamento == 1){

                double totalDesconto = 0;
                double totalEnergetico = 0;

                totalDesconto = energetico * descontoDebito;
                totalEnergetico = energetico - totalDesconto;

                System.out.println("Voce comprou Energetico com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalEnergetico);

            }
            //PAGAMENTO CREDITO
            else{

                double totalDesconto = 0;
                double totalEnergetico = 0;

                totalDesconto = energetico * descontoCredito;
                totalEnergetico = energetico - totalDesconto;

                System.out.println("Voce comprou Energetico com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalEnergetico);
            }
        }

        //WHISKY
        if(produto == 5) {

            double whisky = 1000.00;
            //PAGAMENTO DEBITO
            if(pagamento == 1){

                double totalDesconto = 0;
                double totalWhisky = 0;

                totalDesconto = whisky * descontoDebito;
                totalWhisky = whisky - totalDesconto;

                System.out.println("Voce comprou Whisky com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalWhisky);

            }
            //PAGAMENTO CREDITO
            else{

                double totalDesconto = 0;
                double totalWhisky = 0;

                totalDesconto = whisky * descontoCredito;
                totalWhisky = whisky - totalDesconto;

                System.out.println("Voce comprou Whisky com desconto de: R$"+totalDesconto+" " +
                        "e o preço final é de: R$"+totalWhisky);
            }

        }

    }

    static void bemVindoEoCardapio() {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-=-=-=-=-=-=DISTRIBUIDORA!-=-=-=-=-=-=-");
        System.out.println("BEM VINDO! --> Oque voce deseja comprar?:");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Digite:(1) para Cerveja Kaiser, no valor de: R$ 30,99");
        System.out.println("Digite:(2) para Vinho Campo Largo seco, no valor de: R$ 979,99");
        System.out.println("Digite:(3) para Vodka Balalaika, no valor de: R$ 399,99");
        System.out.println("Digite:(4) para Enegetico Rusbe, no valor de: R$ 6.000,00");
        System.out.println("Digite:(5) para Whisky Jackson, no valor de: R$ 1.000,00");

        System.out.println("Escolha a forma de pagamento abaixo:");
        System.out.println("(1) DEBITO    desconto de   15%");
        System.out.println("(2)CREDITO    desconto de   2%");

    }


}