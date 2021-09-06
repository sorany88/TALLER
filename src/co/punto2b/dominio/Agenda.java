package co.punto2b.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }
    public List<Contacto> getContactosPorNombre(String nombre) {
        List<Contacto> contac = this.getContactos().stream().filter(c -> {
            return c.getNombre() == nombre;
        }).collect(Collectors.toList());
        return contac;
    }
    public List<Contacto> getContactosPorApellido(String apellido) {
        List<Contacto> contac = this.getContactos().stream().filter(c -> {
            return c.getApellido() == apellido;
        }).collect(Collectors.toList());
        return contac;
    }
    public Contacto getContactosPorNumeroFuncional(int numero) {
        Contacto cnum = this.getContactos().stream().filter(c -> {
            return c.getNumero() == numero;
        }).findFirst().orElse(null);

        return cnum;
    }
    public List<Contacto> getContactos() {
        return contactos;
    }

    //public void setContactos(List<Contacto> contactos) {
    //    this.contactos = contactos;
    //}

}
