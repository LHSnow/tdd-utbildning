# Övning 2: Refaktorisera enhetstester

Förmodligen ser många enhetstester ungefär likadana ut, vilket gör dem svårlästa.

* Använd en ``@Before``-metod för att minska upprepad kod vid Arrange-steget av testerna
* Anropa metoder inline i assert-anrop för att minska variabeltilldelning, till exempel:


    //före
    boolean allowed = pick("");
    assertFalse(allowed);
    //efter
    assertFalse(pick(""));

Använd ``@Test(expected = ...Exception)`` för att testa exceptions. Till exempel om
Rack.add() medför att stället får fler än sju brickor.

## Alternativ utgångspunkt

Om ni vill kan ni utgå från git branch ``tva``, där tester och implementationen
för Rack har kommit en bit på vägen, men kan behöva förbättras.
