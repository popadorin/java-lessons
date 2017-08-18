# Java course - lessons
## Tekwill

### Intro
Deci domnul Vasile. 

In lectia-9 e vorba de un grabber de informatie de pe [www.posta.md](www.posta.md) si tipa ii dai un `id` de la tracking information si obtii in consola tabelul cu informatii despre rapoartele produsul trackuit.

* S-a luat ca exemplu `id = RS916319658NL`
* Si s-a obtinut acest link - [http://posta.md/ro/tracking?id=RS916319658NL](http://posta.md/ro/tracking?id=RS916319658NL) 
* Sursa paginii - [view-source:http://posta.md/ro/tracking?id=RS916319658NL](view-source:http://posta.md/ro/tracking?id=RS916319658NL)

### How it works

Mai intii deschide sursele si uite cum arata tabelul de pe [caz](http://posta.md/ro/tracking?id=RS916319658NL) concret cu id-ul dat de mine.

1. Scoti totul cu `git pull origin lesson9` - pentru ca asta e lesson9 branch!
2. Faci `git checkout lesson9` - sa te duci pe branch.
3. Apesi `add maven` pentru ca o sa folosesti Intellij banuiesc.
4. Te uiti la clasa Report care reprezinta Headingul tabelului (`date, country ...`)
5. In main fignea, jos e functia de parsare a html-ului cu sursa siteului obtinut in urma unui URLrequest.
6. E parsat linie cu linie si o sa prinzi logica deja din cod.

![:*](http://www.freepngimg.com/thumb/lips/8-lips-kiss-png-image-thumb.png)