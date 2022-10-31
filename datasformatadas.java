package datahoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datasformatadas {
    public static void main(String[] args) {

        LocalDate d08 = LocalDate.parse("2022-07-20");
        LocalDateTime d09 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-2021T01:30");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_INSTANT;
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println(d09.format(fmt1));
        System.out.println(d08.format(fmt2));
        // usando a função (.format) ele faz com a variaveis fmt1 entre dentro da d08 da forma customizada que nós queriamos.


        //como imprimir um horario global usando o (instant) que o método instant é a referencia principal para imprimir horarios globais.
        System.out.println(d09.format(fmt4));

        System.out.println(d06.toString());




    }
}
