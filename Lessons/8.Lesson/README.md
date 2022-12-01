# 8. Hodina

- Vytvořte třídu Point a Vector. Bod má X a Y souřadnici, ale může mít i více dimenzí (např. z). Je lepší řešit zadání obecně. Třída Point bude mít metodu getVector(), ktera vytvori novou instanci tridy Vector, ktery znazornuje ,,cestu" z jednoho bodu (point) do druhého.
- Pokud je vyřešen první ukol obecně, tzn. že třída Point má pole integerů s názvem cords. Je požné z této třídy Point vytvořit libovolného potomka následujícího formátu:
  - Point2D - Pouze 2D bod
  - Point3D - Pouze 3D bod
- Pro vyřešení bodu výšše je potřeba využít klíčového slovíčka ,,Extends" a minimalizovat duplicitu kódu.

- Vytvořte metodu, která má navstupu procentuální pravděpodobnost, kterou určitě znáte z her. V hrách bývá, že máte 10% šanci na to, aby Vám padl epic.. Vaším ukolem je naprogramovat metodu, která bude vrace True se zadanou pravděpodobností na vstupu.
- Pokud máte metodu s pravděpodobností výše, tak zjistěte, jestli pravděpodobnost doopravdy platí. Tzn. je potřeba dát metodu do cyklu (s min 1000 cykly), a pocítat kolikrát metoda vrátí True. Následně je celkový počet true vydělen celkovým počtem otáček. Výsledkem by měla být pravděpodobnost blízká zadanému parametru na vstupu metody popsané v bodu výše.

## **Domácí úkol**

### Šťastných 10

Vašim úkolem je vytvořit aplikaci dle hry Šťastných 10.

- V této hře lze vsadit 1 až 10 číšel.
- Pro případ tohoto zadání hru trochu resp. výhry trochu ulehčíme, jelikož samotná hra má spoustu možností, které jsou výherní.
  - Pro výhru musí hráč uhodnout alespoň polovinu ze vsazených číšel. (tj. 2 ze 4, 4 ze 7, 5 z 9, atd...)
  - Výhra pak bude počínána následovně:
  - např. vsadím 10 čísel, uhodnu 6 => výhra bude vklad x 10 x 6
  - vsadím 5 čísel, uhodnu 4 => výhra bude vklad x 5 x 4

#### Další možné vylepšení
Pro získání další bonusové jedničky je možné základní verzi rozšít.
- Přidání možnosti vyběru královské čísla (ze vsazených čísel)
  - Při uhodnutí tohoto čísla a méně než potřebné poloviny ze vsazených čísel se nám pouze vrátí vklad
  - Pří uhodnutí tohoto čísla a zároveň alespoň poloviny ze vsazených čísel se nám celá výhra znásobí ještě 10x
