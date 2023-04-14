import static Enum.estado.PROMOCION;

public class Promocion extends Prenda{
    private Double valorDescuento;

    public Promocion() {
    }

    public Promocion(Double precio, Enum tipo, Double valorDescuento) {
        super(precio, tipo);
        this.valorDescuento = valorDescuento;
        this.setEstado(PROMOCION);
    }

    @Override
    public Double calcularPrecio() {
        return super.calcularPrecio()-valorDescuento;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                super.toString()+
                '}';
    }

    public Double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
}
