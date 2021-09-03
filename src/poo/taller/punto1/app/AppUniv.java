package poo.taller.punto1.app;

import poo.taller.punto1.dominio.Asignatura;
import poo.taller.punto1.dominio.Docente;
import poo.taller.punto1.dominio.Estudiante;
import poo.taller.punto1.dominio.Nota;

import java.util.Arrays;


public class AppUniv {
    public static void main(String[] args) {
        Docente profe = new Docente("1234", "Alejo Ramirez");
        Asignatura poo = new Asignatura("POO", profe);

        Estudiante lema = new Estudiante("34356", "Alejandro Lema");
        Nota notaLema = new Nota(poo);
        notaLema.setNotaParcial(3);
        notaLema.setNotaFinal(4.7);
        notaLema.setNotasSeguimiento(Arrays.asList(5.0, 1.0, 2.5, 4.0, 3.2));
        lema.setNota(notaLema);

        Estudiante jorge = new Estudiante("22222", "Jorge Restrepo");
        Nota notajorge = new Nota(poo);
        notajorge.setNotaParcial(4.8);
        notajorge.setNotaFinal(4.9);
        notajorge.setNotasSeguimiento(Arrays.asList(4.4, 5.0, 4.7, 4.2, 4.9));
        jorge.setNota(notajorge);

        Estudiante david = new Estudiante("68790", "David Ayala");
        Nota notadavid = new Nota(poo);
        notadavid.setNotaParcial(5);
        notadavid.setNotaFinal(4.0);
        notadavid.setNotasSeguimiento(Arrays.asList(4.2, 2.9, 4.5, 5.0, 4.7));
        david.setNota(notadavid);

        poo.getEstudiantes().add(lema);
        poo.getEstudiantes().add(jorge);
        poo.getEstudiantes().add(david);

        calcularDefinitivaDelCurso(poo);

    }

    private static void calcularDefinitivaDelCurso(Asignatura curso) {
        for (Estudiante estudiante: curso.getEstudiantes()) {
            double definitiva = estudiante.getNota().calcularDefinitiva();

            if (definitiva < 3) {
                System.out.println(estudiante.getNombre() + " perdió " + curso.getNombre() + " porque  sacó " + definitiva);
            } else {
                System.out.println(estudiante.getNombre() + " GANÓ " + curso.getNombre() + " porque sacó " + definitiva + "🚀");
            }
        }
    }
}
