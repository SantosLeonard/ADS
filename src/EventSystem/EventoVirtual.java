package EventSystem;

import java.time.LocalDate;

public class EventoVirtual extends Evento{

    private String url;

    public EventoVirtual(String name, LocalDate date, String description, Usuario organizer, String url) {
        super(name, date, description, organizer);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "EventoVirtual{" +
                super.toString() +
                "url='" + url + '\'' +
                '}';
    }
}
