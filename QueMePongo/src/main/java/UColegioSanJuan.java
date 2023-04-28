import Enum.*;
public class UColegioSanJuan extends confeccion{
    public Prenda crearParteSuperior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.CHOMPA);
        b.setColorP(colorPrimario.VERDE);
        b.setM(material.PIQUE);
        return b.crearPrenda();
    }
    public Prenda crearParteInferior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.PANTALON);
        b.setColorP(colorPrimario.GRIS);
        b.setM(material.ACETATO);
        return b.crearPrenda();
    };
    public Prenda crearCalzado(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.ZAPATOS);
        b.setColorP(colorPrimario.BLANCO);
        b.setM(material.CUERO);
        return b.crearPrenda();
    };
}
