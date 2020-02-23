package Romis;

public class Livro {

    public static void main(String[] args){
        System.out.println("Olá mundo");
        Livraria l1 = new Livraria("StarFenix", "00000000");

        Cadastro c1 = new Cadastro();

        System.out.println(l1);

        System.out.println(l1.saldo(5,6));

        System.out.println(l1.saldoAlto(1000, 8000));

        System.out.println(l1.folga(8));
    }
}
