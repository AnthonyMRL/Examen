    public class Laptop implements IProducto{
        private String nombre;
        private String marca;
        private double precio;
        private int garantia;

        //Definir el constructor
        public Laptop(String nombre, String marca, double precio, int garantia) {
            this.nombre = nombre;
            this.marca = marca;
            this.precio = precio;
            this.garantia = garantia;
        }

    //Implementar los métodos

        @Override
        public String getModelo() {
            return nombre;
        }

        @Override
        public String getMarca() {
            return marca;
        }

        @Override
        public double getPrecio() {
            return precio;
        }


        public int getGarantia(){
            return garantia;
        }

        @Override
        public void imprimeDetallesProducto() {
            System.out.println("Tablet: " + nombre + ", Marca: " + marca + ", Precio: $" + precio + ", Garantia: " + garantia);
        }














    }
