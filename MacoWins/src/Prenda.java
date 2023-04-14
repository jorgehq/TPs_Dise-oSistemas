public class Prenda {
    private Double precio;
    private Enum tipo;
    private Enum estado;

    public Prenda() {
    }

    @Override
    public String toString() {
        return
                "precio=" + precio +
                ", tipo=" + tipo ;
    }

    public Prenda(Double precio, Enum tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    public Double calcularPrecio() {
        return precio;
    }

    public Enum tipoPrenda() {
        return tipo;
    }

    public Enum getEstado() {
        return estado;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }
}
