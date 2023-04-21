import Enum.*;
public class main {
    public static void main(String[] args) {
        /*
        * Al incluir 5 prendas podemos observar que 3 prendas no son ingresadas a la lista, esto es asi por las
        * restricciones que se impuso siendo estas que tipo y categoria tengan logica y que toda prenda
        * no tenga atributos nulos.
        *
        * */
        Atuendo at=new Atuendo();
        at.addPrenda(tipoPrenda.REMERA,categoria.PARTE_SUPERIOR,material.ALGODON,colorPrimario.ROJO);
        at.addPrenda(tipoPrenda.REMERA,categoria.CUBRE_PIERNA,material.LANA,colorPrimario.ROJO);
        at.addPrenda(tipoPrenda.CAMPERA,categoria.PARTE_SUPERIOR,material.ALGODON,colorPrimario.AZUL);
        at.addPrenda(tipoPrenda.ZAPATOS,categoria.CALZADO,material.ALGODON,null);
        at.addPrenda(tipoPrenda.ANILLO,categoria.CALZADO,material.ALGODON,colorPrimario.AMARILLO);
        at.mostrarListaPrendas();
    }
}
