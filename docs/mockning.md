# Övning 4: Mockning

Med ett eller flera av acceptanstesten som stöd, implementera första spelomgången
i Scrabble. Beskriv med hjälp av mockar hur de olika tänkta klasserna i applikationen
interagerar. Förhoppningen är att hitta de metoder och indatatyper som behövs
innan vi kan börja implementera klasserna, så att vi inte skriver något som inte
behövs, eller som är svårt att testa.

Till skillnad från acceptanstesterna är det tillåtet att beskriva "hur" något
ska utföras. Hur hänger applikationen ihop? Vad anropas spelbrädet med när
ett ord spelas? Vad händer om rack.add() kastar ett exception?

Använd testnamn som relaterar till det verkliga spelet. Testimplementationen
får dock ha mer teknisk karaktär. Det är bra att använda Builders även här.

[Mockito](http://static.javadoc.io/org.mockito/mockito-core/2.7.10/org/mockito/Mockito.html)

## Alternativ utgångspunkt

Om ni vill kan ni utgå från git branch ``fyra``, där några exempel på mockning
i test finns beskrivna.

# Fortsatta övningar:

När mockar finns på plats som beskriver hela första rundan, implementera
en av de riktiga klasserna för att uppfylla acceptanstesternas krav. Några idéer:

- Kanske behöver Rack.java refaktoriseras lite för att passa in?
- Hur avgör brädet vilka ord som skapats när någon lägger ut brickor?
- Implementera att dra slumpmässiga brickor ur påsen?
- Hur testar man att räkna poäng med bonusrutor inblandat utan att bryta mot
Single Responsibility?

git branch: ``master``
