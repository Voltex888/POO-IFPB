package Aula05;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    static void main() {
        Agendamento p1 = new Agendamento();
        Agendamento p2 = new Agendamento("João");
        Agendamento p3 = new Agendamento("Matheus", LocalDateTime.of(2026, 4, 6, 0, 0), "Consulta");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
