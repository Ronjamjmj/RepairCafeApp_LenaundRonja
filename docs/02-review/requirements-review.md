# Requirements-Review – Repair-Café-App

**Review vom:** 11.11.2026
**Ergänzung:** 18.11.2026
**Umfang:** SMS-Erinnerungen, Helferwahl/Zuweisung und Messkriterien für N-020. Geprüft wurden die relevanten Fundstellen in `anforderungen_fallstudie.md`, `user-stories.md`, `use-case-diagramm.md` und `szenarien.md` unter `docs/01-anforderungen/`.

## Erkenntnisse

### 1. SMS: Aktivierung, Kontaktweg und Anwendungsfallbeziehung

**Problem/Befund:** Die Quellen setzen unterschiedliche Dinge voraus. F-010 erlaubt Telefonnummer **und/oder** E-Mail-Adresse, garantiert also keine Telefonnummer. F-100 bietet das Aktivieren einer SMS-Erinnerung an; AK-100-1 beschreibt den Versand, wenn die SMS aktiviert wird. Dagegen sagt ReqMOB-N060, jede Person mit gebuchtem Termin erhalte eine SMS. Der Ablauf im strukturierten UC-02 plant Erinnerungen und Sabines Szenario nennt SMS vor beiden Terminen.

**Erkenntnis des Teams (18.11.2026):** Weil eine Telefonnummer bei der Registrierung nicht zwingend vorgesehen ist und die SMS-Erinnerung aktiviert werden kann, ist ein SMS-Versand nicht für jede Buchung zwingend. Das erklärt den Widerspruch zwischen der aktivierbaren Erinnerung und der allgemeinen Versandpflicht.

**Entscheidung des Teams (18.11.2026):** UC-07 soll UC-05 und UC-06 mit «extend» ergänzen. Die Bedingung ist, dass die Hilfesuchende die SMS-Erinnerung in der App wünscht bzw. aktiviert.

**Noch offen:** Was bei fehlender Telefonnummer gilt und ob eine E-Mail-Erinnerung vorgesehen ist. F-010 erlaubt Telefonnummer und/oder E-Mail; US1 und AK-010-1 nennen dagegen Telefonnummer. Auch AK-100-4 erwähnt E-Mail als möglichen Ersatz nach fehlgeschlagener SMS. Diese Aussagen müssen zusammenpassen.

**Fundstellen und aktueller Stand:** `anforderungen_fallstudie.md` (F-010; F-100; AK-010-1; AK-100-1 bis AK-100-4; ReqMOB-N060); `user-stories.md` (US1); `use-case-diagramm.md` (UC-05 bis UC-07, Diagramm und Beziehungstabelle; strukturierter UC-02, Nachbedingung und Schritt 12); `szenarien.md` (Interaktion zur Registrierung; Abschnitt 3, Ergebnis). Im aktuellen Arbeitsbaum ist im Diagramm-Pfeil UC-05→UC-07 «include» durch «extend» ersetzt; UC-06 steht dort weiterhin auf «include». Die Beziehungstabelle führt für beide Buchungen weiterhin «include» auf. Die Quellen sind somit noch nicht konsistent mit der Teamentscheidung.

### 2. Helferwahl und Zuweisung

**Problem/Befund:** Die bisherigen Fundstellen legen verschiedene Abläufe nahe: F-030 und UC-02, Schritt 5, lassen Sabine einen vorgeschlagenen Helfer auswählen. F-080 und US7 sehen Prüfung und Zuweisung durch Martin vor, benennen aber nicht die Auswahl anhand von Skills und die Anzeige des zugewiesenen Helfers. AK-030-3 beschreibt eine Benachrichtigung an Martin nur für den Fall, dass kein Helfer verfügbar ist. US3 und das Szenario beschreiben die Terminbuchung bei einem bewerteten bzw. vorgeschlagenen Helfer, aber nicht Martins Auswahl und Zuweisung.

**Klarstellung des Teams (18.11.2026):** Nicht Sabine wählt den Helfer aus. Martin wählt anhand der Kenntnisse bzw. Skills des Helfers aus und weist ihn der Anfrage zu; die Hilfesuchende bekommt den zugewiesenen Helfer in der App angezeigt.

