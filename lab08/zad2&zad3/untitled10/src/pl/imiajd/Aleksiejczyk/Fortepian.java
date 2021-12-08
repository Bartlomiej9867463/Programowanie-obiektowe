package pl.imiajd.Aleksiejczyk;

public class Fortepian extends Instrument{
    public Fortepian(String producent, java.time.LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
    public String dzwiek()
    {
        return String.format("titititi");
    }
}
