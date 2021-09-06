package poo.taller.punto2b.app;

import poo.taller.punto2b.dominio.AgendaTelefonica;
import poo.taller.punto2b.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        AgendaTelefonica agendaJorge = new AgendaTelefonica("1.0");

        Contacto contacto1 = new Contacto("Alejo", "Ramirez", "3137846545");
        Contacto contacto2 = new Contacto("Sebastian", "Yepes", "3136528478");
        Contacto contacto3 = new Contacto("Daniel", "Lopez", "3002308456");
        Contacto contacto4 = new Contacto("Mateo", "Garcia", "3008384574");
        Contacto contacto5 = new Contacto("victor", "Vallejo", "3015698741");
        Contacto contacto6 = new Contacto("Alejo", "Perez", "5684897");


        agendaJorge.getContactos().add(contacto1);
        agendaJorge.getContactos().add(contacto2);
        agendaJorge.getContactos().add(contacto3);
        agendaJorge.getContactos().add(contacto4);
        agendaJorge.getContactos().add(contacto5);
        agendaJorge.getContactos().add(contacto6);


//        agendaJorge.BuscarContactoNombre("Alejo");
//        agendaJorge.BuscarContactoApellido("Vallejo");
//        agendaJorge.BuscarContactoNumero("3008384574");
//        agendaJorge.BuscarContactoApellido("Perez");
//        agendaJorge.BuscarContactoApellido("Yepes");
//        agendaJorge.CambiarNumeroCelular("Alejo", "Perez", "3002021051");
//        agendaJorge.BuscarContactoApellido("Perez");
//        agendaJorge.BuscarContactoApellido("Yepes");

          agendaJorge.OrdenarContactosOrdenAlfabetico();

        //Contacto contact1 = agendaJorge.BuscarContactoNombre("Alejo");
        //System.out.println("Se encontró el contacto " + contact1.getNumeroCelular());




    }
}
