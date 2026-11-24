# User Stories – Repair-Café-App

**Format:** Als `[Rolle]` `[möchte / will / muss]` ich `[etwas tun]`, damit `[Grund]`.
Basierend auf den Personas Sabine, Jonas, Rosa und Martin.

| ID | User Story | Persona | Priorität |
|---|---|---|---|
| US1 | Als Hilfesuchende möchte ich mich nur mit Name, Telefonnummer und Postleitzahl registrieren, damit ich ohne komplizierte Formulare starten kann. | Sabine | Hoch |
| US2 | Als Hilfesuchende möchte ich den Defekt über eine Auswahl typischer Probleme beschreiben, damit ich keine Fachbegriffe kennen muss. | Sabine | Hoch |
| US3 | Als Hilfesuchende möchte ich beim zugewiesenen Helfer einen freien Diagnosetermin wählen, damit ein Fachkundiger feststellt, was am Gerät defekt ist, und ich den Termin zu meiner Zeit planen kann. | Sabine | Hoch |
| US4 | Als Hilfesuchende möchte ich nach der Diagnose eine Ersatzteilempfehlung aufs Handy bekommen, damit ich das Teil selbst kaufen und danach einen Reparaturtermin buchen kann. | Sabine | Hoch |
| US5 | Als ehrenamtlicher Helfer möchte ich Anfragen nach meinem Fachgebiet filtern und Fotos vorab sehen, damit ich mich vorbereiten und gezielt helfen kann. | Jonas | Hoch |
| US6 | Als ehrenamtlicher Helfer möchte ich nach der Diagnose ein Ersatzteil empfehlen und optional einen Richtpreis angeben, damit die Person das richtige Teil kauft. | Jonas | Hoch |
| US7 | Als technischer Leiter muss ich neue Anfragen fachlich prüfen und anhand der Fähigkeiten der Helfer einem passenden Helfer zuweisen können, damit jedes Gerät von der richtigen Person repariert wird. | Martin | Hoch |
| US8 | Als technischer Leiter möchte ich die Fähigkeiten aller Helfer in Profilen pflegen, damit ich keine handschriftliche Liste mehr führen muss. | Martin | Mittel |
| US9 | Als Mitgründerin möchte ich Café-Termine planen und Auswertungen zu Reparaturen exportieren, damit ich der Stadt den Erfolg zeigen und Fördergelder sichern kann. | Rosa | Mittel |
| US10 | Als Mitgründerin möchte ich nach neuen Helfern mit bestimmten Fähigkeiten suchen und sie einladen, damit genug Ehrenamtliche für alle Anfragen da sind. | Rosa | Hoch |
| US11 | Als Mitgründerin möchte ich die verfügbaren Termine der Helfer abfragen und in die App eintragen, damit Hilfesuchende freie Termine selbst auswählen können. | Rosa | Hoch |
| US12 | Als ehrenamtlicher Helfer möchte ich einfache Defekte schon im Diagnosetermin reparieren, damit die Hilfesuchende keinen zweiten Termin braucht. | Jonas | Mittel |

## Analyse

US1 bis US4 bilden den Kern des Szenarios mit Sabine. US4 und US6 hängen direkt zusammen: Erst die Diagnose von Jonas macht Ersatzteilkauf und Reparaturtermin möglich. US10 sichert, dass genug Helfer für alle Anfragen da sind.

US3 setzt US7 und US11 voraus: Erst wenn Martin einer Anfrage einen Helfer zugewiesen und Rosa dessen Termine eingetragen hat, kann Sabine einen Termin wählen. Sabine wählt also den Termin, nicht den Helfer.

US12 beschreibt den einfachen Fall: Ist kein Ersatzteil nötig und die Reparatur kurz, entfällt der zweite Termin.

## Zuordnung nach Persona

| Persona | User Stories |
|---|---|
| Sabine (Hilfesuchende) | US1, US2, US3, US4 |
| Jonas (Helfer) | US5, US6, US12 |
| Martin (Technischer Leiter) | US7, US8 |
| Rosa (Mitgründerin) | US9, US10, US11 |
