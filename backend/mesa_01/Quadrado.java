package mesa_01;

public class Quadrado extends Figura
{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro()
    {
        return 4 * getLado();
    }
}