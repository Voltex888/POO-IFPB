public class Circulo {
    double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public boolean contemOutro(Circulo outro) {
            return raio > outro.raio;
    }
    public Circulo maior(Circulo outro){
        if (this.raio > outro.raio) {
            return this;
        }
        return outro;
    }
    public void exibirDados() {
        System.out.println("Raio: " + String.format("%.2f", raio));
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Circunferência: " + String.format("%.2f", calcularCircunferencia()));
    }
}   public void main(String[] args) {
        Circulo r1 = new Circulo(5);
        Circulo r2 = new Circulo(3);
        // antes de dobrar
        r1.exibirDados();
        r1.raio = r1.raio * 2;
        //depois que dobrou
        r1.exibirDados();
        if (r1.contemOutro(r2)){
            System.out.println("O primeiro contem o segundo");
            } else if (r2.contemOutro(r1)){
                System.out.println("O segundo contem o primeiro");
            } else {
                System.out.println("Ambos são do mesmo tamanho");
                }
        //ver qual é o maior circulo
        Circulo maior = r1.maior(r2);

        System.out.println("O circulo maior:");
        maior.exibirDados();
}
