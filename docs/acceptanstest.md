# Övning 3: Acceptanstest

Använd reglerna i Scrabble för att skriva acceptanstest.

Använd Builder pattern för att göra Arrange-steget av testerna så lätta att
läsa som möjligt. Exempel:

    Play play = new PlayBuilder()
     .asPlayer("Alice")
     .playingLetters("HORN")
     .across()
     .atRow(1)
     .atColumn(2)
     .build();

Det viktiga här är att beskriva det sätt omvärlden förväntar sig interagera med vårt spel.

## Alternativ utgångspunkt

Om ni vill kan ni utgå från git branch ``tre``, där det finns ett exempel på
färdigt acceptanstest och ett namn till ett andra.
