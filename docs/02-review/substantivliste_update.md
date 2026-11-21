# Substantivliste: als nötig bewertete Begriffe

Prüfung der Einordnung aus `docs/02-review/substantivliste.md`.
Aufgenommen wurden Begriffe mit eigenständiger fachlicher Bedeutung für Anmeldung, Reparaturanfrage, Terminierung, Diagnose, Ersatzteile, Rollen oder Auswertungen.
Weggelassen wurden technische Detailbegriffe, reine Ablaufelemente, Dubletten und Begriffe, die bereits durch einen allgemeineren oder gleichbedeutenden Begriff abgedeckt werden.

| ID | Originalform(en) | Grundform / Mehrwortbegriff | Fundstelle(n) mit Originalbeleg | Begründung | Funktion im Objektmodell |
|---|---|---|---|---|---|
| N-01 | App, App | App | F-010: „Öffnen der App“; US1: „in der App sieht“ | Das System ist der gemeinsame Kontext aller Anforderungen. | instanz instanz|
| N-02 | Hilfesuchende | Hilfesuchende | US1–US4: „Als Hilfesuchende“ | Eine zentrale Rolle, für die Registrierung, Anfrage und Termine relevant sind. | sabine instanz|
| N-03 | Helfer, Helfers, Helfern | Helfer | US3: „zugewiesenen, bewerteten Helfer“; F-040: „Helfern“ | Zentrale Rolle für Auswahl, Diagnose, Verfügbarkeit und Bewertung. | jonas instanz|
| N-04 | technischer Leiter | Technischer Leiter | F-080: „dem technischen Leiter“ | Eigene Rolle mit Prüfung und Zuweisung von Anfragen. | martin instanz|
| N-05 | Mitgründerin | Mitgründerin | US9: „Als Mitgründerin“ | Eigenständige Rolle für Café-Planung, Auswertung und Helfergewinnung. | rosa instanz |
| N-06 | Name | Name | F-010: „mit Name“ | Pflichteingabe bei der Kurzregistrierung und Identifikation der Hilfesuchenden. | attribut |
| N-07 | Kontaktangabe, Kontaktangaben | Kontaktangabe | US1: „Kontaktangabe“; F-010: „Kontaktangabe“ | Oberbegriff für die für Registrierung und Benachrichtigung benötigten Kontaktdaten. | attribut email / telnr |
| N-08 | Telefonnummer | Telefonnummer | US1: „Telefonnummer“ | Benötigte Registrierungs- und Kontaktangabe mit eigener Validierung. | attribut|
| N-09 | E-Mail-Adresse, E-Mail | E-Mail-Adresse / E-Mail | US1: „E-Mail-Adresse“; UC-02: „E-Mail“ | Alternativer Registrierungskanal und mögliche Benachrichtigungsadresse. | attribut |
| N-10 | Postleitzahl | Postleitzahl | US1: „Postleitzahl“ | Registrierungsangabe und Grundlage für räumliche Zuordnung. | Attribut |
| N-11 | Benutzerkonto | Benutzerkonto | F-010: „Kurzregistrierung“ | Eigenständiger Prozess für den Einstieg in die App. | instanz? |
| N-12 | Konto | Konto | F-010: „registrieren“; UC-02 Nachbedingung | Das Registrierungsziel und die Zuordnung zu Anfragen und Terminen. | instanz / attribut der app |
| N-13 | Reparaturanfrage, Anfragen | Reparaturanfrage / Anfrage | US7: „neue Anfragen“; F-020: „Reparaturanfrage“ | Zentrale fachliche Einheit, die geprüft, zugewiesen und bearbeitet wird. | instanz |
| N-14 | Gerät, Geräte | Gerät | US3: „was am Gerät kaputt ist“ | Gegenstand der Reparaturanfrage und des Reparaturablaufs. | instanz |
| N-15 | Gerätekategorie | Gerätekategorie | F-020: „Gerätekategorie“ | Dient der Auswahltypisierung und der Zuordnung passender Helfer. |attribut |
| N-16 | Problem, Probleme, Fehlerbilder | Problem / Fehlerbild | US2: „typischer Probleme“; UC-02: „Fehlerbilder“ | Beschreibt den vom Gerät gemeldeten Defekt und benötigt eine Auswahl im Formular. | attribut|
| N-17 | Foto, Fotos | Foto | US5: „Fotos vorab sehen“; F-090: „Foto des Typenschilds“ | Zusätzliche Anfragedaten zur Vorbereitung und Identifikation des Geräts. | attribut |
| N-18 | Typenschild | Typenschild | UC-02 Hauptablauf 4: „Foto vom Typenschild“ | Bestimmt das Foto und enthält relevante Geräteinformationen. | attribut|
| N-19 | Fachgebiet, Fachgebiete | Fachgebiet | US5: „Fachgebiet“ | Grundlage für das Filtern und die Zuordnung von Anfragen. | attribut |
| N-20 | Skills, Kenntnisse | Skill / Kenntnisse | US7: „anhand der Skills“; F-080: „Kenntnisse“ | Qualifikation zur fachlichen Zuordnung eines Helfers. | attribut|
| N-21 | Profil, Profile | Profil | US8: „in Profilen“ | Enthält die verwalteten Fähigkeiten und Qualifikationen eines Helfers. | instanz? |
| N-22 | Bewertung, Bewertungen | Bewertung | US3: „bewerteten Helfer“; UC-02 Hauptablauf 5: „Bewertungen“ | Hilft Hilfesuchenden bei der Auswahl eines Helfers und ist fachlich vom Termin getrennt. |instanz<br/> |
| N-23 | Diagnosetermin | Diagnosetermin | US3: „Diagnosetermin“ | Termin mit eigenem Zweck: Diagnose des Geräts durch einen Helfer. | instanz |
| N-24 | Reparaturtermin | Reparaturtermin | US4: „Reparaturtermin“ | Eigenständiger Termin nach Beschaffung des Ersatzteils. |instanz |
| N-25 | Termin, Termine, Zeitfenster | Termin / Zeitfenster | US3: „Termin“; UC-02 Vorbedingung: „freies Zeitfenster“ | Gemeinsamer Kern für Diagnose, Reparatur, Verfügbarkeit und Erinnerungen. |attribut |
| N-26 | Diagnose | Diagnose | US4: „nach der Diagnose“ | Ergebnis des Diagnosetermins und Grundlage für die Ersatzteilempfehlung. | |
| N-27 | Ersatzteil, Ersatzteile | Ersatzteil | US4: „das Teil“; F-040: „Ersatzteil“ | Benanntes Reparaturbedürfnis mit Kauf- und Beschaffungsbezug. |instanz  |
| N-28 | Ersatzteilempfehlung | Ersatzteilempfehlung | US4: „Ersatzteilempfehlung“ | Verknüpft Diagnose, Ersatzteil und den späteren Reparaturtermin. | instanz |
| N-29 | Richtpreis | Richtpreis | US6: „Richtpreis“ | Optionales Kaufmerkmal der Ersatzteilempfehlung. | attribut |
| N-30 | Café-Termine | Café-Termin | US9: „Café-Termine planen“ | Eigenständiger Termin für die Organisationsseite des Repair-Cafés. | instanz|
| N-31 | Auswertung, Auswertungen | Auswertung | US9: „Auswertungen zu Reparaturen“ | Rückgabe von Erfolgen und Reparaturdaten für Förder- und Berichtszwecke. | instanz|
| N-32 | Einladung | Einladung | US10: „sie einladen“ | Beschreibt den konkreten Schritt der Helfergewinnung. |verb |
| N-33 | Datenbank | Datenbank | UC-02 Beteiligte Systeme: „Datenbank für Anfragen, Helfer und Termine“ | Belegt die persistente Verwaltung der zentralen fachlichen Daten. |  |
| N-34 | Benachrichtigung | Benachrichtigung | F-100: „SMS-Erinnerung“ | Eigenständiges Benachrichtigungsziel für Terminbuchungen. | instanz |
