import java.time.LocalDateTime;
import java.util.Collections;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        Nutzer sabine = new Nutzer(
                "N-001", "Sabine Weber", "12345",
                Collections.emptySet(), Collections.emptySet());
        Nutzer jonas = new Nutzer(
                "N-002", "Jonas Keller", "12345",
                EnumSet.of(RollenTyp.HELFER), EnumSet.of(Fachgebiet.KÜCHENGERÄTE));

        Reparaturanfrage anfrage1 = new Reparaturanfrage(
                "A-001",
                LocalDateTime.of(2026, 11, 25, 14, 0),
                "Pumpt kein Wasser und macht laute Geräusche.",
                sabine,
                AnfrageStatus.OFFEN);

        System.out.println("Helferrolle vorhanden: " + jonas.hatRolle(RollenTyp.HELFER));
        System.out.println("Nicht vorhandene Helferrolle: "
                + sabine.hatRolle(RollenTyp.HILFESUCHENDE));
        anfrage1.helferZuweisen(jonas);
        System.out.println("Helferzuweisung für Anfrage A-001 ausgeführt.");
        anfrage1.statusAktualisieren(AnfrageStatus.ZUGEWIESEN);
        System.out.println("Status-Demo ausgeführt: " + AnfrageStatus.ZUGEWIESEN);
    }
}
