package poo.taller.punto2b.dominio;

import poo.taller.punto2a.dominio.Mecato;

import java.util.*;
import java.util.stream.Collectors;

public class AgendaTelefonica {
    private String version;
    private List<Contacto> contactos;

    public AgendaTelefonica(String version) {
        this.version = version;
        this.contactos = new ArrayList<>();
    }

    public boolean CrearContacto(Contacto contacto) {
        return true;
    }

    public boolean EliminarContacto(String nombre, String apellido) {
        return true;
    }

    public Contacto BuscarContactoNombre(String nombre) {
        Contacto contactoNombre = this.getContactos().stream().filter(contacto -> {
            return contacto.getNombre() == nombre;
        }).findFirst().orElse(null);

        System.out.println("Se encontró el contacto: " + contactoNombre.getNombre() + " " + contactoNombre.getApellido() + " con número de celular: " + contactoNombre.getNumeroCelular());
        return contactoNombre;
    }

    public Contacto BuscarContactoApellido(String apellido) {
        Contacto contactoApellido = this.getContactos().stream().filter(contacto -> {
            return contacto.getApellido() == apellido;
        }).findFirst().orElse(null);

        System.out.println("Se encontró el contacto: " + contactoApellido.getNombre() + " " + contactoApellido.getApellido() + " con número de celular: " + contactoApellido.getNumeroCelular());
        return contactoApellido;
    }

    public Contacto BuscarContactoNumero(String numero) {
        Contacto contactoNumero = this.getContactos().stream().filter(contacto -> {
            return contacto.getNumeroCelular() == numero;
        }).findFirst().orElse(null);

        System.out.println("Se encontró el contacto: " + contactoNumero.getNombre() + " " + contactoNumero.getApellido() + " con número de celular: " + contactoNumero.getNumeroCelular());
        return contactoNumero;
    }

    public void CambiarNumeroCelular(String nombre, String apellido, String nuevoNumero) {
        this.getContactos().stream().filter(contacto -> (contacto.getNombre() == nombre) && contacto.getApellido() == apellido)
                .findFirst().ifPresent(contacto -> contacto.setNumeroCelular(nuevoNumero));
        System.out.println("Se cambio exitosamente el número de celular ");
    }

    public List<String> OrdenarContactosOrdenAlfabetico() {
        List<String> OrdenAlfabetico = new ArrayList<>();
        //Collections.sort();
        
        return OrdenAlfabetico;
    }

    public String getVersion() {
        return version;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
