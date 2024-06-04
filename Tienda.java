import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda{
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }


    //Implementar los métodos
    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos(){
        double precio = 0;
        for (IProducto producto : productos) {
            precio += producto.getPrecio();
        }
        return precio/productos.size();
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        double maxPrecio = 0;
        IProducto productoMasCostoso = null;
        for (IProducto producto : productos) {
            if (producto.getPrecio() > maxPrecio) {
                maxPrecio = producto.getPrecio();
                productoMasCostoso = producto;
            }
        }
        return productoMasCostoso;
    }


    //Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre){
        //Implementar método
        return true;
    }




}



