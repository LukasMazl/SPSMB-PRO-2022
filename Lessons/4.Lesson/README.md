# 4. Hodina

- Vytvořte metodu pro vygenerování pole s náhodnými hodnotami, které je seřazené (1, 25 ,62 ,68) a na vstupu ma popsané argumenty
  níže. V řešení nesmí být použito Arrays.sort() ani jiný způsob seřazení potom, co je vygenerované pole s náhodnými hodnoty.
    - velikost pole
    - minimální hodnotu
    - maximální hodnotu
- Vernamova šifra - Vytvořte metodu, ktera zašifruje text pomocí  [Vermanova Sifra](https://www.algoritmy.net/article/95/Vernamova-sifra). Na vstupu metody jsou tyto hodnoty:
   - text (typu String)
   - key/password (typu String)

 

## Bonusová úloha

Napište program, který bude kontrolovat změny v původním poli typu int. Program by měl číst data ze standardního vstupu a vypisovat záznamy do standardního výstupu. Na vstupu jsou vždy dvě pole. První pole je původní beze změn. Druhé pole je již po provedených změnách. Změnou může být chápáno přidání čísla nebo smazání čísla. Z toho by mělo být patrné, že velikosti těchto vstupních polí mohou být rozdílné. Pokud číslo bylo vloženo vypíše program INS ČÍSLO, pokud číslo bylo z původního pole smazáno, tak program vypíše DEL ČÍSLO.

První hodnotou na vstupu programu je velikost prvního - původního - pole, následuje sekvence hodnot, která slouží k naplnění prvního pole. Další hodnotou je - po těch předchozích - je velikost druhého - upraveného pole. Znovu následuje sekvence čísel k naplnění pole.

Příklad vstupu:

**5**

**1**
**2**
**3**
**4**
**5**

**6**

**1**
**3**
**4**
**5**
**6**
**7**

Očekávaný výstup:

**DEL 2**

**INS 6**

**INS 7**
