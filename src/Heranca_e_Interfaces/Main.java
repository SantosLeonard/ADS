package Heranca_e_Interfaces;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        System.out.println("---Events System---");
        Usuario user1 = new Usuario("John");
        Usuario user2 = new Usuario("Clayton");
        Usuario user3 = new Usuario("Andre");

        System.out.println("---Event 1---");
        String description1 = "evento top pra ser feliz!";
        Evento event1 = new EventoPresencial("Java for Dummies", LocalDate.of(2020,8,10),description1 ,user1,"SENAI/SC",20);
        event1.addParticipants(user2);

        System.out.println("---Event 2---");
        String description2 = "evento top pra ser triste!";
        Evento event2 = new EventoVirtual("PostgreSQL for Dummies", LocalDate.of(2020,8,10),description2 ,user1,"https://eventosmassas.com.br/issoae");
        event2.addParticipants(user1);
        event2.addParticipants(user2);
        event2.addParticipants(user3);
        event2.delParticipants(user2);

        System.out.println("---End---");


        System.out.println("COMPROMISSO");
        Compromisso comp = new Compromisso("isso ai",LocalDate.of(2020,9,10));
        System.out.println(comp);

        Agendamento[] agen = new Agendamento[3];
        agen[0] = event1;
        agen[1] = event2;
        agen[2] = comp;
        for (Agendamento agendamento : agen){
            System.out.println(agendamento);
        }

    }
}
