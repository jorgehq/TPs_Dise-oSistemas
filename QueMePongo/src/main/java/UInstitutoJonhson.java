import Enum.*;
public class UInstitutoJonhson  extends confeccion{

    public Prenda crearParteSuperior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.CAMISA);
        b.setColorP(colorPrimario.BLANCO);
        b.setM(material.PIQUE);
        return b.crearPrenda();
    };

    public Prenda crearParteInferior(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.PANTALON);
        b.setColorP(colorPrimario.NEGRO);
        b.setM(material.ACETATO);
        return b.crearPrenda();

    }
    public Prenda crearCalzado(){
        Borrador b=new Borrador();
        b.setTipo(tipoPrenda.ZAPATOS);
        b.setColorP(colorPrimario.NEGRO);
        b.setM(material.CUERO);
        return b.crearPrenda();
    }

}
