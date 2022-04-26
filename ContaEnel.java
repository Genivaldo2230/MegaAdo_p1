/*EXERCICIO 4
Dado a quantidade de kWh consumidos e o preço unitário por kWh
(Enel/SP), calcular a tarifa da conta de luz (desconsiderar impostos e
extras)
 */


import java.util.Scanner;

public class ContaEnel {
    public static void main(String[] args) {
        int kWh;
        int BandeiraVerde, BandeiraAmarela, BandeiraVermelha;
        float total;

        Scanner sc = new Scanner(System.in);
        {

            total = 0.00f;

            System.out.println("Digite o Numeros do Relogio inicial: ");
            kWh = sc.nextInt();
        }

        if (kWh <= 0) {

            total = (float) (kWh * 0.20);

            total = (float) (kWh * 0.20);
        } else if (kWh >= 150 && kWh < 500) {
            total = (float) (kWh * 0.25);
        } else {
            total = (float) (kWh * 0.30);

        }
        if (total <= 11.90) {
            total = (float) 11.90;
            System.out.println("Conta valor Minimo R$: " + total);

        }
        System.out.println("Valor da conta a pagar R$: " + total);

    }
}
/*
        As bandeiras principais são:
Bandeira verde: condições favoráveis de geração de energia. A tarifa não sofre nenhum acréscimo.

Bandeira amarela: condições de geração menos favoráveis. A tarifa aplica um acréscimo de R$ 1,874
para cada 100 quilowatts-hora (kWh) consumidos.
Bandeira vermelha – Patamar 1: condições mais custosas de geração. A tarifa aplica um acréscimo
de R$ 3,971 para cada 100 quilowatts-hora (kWh) consumidos.
Bandeira vermelha – Patamar 2: condições ainda mais custosas de geração. A tarifa aplica um acréscimo de
R$ 9,49 a cada 100 quilowatts-hora (kWh) consumidos.
No entanto, em setembro de 2021, a ANEEL informou que entraria em vigor a bandeira de escassez hídrica, a mais cara do
sistema, que acrescenta 14,20 reais a cada 100 kWh consumidos. Ela deve ser mantida até abril de 2022.  */

           /* System.out.println("Bandeira verde: condições favoráveis de geração de energia. A tarifa não sofre nenhum acréscimo");
        }



        System.out.println("Bandeira amarela: condições de geração menos favoráveis. A tarifa aplica um acréscimo de R$ 1,874");
        System.out.println("Bandeira vermelha – Patamar 1: condições mais custosas de geração. A tarifa aplica um acréscimo \n" +
                "de R$ 3,971 para cada 100 quilowatts-hora (kWh) consumidos. ");

    }

}
*/

