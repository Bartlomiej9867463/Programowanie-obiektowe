package pl.imiajd.Aleksiejczyk;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, java.time.LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
    public String dzwiek()
    {
        return String.format("zizizizi");
    }
}
