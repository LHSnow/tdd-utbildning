TDD -> DDB
==========

Testdriven utveckling med Scrabble som exempelapplikation. Övergripande ämnesområden

- Agila processer för systemutveckling
- Kännetecken för bra tester
- Code smells

Varje övning avslutas med en genomgång av exempelkod som förberetts (i tv-kockstil). Deltagarna kan sedan välja att fortsätta med sin egen kod, eller checka ut exempelkoden för att stå i rätt läge för nästa övning. Därför är ingen övning beroende av att man hunnit avsluta den föregående, trots att vi använder samma exempelapplikation. Vi kommer förbereda lämpliga git-commits att utgå ifrån inför varje övning.

         s   1  2 3 4     5      
    -----o---o--o-o-o-----o----o master
          \..... \..             Adam
           \........             Eva

> Exempel: Alla ``-``, ``.`` och ``o`` i figuren representerar commits. I master-grenen har vi lärare implementerat övningarna i förväg och markerat lämpliga commits som startpunkter - ``o`` - för respektive övning. Deltagaren Adam utgår från startposition, men hamnar efter under övning ett och checkar därför ut övning 2 från exemplet. Eva fortsätter med sin egen implementation istället.

Under övningarna tänker vi oss att deltagarna arbetar i par, för att fokusera bättre och kunna hjälpa varandra. Växla mellan att skriva kod och vara bisittare inom paren.

Dag 1
----

### Intro

Mål: Sätta upp en fungerande testmiljö att bygga vidare på

- Demo med existerande applikation
- Metoden red-green-refactor
- Vad undvek vi för problem?
- Vad vinner vi på detta?
- Hur fungerar jUnit
- Kanariefågeltestet

Övning: Från ``git clone`` till ``@Test public void canary(){}``

### Enkla enhetstester

Mål: Förstå och utföra processen med enhetstest (red-green-refactor)

- Enhetstestets anatomi
- Given-When-Then (Arrange-Act-Assert)
- En (1) assert (koncept) per test
- Single responsibility principle (S)
- Grundläggande exempel
- Vad och hur mycket ska man testa?
  - Zero-one-some-lots-oops (0,1,5,2000,!?)
  - Happy/sad path (men inte exceptions)

Övning: Implementera en första metod/klass för att räkna ut Scrabblepoäng för ett ord

> Lunch

### Från krav till test

Mål: Omvandla ett krav till lämplig mängd enhetstester och dessas implementation

- BDD-intro
- Samarbete med beställare
- Definiera scope
- Testbara exempel (specification by example)
- Levande dokumentation
- Tester ska också underhållas
- Introduktion till övning

Övning: Story -> acceptanstest -> red-green-refactor - "end to end"

> Fika

### Ännu bättre enhetstester

Mål: Skriva läsbara och återanvändbara tester för att förenkla (morgondagens) refaktorisering

- Skriv det test som du vill läsa (builder pattern)
- Red-(bättre feedback)-green-refactor
- Att testa exceptions
- Att undvika upprepad testkod (setup-teardown)
- Funktionella tester är enklare att underhålla än statebaserade
- Att undvika överproduktion (you ain't gonna need it)

Övning: Test av exceptions och förbättring av existerande test

Dag 2
----

### Refaktorisering

Mål: Förstå hur applikationen hålls ihop genom att ständigt refaktorisera

- Därför refaktorisering
- Test driven design
- Onion architecture
- Mockning (stubbning, fakes etc)
- Adapter pattern
- Att undvika new

Övning: Mocka bort ordlistan (från den jobbiga yttre världen) i scrabble

> Lunch

Övning: Mer applikation, för nu lär några större refaktoriseringar vara på sin plats

### Continuous integration

- Continuous integration som princip
- CI som samarbetsverktyg
- Verktyg för att förbättra kodkvalitet och undvika enkla misstag
- Att bli säker på din produkt
- Att testa många olika konfigurationer

> Fika

### Verktyg för testdriven design, SOLID

- Single responsibility principle (S) (repetition)
- Open/closed (O)
- Liskov substitution (L)
- Interface segregation (I)
- Dependency Inversion (D)

Övning: Avslutande övning beroende på hur långt vi hunnit, alternativt tidig avslutning
