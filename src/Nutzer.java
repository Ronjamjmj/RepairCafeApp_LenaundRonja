import java.util.HashSet;
import java.util.Set;

public class Nutzer {
    private final String nutzerId;
    private final String name;
    private final String postleitzahl;
    private final Set<RollenTyp> rollen;
    private final Set<Fachgebiet> fachgebiete;

    public Nutzer(
            String nutzerId,
            String name,
            String postleitzahl,
            Set<RollenTyp> rollen,
            Set<Fachgebiet> fachgebiete) {
        this.nutzerId = nutzerId;
        this.name = name;
        this.postleitzahl = postleitzahl;
        this.rollen = new HashSet<>(rollen);
        this.fachgebiete = new HashSet<>(fachgebiete);
    }

    public Boolean registrieren() {
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }

    public Boolean hatRolle(RollenTyp rolle) {
        return rollen.contains(rolle);
    }

    public Double berechneDurchschnitt() {
        throw new UnsupportedOperationException("Noch nicht umgesetzt");
    }
}

// Vorläufige, ausdrücklich gewählte Demo-Werte.
enum RollenTyp {
    HELFER,
    HILFESUCHENDE
}

// Vorläufige, ausdrücklich gewählte Demo-Werte.
enum Fachgebiet {
    ALLGEMEIN,
    KÜCHENGERÄTE
}
