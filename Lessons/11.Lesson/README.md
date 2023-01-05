# Informace a plán k 11. hodině předmětu programování

## Téma hodiny: **Kolekce**

- kolekce reprezentuje skupinu objektů, tyto objekty lze nazvat také jako elementy kolekce
- některé kolekce mohou obsahovat duplikátní elementy jiné zas ne
- kolekce mohou být seřazené i neseřazené


## Set
- tato kolekce neobsahuje duplicitní elementy a nejvýše jeden null element
- jedná se o neseřazenou kolekci
- SortedSet, NavigableSet
- jelikož Set je rozhraní není možné z něj vytvářet instance a je potřeba použít třídu, která toto rozhraní implementuje
  - HashSet, EnumSet, LinkedHashSet, TreeSet

## List
- jedná se seřazenou kolekci (sekvenci)
- k elementům Listu je možné přistupovat pomocí indexu (integer), který udavá pozici elementu v Listu
- v Listu je rovněž možné hledat elementy
- narozdíl od Setu může List obsahovat duplicitní elementy, vícero null elementů
- jelikož List je rozhraní nelze z něj vytvářet instance a je potřeba využít třídu, která toto rozhraní implementuje
  - ArrayList, LinkedList, Stack, Vector

## ArrayList
- implementuje rozhraní List
- ArrayList je incializovaný velikostí
  - velikost se ale může zvětšit/zmenšit v případě potřeby  
- není synchronizovaný
- nelze použít pro primitivní datové typy je potřeba použít wrapper class (Character, Interger, Double,...)

## LinkedList
- LinkedList se chová jako dynamické pole a není tak potřeba při jeho vytváření zadávat velikost
- každý element (node) rozdělený na část s daty a na část s adresou
- element (node) není přístupný přímo
- každý element (node) je propojený (odkazuje) následující elemenent
  - v případě dvojitě propojeného seznamu obsahuje element (node) odkaz i na předchozí element (node)
- není synchronizovaný

## Vector
- implementuje rozhraní List
- implenentuje dynamické pole (kapacita se zvyšuje/změnšuje dle potřeby)
- narozdíl od ArrayList je sychrnonizovaný (thead-safe)
  - horší výkonost při operacích přidaní, smazání, hledání či úpravy elemenu
- k elementům Vectoru je možné přístupovat za pomocí indexu (integer)
- každý vector se snaží optimalizovat 

## Stack
- založeno na principu LIFO (last-in-first-out)
- základní operace pop, push
- rozširuje třídu Vector
- synchronizovaný (thread-safe)

## ArrayDeque
- není synchronizovaná
- nemůže obsahovat null elementy
- umožňuje přidat či odebrat element z obou stran fronty
- ArrayDeque bude pravděpodobně rychlejší než Stack, když bude použita jako zásobník 
- ArrayDeque bude pravděpodobně rychlejší než LinkedList, když bude použita jako fronta
