package EventSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento implements Agendamento{

    private String name;
    private LocalDate date;
    private String description;
    private Usuario organizer;
    private List<Usuario> participants;
    private int positionParticipants = 0;

    public Evento(String name, LocalDate date, String description, Usuario organizer) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.organizer = organizer;
        this.participants = new ArrayList<Usuario>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Usuario getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Usuario organizer) {
        this.organizer = organizer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addParticipants(Usuario participants) throws Exception {
        if(participants == this.organizer){
            throw new Exception("The informed participant is the event organizer!");
        }
        this.participants.add(participants);
    }

    public void delParticipants(Usuario participants){
        this.participants.remove(participants);
    }

    protected void verificarLimitesPacote(){
        switch (this.organizer.getPacote()){
            case FREE:
                if (this.participants.size() == 30){
                    throw new RuntimeException("The package allows event for up to 30 participants!");
                }
                break;
            case BASIC:
                if (this.participants.size() == 30){
                    throw new RuntimeException("The package allows event for up to 30 participants!");
                }
                break;
            case PROFESSIONAL:
                if (this.participants.size() == 30){
                    throw new RuntimeException("The package allows event for up to 30 participants!");
                }
                break;
            case PREMIUM:
                if (this.participants.size() == 30){
                    throw new RuntimeException("The package allows event for up to 30 participants!");
                }
                break;
            default: break;
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", organizer=" + organizer +
                ", participants=" + participants +
                ", positionParticipants=" + positionParticipants +
                '}';
    }
}
