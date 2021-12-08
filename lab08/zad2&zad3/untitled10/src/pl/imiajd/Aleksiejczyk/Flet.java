package pl.imiajd.Aleksiejczyk;

public class Flet extends Instrument{
    public Flet(String producent, java.time.LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
    public String dzwiek()
    {
        return String.format("fufufufu");
    }
}
