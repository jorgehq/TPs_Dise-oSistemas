import Enum.*;


public class Prenda {
        private  tipoPrenda tipo;
        private categoria cate;
        private material m;

        private colorPrimario colorP;

        private colorSecundario colorS;

        public Prenda(tipoPrenda tipo, categoria cate, material m,colorPrimario colorP) {
                this.tipo = tipo;
                this.cate = cate;
                this.m = m;
                this.colorP = colorP;
        }

        @Override
        public String toString() {
                return "Prenda{" +
                        "tipo=" + tipo +
                        ", cate=" + cate +
                        ", m=" + m +
                        ", colorP=" + colorP +

                        '}';
        }

        public Prenda() {
        }

        public material getMaterial() {
                return m;
        }

        public void setMaterial(material m) {
                this.m = m;
        }

        public void setTipo(tipoPrenda tipo) {
                this.tipo = tipo;
        }

        public void setCate(categoria cate) {
                this.cate = cate;
        }

        public void setColorP(colorPrimario colorP) {
                this.colorP = colorP;
        }

        public void setColorS(colorSecundario colorS) {
                this.colorS = colorS;
        }

        public tipoPrenda getTipo() {
                return tipo;
        }

        public categoria getCate() {
                return cate;
        }

        public colorPrimario getColorP() {
                return colorP;
        }

        public colorSecundario getColorS() {
                return colorS;
        }
}