**Ergänzung des Teams (18.11.2026):** Nach der Zuweisung wählt Sabine weiterhin einen freien Termin beim zugewiesenen Helfer.

**Konsistenzhinweis:** Die Klarstellung ist im Review festgehalten, aber die genannten Ausgangsstellen beschreiben sie noch nicht durchgängig. F-030 und UC-02 Schritt 5 zeigen weiterhin eine Auswahl durch Sabine. F-080, US7 und UC-10 decken Martins Zuweisung ab, beschreiben aber nicht vollständig die Skills als Auswahlgrund und die Anzeige des Ergebnisses in der App. US3 und das Szenario sollten den geklärten Ablauf ebenfalls widerspruchsfrei wiedergeben. AK-030-3 belegt bisher nur den Sonderfall ohne verfügbaren Helfer.

**Fundstellen:** `anforderungen_fallstudie.md` (F-030, F-080, AK-030-3); `user-stories.md` (US3, US7); `use-case-diagramm.md` (UC-02, Schritte 5 und 5e; UC-10); `szenarien.md` (Interaktion, Helfervorschlag und Terminbuchung).

### 3. Messkriterien für N-020

**Problem/Befund:** ReqMOB-N020 nennt als Ziel höchstens 20 Minuten und mindestens 4 von 5 Personen, die die Anfrage ohne Hilfe abschließen. AK-N020-1 greift die Erfolgsquote auf. AK-N020-2 verlangt zusätzlich durchschnittlich höchstens 5 Minuten und höchstens 8 Minuten pro Person. Wie diese engeren Zeitwerte zum 20-Minuten-Ziel stehen, wird nicht erläutert.

**Entscheidung des Teams (18.11.2026):** ReqMOB-N020 behält den Zielwert von höchstens 20 Minuten. Das Verhältnis zu den strengeren 5- bzw. 8-Minuten-Zielen in AK-N020-2 soll erläutert werden. Die konkrete Erläuterung ist noch nicht festgehalten.

**Fundstellen:** `anforderungen_fallstudie.md` (ReqMOB-N020; AK-N020-1 und AK-N020-2).

## Änderungs- und Entscheidungsprotokoll

| Datum | Erkenntnis | Im Review angepasst | Status der Anforderungsquellen |
|---|---|---|---|
| 18.11.2026 | 1 – SMS-Regelung | Teamentscheidung für «extend» mit Aktivierung/Wunsch in der App als Bedingung dokumentiert; Kontaktweg- und E-Mail-Aussagen ergänzt. | Arbeitsbaum: UC-05-Pfeil ist auf «extend» gesetzt; UC-06-Pfeil und beide Einträge in der Beziehungstabelle stehen noch auf «include». F-010/US1/AK-010-1 sowie E-Mail-Ersatz und fehlende Telefonnummer sind noch abzustimmen. |
| 18.11.2026 | 2 – Helferwahl/Zuweisung | Festgehalten: Martin ordnet nach Skills zu, Sabine sieht den zugewiesenen Helfer und wählt einen freien Termin bei ihm. Fundstellen, die noch Sabinas Helferauswahl zeigen, sind markiert. | Keine Anforderungsdatei geändert; F-030, US3, UC-02 Schritt 5 und Szenario stimmen noch nicht mit der Teamklarstellung überein. |
| 18.11.2026 | 3 – N-020-Messkriterien | Teamentscheidung dokumentiert, den 20-Minuten-Zielwert beizubehalten und sein Verhältnis zu den 5/8-Minuten-Zielen zu erläutern. | Keine Anforderungsdatei geändert; die konkrete Erläuterung steht noch aus. |

**Grenze dieses Dokuments:** Von mir wurde nur dieses Review aktualisiert. Die Teamänderung im Arbeitsbaum an der UC-05-Beziehung wurde beibehalten; weitere Anforderungsdateien wurden von mir nicht geändert. Die obigen Klarstellungen und offenen Entscheidungen sind keine überarbeiteten Spezifikationen.
