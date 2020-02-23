package Romis;

public class Livraria {

    private String nome;
    private String cnpj;


    public Livraria(String nome, String cnpj){

        this.nome = nome;
        this.cnpj = cnpj;

    }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome(){
        return this.nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + 
                ", cnpj='" + cnpj ;
    }

    public int saldo(int x, int y){
        return y - x;
    }

    public String saldoAlto(int x, int y){
        final String s = (y - x) > 500 ? "Saldo alto" : "Saldo baixo";
        return s;
    }

    public boolean folga(int dias){
        return dias >= 5;
    }



}
