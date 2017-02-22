# Övning 1: Enhetstesta en klass

> [#1 The player] combines two or more of his or her letters to form a word

Öva på att följa metodiken för TDD genom att implementera ``Rack.java``.
Den representerar spelarens ställ för brickor och har som uppgift
att avgöra om de brickor spelaren velat spela finns på dess ställ. Vilka tester
behövs för att avgöra att implementationen utför det som står i reglerna och
det som antyds av reglerna?

1. Skriv ett fallerande enhetstest
2. Få testet att gå igenom
3. Refaktorisera

Vi tänker oss att Rack.java har följande tre publika metoder. Skriv tester mot
dessa som uppfyller exempel på att använda brickor och lägga till nya.
Använd gärna ``inspect()`` för att kontrollera hur stället ser ut när ``pick()``
och ``add()`` har anropats. Metoden ``pick()`` returnerar sant eller falskt om
ett ord går att välja från brickorna som finns i stället.

    public boolean pick(String word) {};
    public void add(String letters) {};
    public String inspect() {};

Men hur kom vi fram till detta? Det kommer vi gå igenom lite senare under dagen.

## Kom ihåg!

* Arrange > Act > Assert
* Skriv testet först
* Testa en sak i taget
* Fundera på om det går att implementera enklare (-> refaktorisera)

## Alternativ utgångspunkt

Om ni vill kan ni utgå från git branch ``ett`` för att få grundstommen till
klasserna några namn på tester vi tänker behövs.

Ni kan också börja från ert eget kanariefågeltest från tidigare.
