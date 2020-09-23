package EventSystem;

import java.time.LocalDate;

public class Compromisso implements Agendamento{

    private String name;
    private LocalDate date;

    public Compromisso(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
