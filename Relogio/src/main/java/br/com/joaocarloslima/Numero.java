package br.com.joaocarloslima;

public class Numero {
    private int numero;
    private int limite;

    public Numero(int numero) {
        this.numero = numero;
    }

    public Numero(int numero, int limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public void incrementar() {
        ++this.numero;
        if (numero > limite) this.setValor(0);
    }

    public void decrementar() {
        --this.numero;
        if (numero < 0) this.setValor(this.limite);
    }

    public String getValorFormatado() {
        return String.format("%2s",  String.valueOf(this.getValor())).replace(' ', '0');
    }

    public int getValor() {
        return this.numero;
    }

    public int getLimite() {
        return this.limite;
    }

    public void setValor(int valor) {
        this.numero = valor;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
