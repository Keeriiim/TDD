# K_Solo
## TDD Bankkonto
### Deltagare: Kerim Kozo
### Projektbeskrivning
Jag har skapat en MongoDB Facade som kan hantera CRUD operationer. Programmet är baserat på OOP och har klasser som Main, Person, Employee, Customer & dbFacade.
Alla objekt som sparas och hanteras finns i databasen.

### Dependencies
Maven: org.junit.jupiter:junit-jupiter:5.9.3

### Vem har gjort vad?
Jag arbetade ensam.

### Planering & Genomförande  
Vi fick i uppgift att skapa ett litet program och använda TDD med JUnit för att säkerställa att det fungerar som förväntat.
Jag genomförde uppgiften genom att skapa en klass bankkonto, skapa metoder och sedan skapa en testklass med tester för varje metod.

### Utmaningar & Exempel
Jag gjorde lite förarbete och rådfrågade chatGPT hur de hade gjort klassen. Därefter använde jag en del av ChatGPTs kod och modifierade
det som inte var komplett. T.ex fick chatGPTS testkod inte ett misslyckat test ifall initialCash är negativ och withdraw är negativ. Detta innebär 
i praktiken att ifall jag har -500 på kontot och försöker dra ur -1000 så kommer jag sluta upp med 500 på kontot. Detta får ej ske och därför modifierade jag koden
så att den täcker sådana här bitar.

## Slutsatser
### Vad gick bra/dåligt & vad hade du kunnat gjort annorlunda?
Jag lyckades åstadkomma med det jag ville och det var betydelsefullt för mig. Detta är fortfarande nytt för mig och jag är inte
helt säker på t.ex ifall jag testade konstruktorn korrekt. En personlig muntlig feedback hade gjort väldigt mycket nytta i mitt fall.

### Lärdomar & möjligheter
Jag har fått insikt i hur man arbetar med TDD men i dagsläget är det ännu än oklart hur användbart detta kommer vara i min karriär.
Där finns säkerligen också flera typer av "@Annotation" som inte har använts som jag gärna skulle vilja använda i ett lärande syfte.
