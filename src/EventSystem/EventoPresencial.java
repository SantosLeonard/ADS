package EventSystem;

import java.time.LocalDate;

public class EventoPresencial extends Evento{

    private String location;
    private int maxCapacity;

    public EventoPresencial(String name, LocalDate date, String description, Usuario organizer, String location, int maxCapacity) {
        super(name, date, description, organizer);
        this.location = location;
        this.maxCapacity = maxCapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void addParticipants(Usuario participants){
        if (this.getMaxCapacity() <= this.maxCapacity){
            try {
                super.addParticipants(participants);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "EventoPresencial{" +
                super.toString() +
                "location='" + location + '\'' +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}

