TDD -> DDB
==========

Applikationsalternativ

- 2048?
- Scrabble?
- Tetris?
- Ingen app, lösa exempel

Andra funderingar

- Var och när om SOLID?

Dag 1
----

### Intro

- Demo av existerande app? Vilken?
- Metoden red-green-refactor
- Vad undvek vi för problem? Vad vinner vi på detta?
- Acceptanstest -> red-green-refactor - "end to end"
- Red-(bättre feedback)-green-refactor
- Hur fungerar JUnit

Övning: git clone skeleton -> kanariefågeltest

### Enklare enhetstester

- Enhetstestets anatomi (given-then-what?)
- Grundläggande exempel

Övning: Implementera en första metod/klass.

- Förutsatt slutmål scrabble: räkna ut poäng för ett ord?
- Behöver inte sägas att det är scrabble direkt, utan kan vara en enkel variant på https://projecteuler.net/problem=22

### Ännu bättre enhetstester

- Vad kännetecknar bra tester
- Happy/sad path
- Testa exceptions
- Tester ska också underhållas och inte heller ha upprepad kod -> @before @after
- Funktionella tester är enklare än statebaserade

Övning: Fortsätt bygga applikation utifrån acceptanstest och dessas enhetstest

### Refaktorisering

- Därför refaktorisering
- Test driven design
- Undvika överproduktion (you aint gonna need it)

Övning: Mer applikation, för nu lär några större refaktoriseringar vara på sin plats

Dag 2
----

- Mockning
- Adapter pattern
- Att undvika new
- Dependency Inversion

Övning: Mocka bort komponent, typ ordlistan i scrabble
