# Requirements-Review – Repair-Café-App

**Review vom:** 11.11.2026
**Ergänzung:** 18.11.2026
**Umfang:** SMS-Erinnerungen, Helferwahl/Zuweisung und Messkriterien für N-020. Betroffene Dateien (`docs/01-anforderungen/`): `anforderungen_fallstudie.md`, `user-stories.md`, `use-case-diagramm.md`, `szenarien.md`.

## Erkenntnisse und Umsetzung

### 1. SMS: Aktivierung, Kontaktweg und Anwendungsfallbeziehung

**Befund:** F-010 erlaubt Telefonnummer und/oder E-Mail, US1/AK-010-1 nennen die Telefonnummer. F-100/AK-100-1 sehen eine Aktivierung vor, ReqMOB-N060, UC-02 (Schritt 12, Nachbedingung) und das Szenario setzten SMS für jeden Termin voraus.

**Entscheidung des Teams (18.11.2026):** UC-07 ergänzt UC-05 und UC-06 per «extend»; Bedingung: Die Hilfesuchende aktiviert die SMS-Erinnerung in der App.

**Umgesetzt (18.11.2026):**
- UC-Diagramm: beide Pfeile als «extend» mit korrekter Richtung (UC-07 → UC-05/UC-06), Bedingung am Pfeil; Beziehungstabelle (UC-05, UC-06, UC-07) angepasst.
- UC-02: Nachbedingung und Schritt 12 nur bei aktivierter Erinnerung; neuer alternativer Ablauf 12a (nicht aktiviert oder keine Telefonnummer: keine SMS).
- ReqMOB-N060: SMS nur für Personen mit aktivierter Erinnerung (Opt-in).
- F-100: Option nur mit hinterlegter Telefonnummer, Opt-in; AK-100-1: Telefonnummer als Vorbedingung.
- Szenario: Sabine hat die SMS-Erinnerung aktiviert. FE-6: „Optionale SMS-Erinnerung (Opt-in)“.

**Kontaktangaben (Festlegung, vom Team zu bestätigen):**
- Registrierung braucht Name und mindestens eine Kontaktangabe (Telefonnummer oder E-Mail). F-010, US1 und AK-010-1 (Verweis auf AK-010-2) sind so angeglichen.
- SMS gibt es nur mit Telefonnummer. Ohne Telefonnummer gibt es keine Erinnerung.
- E-Mail ist nur Rückfall nach fehlgeschlagener SMS (AK-100-4), keine eigenständige Erinnerung.

### 2. Helferwahl und Zuweisung

**Klarstellung des Teams (18.11.2026):** Martin wählt anhand der Skills aus und weist den Helfer zu. Die Hilfesuchende sieht den zugewiesenen Helfer in der App und wählt danach einen freien Termin bei ihm.

**Umgesetzt (18.11.2026):**
- F-030: Anzeige des zugewiesenen Helfers und Terminbuchung bei ihm, statt Auswahl durch die Hilfesuchende.
- F-080: Zuweisung anhand der Skills, Anzeige des Helfers in der App.
- AK-030-1: Zuweisung als Vorbedingung. AK-030-3: Sonderfall „keine Zuweisung möglich“.
- US3 und US7 abgegrenzt (US7 ermöglicht US3); Analyse in `user-stories.md` ergänzt.
- UC-04 umbenannt in „Zugewiesenen Helfer ansehen“, UC-10 in „Anfrage prüfen und anhand Skills Helfer zuweisen“.
- UC-02: Schritt 5 (Zuweisung durch Martin), Schritt 6 (Terminwahl), Martin als sekundärer Akteur, Ausnahme 5e angepasst.
- Szenario: Martin weist Jonas zu, Sabine sieht ihn und wählt den Termin. FE-3 und FE-5 angepasst.

### 3. Messkriterien für N-020

**Entscheidung des Teams (18.11.2026):** ReqMOB-N020 behält höchstens 20 Minuten; das Verhältnis zu den 5/8 Minuten in AK-N020-2 wird erläutert.

**Umgesetzt (18.11.2026), Erläuterung als Vorschlag zur Bestätigung:**
- Die 20 Minuten sind die Abnahmegrenze pro Person. Ø ≤ 5 min und max. 8 min (AK-N020-2) sind das strengere Qualitätsziel innerhalb dieser Grenze.
- Messbeginn und -ende vereinheitlicht: vom Tippen auf „Gerät reparieren lassen“ bis zur Buchungsbestätigung des Diagnosetermins, Helfer im Test vorab zugewiesen (N020, AK-N020-1, AK-N020-2).

## Änderungs- und Entscheidungsprotokoll

| Datum | Erkenntnis | Änderung | Status |
|---|---|---|---|
| 18.11.2026 | 1 – SMS | «extend» mit Opt-in, Kontaktweg und E-Mail-Rückfall festgelegt, in alle Quellen eingearbeitet | umgesetzt, Kontaktweg-Festlegung vom Team zu bestätigen |
| 18.11.2026 | 2 – Zuweisung | Martin weist nach Skills zu, Sabine sieht den Helfer und wählt den Termin | umgesetzt |
| 18.11.2026 | 3 – N-020 | 20 min als Abnahmegrenze, 5/8 min als Qualitätsziel, Messbeginn/-ende vereinheitlicht | umgesetzt, Erläuterung vom Team zu bestätigen |

## Noch offen

- **ReqMOB-N030 / AK-N030-1 bis -3 / UC-04:** Die Anforderung spricht noch von „Helfervorschlägen“. Nach der Zuweisung durch Martin sollte das Team festlegen, was gemessen wird (z. B. Anzeige des zugewiesenen Helfers und der freien Termine). Unverändert gelassen.
- **Zuweisungswartezeit:** Die Zuweisung ist jetzt manuell. Wie lange sie dauern darf und wie Sabine benachrichtigt wird, ist nicht festgelegt (betrifft F-080, UC-02 Schritt 5).
- **Postleitzahl:** US1 und Szenario nennen sie, F-010 und AK-010-x nicht.
- **FE-9 und FE-11:** Anforderungen sind weiterhin „noch offen“ (unverändert).
