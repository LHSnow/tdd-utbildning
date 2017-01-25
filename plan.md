TDD -> DDB
==========

Testdriven utveckling av Scrabble

Dag 1
----

### Intro

- Demo med existerande app
- CI som princip
- Metoden red-green-refactor
- Vad undvek vi för problem?
- Vad vinner vi på detta?
- Hur fungerar JUnit

Övning: git clone skeleton -> kanariefågeltest

### Enkla enhetstester

- Enhetstestets anatomi
- Given-then-what
- En (1) assert per test
- Grundläggande exempel
- Single responsibility (S)
- Acceptanstest -> red-green-refactor - "end to end"

Övning: Implementera en första metod/klass för att räkna ut poäng för ett ord

### Ännu bättre enhetstester

- Onion architecture
- Vad kännetecknar bra tester
- Skriv det test som du vill läsa
- Open/closed (O)
- Happy/sad path
- Testa exceptions
- Tester ska också underhållas och inte heller ha upprepad kod (setup-teardown)
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

- Mockning
- Adapter pattern. Mocka adaptrar, inte det faktiska beroendet.
- Att undvika new
- Liskov substitution (L)
- Interface segregation (I)
- Dependency Inversion (D)

Övning: Mocka bort ordlistan i scrabble
