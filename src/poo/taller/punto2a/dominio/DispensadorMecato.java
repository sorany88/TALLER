package poo.taller.punto2a.dominio;

import java.util.ArrayList;
import java.util.List;

public class DispensadorMecato {
    private String marca;
    private List<Mecato> productos;

    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.productos = new ArrayList<>();
    }

    public boolean sacarUnidad(int codigo) {
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodigo() == codigo) {
                this.productos.get(i).sacarProducto();
                //System.out.println("Gracias por comprar, disfrute sus " + this.productos.get(i).getNombre());
            }
        }
        return true;
    }

    public boolean sacarUnidad(String nombre) {
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getNombre() == nombre) {
                this.productos.get(i).sacarProducto();
                //System.out.println("Gracias por comprar, disfrute sus " + this.productos.get(i).getNombre());
            }
        }
        return true;
    }

    public List<String> consultarAgotados() {
        ArrayList<String> productosagotados = new ArrayList<String>();
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCantidadActual() == 0) {
                productosagotados.add(this.productos.get(i).getNombre());
            }
        }
        System.out.println("Los productos que se encuentran agotados son: " + productosagotados );
        return productosagotados;

    }

    public int consultarUnidades(int codigo) {
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodigo() == codigo) {
                System.out.println(this.productos.get(i).getCantidadActual() + " Unidades disponibles de " + this.productos.get(i).getNombre());
                return this.productos.get(i).getCantidadActual();
            }
        }
        return 0;
    }

    public int consultarTotalUnidades() {
        int totalUnidades = 0;
        for (int i = 0; i < this.productos.size(); i++) {
            totalUnidades += this.productos.get(i).getCantidadActual();
        }
        System.out.println(totalUnidades + " es el numero total de unidades disponibles en la máquina");
        return totalUnidades;
    }

    public void aumentarStock(int codigo, int cantidad) {
        this.productos.stream()
                .filter(mecato -> mecato.getCodigo() == codigo)
                .findFirst()
                .ifPresent(mecato -> mecato.setCantidadActual(cantidad + mecato.getCantidadActual()));

        System.out.println("Se agrego al stock del producto " + codigo + " exitosamente " + cantidad + " unidades, la nueva cantidad es: " );
    }

    public String getMarca() {
        return marca;
    }

    public List<Mecato> getProductos() {
        return productos;
    }

    public void setProductos(List<Mecato> productos) {
        this.productos = productos;
    }
}
