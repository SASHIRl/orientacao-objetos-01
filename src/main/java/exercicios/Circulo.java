package exercicios;

public class Circulo {
    public Double PI;
    public Double raio;

    public Double calcularArea() { return PI * (raio * raio) }
    public Double calcularPerimetro() { return raio * (2 * PI) }
}