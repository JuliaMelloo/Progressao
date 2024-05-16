class ProgressaoAritmetica extends Progressao {
    private int incremento;

    public ProgressaoAritmetica(int inicio, int incremento) {
        super(inicio);
        this.incremento = incremento;
    }

    protected void avancar() {
        atual += incremento;
    }
}
