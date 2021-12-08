package pl.imiajd.Aleksiejczyk;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {
    private String producent;
    private  java.time.LocalDate rokProdukcji;
    public Instrument(String producent, java.time.LocalDate rokProdukcji)
    {
        this.producent=producent;
        this.rokProdukcji=rokProdukcji;
    }
    public abstract String dzwiek();
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    //wygenerować ponownie po dopisaniu
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instrument)) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

}




