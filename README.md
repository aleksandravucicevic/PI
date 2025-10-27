# Monte Karlo metoda
Program demonstrira aproksimaciju broja **π (PI)** pomoću Monte Karlo metode.
Na osnovu nasumično generisanih tačaka u jediničnom kvadratu, odnosno tačaka koje su generisane unutar jediničnog kruga upisanog u taj kvadrat, procjenjuje se vrijednost broja π.

## Algoritam
1. Program zahtjeva od korisnika unos broja tačaka koje će biti generisane, te broja decimala od interesa za korisnika.
2. Generiše se uneseni broj slučajnih tačaka (x, y) u kvadratu [0, 1] × [0, 1].
3. Za svaku tačku se izvrši provjera da li se nalazi unutar kruga čiji je poluprečnik jednak 1, tj. provjeri se da li tačka ispunjava uslov:<br>
   ![formula](https://latex.codecogs.com/png.image?\dpi{110}\color{Cyan}x^{2}+y^{2}\le1)
5. Odnos broja tačaka unutar kruga i ukupnog broja generisanih tačaka koristi se za aproksimaciju broja π:  
   ![formula](https://latex.codecogs.com/png.image?\dpi{110}\color{Cyan}\pi\approx4\times\frac{\text{broj%20tacaka%20u%20krugu}}{\text{ukupan%20broj%20tacaka}})
6. Program zatim poredi dobijenu aproksimiranu vrijednost broja π sa stvarnom vrijednošću i prikazuje koliko decimala se poklapa kod ova dva broja.

## Primjer izvršavanja
```
Broj tacaka: 1000000  
Broj decimala od interesa: 5  
Aproksimacija broja PI: 3.14058  
Stvarna vrijednost PI: 3.14159  
Broj decimala koje se poklapaju: 2
```

# Autorska prava
© 2025 Aleksandra Vučićević
