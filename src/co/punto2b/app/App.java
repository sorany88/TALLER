package co.punto2b.app;

import co.punto2b.dominio.Agenda;
import co.punto2b.dominio.Contacto;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contacto contacto1 = new Contacto("Sandra", 312432);
        Contacto contacto2 = new Contacto("Brayan", 332468);
        agenda.getContactos().add(contacto1);
        agenda.getContactos().add(contacto2);

        List<Contacto> contactoAEncontrar = agenda.getContactosPorNombre("Sa");
        Contacto ContactoPorNumero = agenda.getContactosPorNumeroFuncional(312);
        agenda.getContactos().forEach(h -> {
            System.out.println("Numero ede la habitación " + h.getNombre());
        });
    }
}
