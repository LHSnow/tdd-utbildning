TDD -> DDB
==========

Testdriven utveckling med Scrabble som exempelapplikation

Dag 1
----

### Intro

- Demo med existerande app
- Continuous integration som princip
- Metoden red-green-refactor
- Vad undvek vi för problem?
- Vad vinner vi på detta?
- Hur fungerar JUnit

Övning: git clone skeleton -> kanariefågeltest

### Enkla enhetstester

- Enhetstestets anatomi
- Given-When-Then (Arrange, Act, Assert)
- En (1) assert (koncept) per test
- Grundläggande exempel
- Single responsibility (S)
- Story -> acceptanstest -> red-green-refactor - "end to end"

Övning: Implementera en första metod/klass för att räkna ut poäng för ett ord

### Ännu bättre enhetstester

- Vad kännetecknar bra tester
- Vad och hur mycket ska man testa?
  - Zero-one-some-lots-oops (0,1,5,2000,!?)
  - Happy/sad path
  - Att testa exceptions
- Skriv det test som du vill läsa
- Open/closed (O)
- Liskov substitution (L)
- Tester ska också underhållas
- Undvika upprepad kod (setup-teardown)
- Funktionella tester är enklare att underhålla än statebaserade

Övning: Fortsätt bygga applikation utifrån acceptanstest och dessas enhetstest

### Refaktorisering

- Därför refaktorisering
- Red-(bättre feedback)-green-refactor
- Test driven design
- Undvika överproduktion (you aint gonna need it)

Övning: Mer applikation, för nu lär några större refaktoriseringar vara på sin plats

Dag 2
----

- Onion architecture
- Mockning
- Adapter pattern
- Att undvika new
- Interface segregation (I)
- Dependency Inversion (D)

Övning: Mocka bort ordlistan (från den jobbiga yttre världen) i scrabble
