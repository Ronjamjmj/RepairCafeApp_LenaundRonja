# Substantivliste: als nötig bewertete Begriffe

Prüfung der Einordnung aus `docs/02-review/substantivliste.md`.
Aufgenommen wurden Begriffe mit eigenständiger fachlicher Bedeutung für Anmeldung, Reparaturanfrage, Terminierung, Diagnose, Ersatzteile, Rollen oder Auswertungen.
Weggelassen wurden technische Detailbegriffe, reine Ablaufelemente, Dubletten und Begriffe, die bereits durch einen allgemeineren oder gleichbedeutenden Begriff abgedeckt werden.

| ID | Originalform(en) | Grundform / Mehrwortbegriff | Fundstelle(n) mit Originalbeleg | Begründung | Funktion im Objektmodell |
|---|---|---|---|---|---|
| N-01 | App, App | App | F-010: „Öffnen der App“; US1: „in der App sieht“ | Das System ist der gemeinsame Kontext aller Anforderungen. | objekt hauptobjekt|
| N-03 | Hilfesuchende | Hilfesuchende | US1–US4: „Als Hilfesuchende“ | Eine zentrale Rolle, für die Registrierung, Anfrage und Termine relevant sind. | sabine objekt|
| N-04 | Helfer, Helfers, Helfern | Helfer | US3: „zugewiesenen, bewerteten Helfer“; F-040: „Helfern“ | Zentrale Rolle für Auswahl, Diagnose, Verfügbarkeit und Bewertung. | jonas objekt|
| N-05 | technischer Leiter | Technischer Leiter | F-080: „dem technischen Leiter“ | Eigene Rolle mit Prüfung und Zuweisung von Anfragen. | martin objekt|
| N-06 | Mitgründerin | Mitgründerin | US9: „Als Mitgründerin“ | Eigenständige Rolle für Café-Planung, Auswertung und Helfergewinnung. | rosa objekt |
| N-09 | Name | Name | F-010: „mit Name“ | Pflichteingabe bei der Kurzregistrierung und Identifikation der Hilfesuchenden. | attribut |
| N-10 | Kontaktangabe, Kontaktangaben | Kontaktangabe | US1: „Kontaktangabe“; F-010: „Kontaktangabe“ | Oberbegriff für die für Registrierung und Benachrichtigung benötigten Kontaktdaten. | attribut email / telnr |
| N-11 | Telefonnummer | Telefonnummer | US1: „Telefonnummer“ | Benötigte Registrierungs- und Kontaktangabe mit eigener Validierung. | attribut|
| N-12 | E-Mail-Adresse, E-Mail | E-Mail-Adresse / E-Mail | US1: „E-Mail-Adresse“; UC-02: „E-Mail“ | Alternativer Registrierungskanal und mögliche Benachrichtigungsadresse. | attribut |
| N-13 | Postleitzahl | Postleitzahl | US1: „Postleitzahl“ | Registrierungsangabe und Grundlage für räumliche Zuordnung. | Attribut |
| N-15 | Registrierung, Kurzregistrierung | Registrierung | F-010: „Kurzregistrierung“ | Eigenständiger Prozess für den Einstieg in die App. | objekt? |
| N-16 | Konto | Konto | F-010: „registrieren“; UC-02 Nachbedingung | Das Registrierungsziel und die Zuordnung zu Anfragen und Terminen. | objekt / attribut der app |
| N-17 | Reparaturanfrage, Anfragen | Reparaturanfrage / Anfrage | US7: „neue Anfragen“; F-020: „Reparaturanfrage“ | Zentrale fachliche Einheit, die geprüft, zugewiesen und bearbeitet wird. | |
| N-18 | Warteliste | Warteliste | UC-02 Ausnahme 5e: „Anfrage kommt auf eine Warteliste“ | Beschreibt einen erkennbaren Ablaufzustand für nicht sofort zuweisbare Anfragen. | |
| N-19 | Gerät, Geräte | Gerät | US3: „was am Gerät kaputt ist“ | Gegenstand der Reparaturanfrage und des Reparaturablaufs. | |
| N-20 | Gerätekategorie | Gerätekategorie | F-020: „Gerätekategorie“ | Dient der Auswahltypisierung und der Zuordnung passender Helfer. | |
| N-25 | Problem, Probleme, Fehlerbilder | Problem / Fehlerbild | US2: „typischer Probleme“; UC-02: „Fehlerbilder“ | Beschreibt den vom Gerät gemeldeten Defekt und benötigt eine Auswahl im Formular. | |
| N-27 | Foto, Fotos | Foto | US5: „Fotos vorab sehen“; F-090: „Foto des Typenschilds“ | Zusätzliche Anfragedaten zur Vorbereitung und Identifikation des Geräts. | |
| N-28 | Typenschild | Typenschild | UC-02 Hauptablauf 4: „Foto vom Typenschild“ | Bestimmt das Foto und enthält relevante Geräteinformationen. | |
| N-29 | Fachgebiet, Fachgebiete | Fachgebiet | US5: „Fachgebiet“ | Grundlage für das Filtern und die Zuordnung von Anfragen. | |
| N-30 | Skills, Kenntnisse | Skill / Kenntnisse | US7: „anhand der Skills“; F-080: „Kenntnisse“ | Qualifikation zur fachlichen Zuordnung eines Helfers. | |
| N-32 | Profil, Profile | Profil | US8: „in Profilen“ | Enthält die verwalteten Fähigkeiten und Qualifikationen eines Helfers. | |
| N-33 | Bewertung, Bewertungen | Bewertung | US3: „bewerteten Helfer“; UC-02 Hauptablauf 5: „Bewertungen“ | Hilft Hilfesuchenden bei der Auswahl eines Helfers und ist fachlich vom Termin getrennt. | |
| N-34 | Diagnosetermin | Diagnosetermin | US3: „Diagnosetermin“ | Termin mit eigenem Zweck: Diagnose des Geräts durch einen Helfer. | |
| N-35 | Reparaturtermin | Reparaturtermin | US4: „Reparaturtermin“ | Eigenständiger Termin nach Beschaffung des Ersatzteils. | |
| N-36 | Termin, Termine, Zeitfenster | Termin / Zeitfenster | US3: „Termin“; UC-02 Vorbedingung: „freies Zeitfenster“ | Gemeinsamer Kern für Diagnose, Reparatur, Verfügbarkeit und Erinnerungen. | |
| N-37 | Diagnose | Diagnose | US4: „nach der Diagnose“ | Ergebnis des Diagnosetermins und Grundlage für die Ersatzteilempfehlung. | |
| N-38 | Ersatzteil, Ersatzteile | Ersatzteil | US4: „das Teil“; F-040: „Ersatzteil“ | Benanntes Reparaturbedürfnis mit Kauf- und Beschaffungsbezug. | |
| N-39 | Ersatzteilempfehlung | Ersatzteilempfehlung | US4: „Ersatzteilempfehlung“ | Verknüpft Diagnose, Ersatzteil und den späteren Reparaturtermin. | objekt |
| N-40 | Richtpreis | Richtpreis | US6: „Richtpreis“ | Optionales Kaufmerkmal der Ersatzteilempfehlung. | attribut |
| N-45 | Café-Termine | Café-Termin | US9: „Café-Termine planen“ | Eigenständiger Termin für die Organisationsseite des Repair-Cafés. | objekt|
| N-46 | Auswertung, Auswertungen | Auswertung | US9: „Auswertungen zu Reparaturen“ | Rückgabe von Erfolgen und Reparaturdaten für Förder- und Berichtszwecke. | objekt|
| N-51 | Einladung | Einladung | US10: „sie einladen“ | Beschreibt den konkreten Schritt der Helfergewinnung. |verb |
| N-55 | Datenbank | Datenbank | UC-02 Beteiligte Systeme: „Datenbank für Anfragen, Helfer und Termine“ | Belegt die persistente Verwaltung der zentralen fachlichen Daten. |  |
| N-58 | Benachrichtigung | Benachrichtigung | F-100: „SMS-Erinnerung“ | Eigenständiges Benachrichtigungsziel für Terminbuchungen. | objekt |
