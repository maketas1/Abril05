package com.softtek.presentacion.java_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Ejercicios {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
        h();
        i();
        j();
    }

    public static void a() {
        System.out.println("Apartado A");
        LocalDate fechaInicioCurso = LocalDate.of(2024, 3, 15);
        LocalDate fechaCursoMas10Dias = fechaInicioCurso.plusDays(10);
        System.out.println("Fecha de inicio del curso: " + fechaInicioCurso);
        System.out.println("Fecha después de 10 días: " + fechaCursoMas10Dias);
        System.out.println(" ");
    }

    public static void b() {
        System.out.println("Apartado B");
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("Fecha de hoy: " + fechaHoy);
        System.out.println(" ");
    }

    public static void c() {
        System.out.println("Apartado C");
        ZoneId zonaSydney = ZoneId.of("Australia/Sydney");
        LocalDate fechaHoySydney = LocalDate.now(zonaSydney);
        System.out.println("Fecha de hoy en Sydney: " + fechaHoySydney);
        System.out.println(" ");
    }

    public static void d() {
        System.out.println("Apartado D");
        LocalDate dia100De2024 = LocalDate.ofYearDay(2024, 100);
        System.out.println("Día 100 de 2024: " + dia100De2024);
        System.out.println(" ");
    }

    public static void e() {
        System.out.println("Apartado E");
        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate nochevieja = LocalDate.of(2024, 12, 31);

        System.out.println("¿Navidad antes de Nochevieja? " + navidad.isBefore(nochevieja));
        System.out.println("¿Navidad después de Nochevieja? " + navidad.isAfter(nochevieja));
        System.out.println(" ");
    }

    public static void f() {
        System.out.println("Apartado F");
        LocalDate fechaBase = LocalDate.of(2024, 3, 15);
        LocalDate fechaResultado = fechaBase.plus(35, ChronoUnit.WEEKS);
        System.out.println("Fecha después de 35 semanas: " + fechaResultado);
        System.out.println(" ");
    }

    public static void g() {
        System.out.println("Apartado G");
        LocalDate fechaInicioTrabajo = LocalDate.of(2012, 7, 6);
        LocalDate fechaHoy = LocalDate.now();
        Period periodoTrabajo = Period.between(fechaInicioTrabajo, fechaHoy);
        System.out.println("Años trabajados: " + periodoTrabajo.getYears());
        System.out.println(" ");
    }

    public static void h() {
        System.out.println("Apartado H");
        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        LocalDate fechaHoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaHoy);
        System.out.println("Edad: " + edad.getYears() + " años");
        System.out.println(" ");
    }

    public static void i() {
        System.out.println("Apartado I");
        LocalDate fechaEntrega = LocalDate.of(2024, 10, 2);
        long duracionDias = 200;
        LocalDate fechaInicioProyecto = fechaEntrega.minus(duracionDias, ChronoUnit.DAYS);
        System.out.println("Fecha de inicio del proyecto: " + fechaInicioProyecto);
        System.out.println(" ");
    }

    public static void j() {
        System.out.println("Apartado J");
        LocalDate fechaInicioProyecto = LocalDate.of(2024, 3, 15);
        LocalDate fechaFinProyecto = LocalDate.of(2024, 10, 20);

        Period periodoProyecto = Period.between(fechaInicioProyecto, fechaFinProyecto);
        System.out.println("Duración del proyecto: " +
                periodoProyecto.getYears() + " años, " +
                periodoProyecto.getMonths() + " meses, " +
                periodoProyecto.getDays() + " días");
    }
}
