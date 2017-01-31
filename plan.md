TDD -> DDB
==========

Testdriven utveckling med Scrabble som exempelapplikation. Vad kännetecknar bra tester och andra processer för systemutveckling?

Dag 1
----

### Intro

- Demo med existerande app
- Metoden red-green-refactor
- Vad undvek vi för problem?
- Vad vinner vi på detta?
- Hur fungerar jUnit

Övning: git clone skeleton -> kanariefågeltest

Mål: Få en fungerande testmiljö att bygga vidare på

### Enkla enhetstester

- Enhetstestets anatomi
- Given-When-Then (Arrange, Act, Assert)
- En (1) assert (koncept) per test
- Single responsibility (S)
- Grundläggande exempel
- Vad och hur mycket ska man testa?
  - Zero-one-some-lots-oops (0,1,5,2000,!?)
  - Happy/sad path (men inte exceptions)

Övning: Implementera en första metod/klass för att räkna ut poäng för ett ord

Mål: Förstå och utföra processen med enhetstest (red-green-refactor)

> LUNCHPAUS

### Från krav till test

- BDD-intro
- Samarbete med beställare
- Definiera scope
- Testbara exempel (specification by example)
- Levande dokumentation
- Tester ska också underhållas
- Story -> acceptanstest -> red-green-refactor - "end to end"

Övning: Fortsätt bygga applikation utifrån acceptanstest och dessas enhetstest

> Fikapaus

### Ännu bättre enhetstester

- Skriv det test som du vill läsa (builder pattern)
- Red-(bättre feedback)-green-refactor
- Att testa exceptions
- Undvika upprepad kod (setup-teardown)
- Funktionella tester är enklare att underhålla än statebaserade
- Undvika överproduktion (you aint gonna need it)

Dag 2
----

### Refaktorisering

- Därför refaktorisering
- Test driven design
- Onion architecture
- Mockning (stubbning, fakes etc)
- Adapter pattern
- Att undvika new

Övning: Mocka bort ordlistan (från den jobbiga yttre världen) i scrabble

> LUNCHPAUS

Övning: Mer applikation, för nu lär några större refaktoriseringar vara på sin plats

### Continuous integration

- Continuous integration som princip
- Verktyg för att undvika buggar
- Samarbetsverktyg
- Bli säker på din produkt

> Fikapaus

### Verktyg för testdriven design, SOLID

- Repetition av single responsibility principle (S)
- Open/closed (O)
- Liskov substitution (L)
- Interface segregation (I)
- Dependency Inversion (D)

Övning: Avslutande övning beroende på hur långt vi hunnit, alternativt tidig avslutning

### Bubblare, i mån av tid

- Code smells
