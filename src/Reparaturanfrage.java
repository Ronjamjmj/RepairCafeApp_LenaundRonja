import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reparaturanfrage {
    private final String anfrageId;
    private final LocalDateTime erstelltAm;
    private final String problemBeschreibung;
    private final List<String> fehlerbilder;
    private AnfrageStatus status;
    private final Nutzer ersteller;
    private Nutzer helfer;

    public Reparaturanfrage(
            String anfrageId,
            LocalDateTime erstelltAm,
            String problemBeschreibung,
            Nutzer ersteller,
            AnfrageStatus status) {
        this.anfrageId = Objects.requireNonNull(anfrageId);
        this.erstelltAm = Objects.requireNonNull(erstelltAm);
        this.problemBeschreibung = Objects.requireNonNull(problemBeschreibung);
        this.ersteller = Objects.requireNonNull(ersteller);
        this.fehlerbilder = new ArrayList<>();
        this.status = Objects.requireNonNull(status);
    }

    protected void helferZuweisen(Nutzer helfer) {
        this.helfer = Objects.requireNonNull(helfer);
    }

    protected void statusAktualisieren(AnfrageStatus neu) {
        this.status = Objects.requireNonNull(neu);
    }
}

// Vorläufige, ausdrücklich gewählte Demo-Werte.
enum AnfrageStatus {
    NEU,
    OFFEN
}
