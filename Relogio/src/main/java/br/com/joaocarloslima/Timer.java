package br.com.joaocarloslima;

public class Timer {
    protected Numero horas;
    protected Numero minutos;
    protected Numero segundos;
    protected boolean ligado;
    protected boolean regressivo;

    public Timer(int minutos) {
        this.horas = new Numero(0, 23);
        this.minutos = new Numero(0, 59);
        this.segundos = new Numero(0, 59);

        setTempo(minutos);
    }

    public void setTempo(int minutos) {
        double qtdHoras = (double)minutos / 60;
        double qtdMinutos = (double)minutos % 60;

        this.horas.setValor((int)qtdHoras);
        this.minutos.setValor((int)qtdMinutos);
    }

    public void start() {
        this.ligado = true;
    }

    public void stop() {
        this.ligado = false;
    }

    public void tick() {
        if (!this.isLigado()) return;

        if (this.isRegressivo()) {
            this.metodoReverso();
        } else {
            this.metodoNormal();
        }
    }

    public void metodoNormal() {
        if (this.segundos.getValor() < 59) {
            this.segundos.incrementar();
        } else {
            this.segundos.incrementar();

            if (this.minutos.getValor() < 59) {
                this.minutos.incrementar();
            } else {
                this.minutos.incrementar();
                this.horas.incrementar();
            }
        }
    }

    public void metodoReverso() {
        if (this.segundos.getValor() > 0) {
            this.segundos.decrementar();
        } else {
            this.segundos.decrementar();

            if (this.minutos.getValor() > 0) {
                this.minutos.decrementar();
            } else {
                this.minutos.decrementar();
                this.horas.decrementar();
            }
        }
    }

    public Numero getHoras() {
        return horas;
    }

    public void setHoras(Numero horas) {
        this.horas = horas;
    }

    public Numero getMinutos() {
        return minutos;
    }

    public void setMinutos(Numero minutos) {
        this.minutos = minutos;
    }

    public Numero getSegundos() {
        return segundos;
    }

    public void setSegundos(Numero segundos) {
        this.segundos = segundos;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isRegressivo() {
        return regressivo;
    }

    public void setRegressivo(boolean regressivo) {
        this.regressivo = regressivo;
    }
}
