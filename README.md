Efter det är nästa steg att:

- Implementera customers och börja slipa på restaurangsidan
- Köpa in toppings, max 100 av varje. Kanske displaya dom var för sig i restaurangsidan senare.


- Felmeddelandet vid max 10 pizzor verkar konstigt att det bara fungerar i css när det har samma som det andra table.
- Vad ska hända när man trycker på next day
- Man skulle kanske kunna ha alla parametervärden sparade i databasen för DAY-klassen. Om 10 finns sparat där för antalet kunder per dag, 5 för antalet max recept, tip-factor etc. så skulle som kunna ändras av uppgraderingarna i Office.
- I office kommer man kunna se utgångsdatumen på ingredienser, så att man kan anpassa recepten efter det.
- Customers
- Bank och ränta
- I office: utöka serveringen (bord/stolar ger fler customers), bättre kylskåp (ger längre hållbarhet), inredning ger högre betalt per pizza.


Pitfalls:

Delete av Pizza och Toppingindex är på samma id. Det funkar för att de sparas i samma metod (samtidigt), så dom bör vara samma, men känns som att något skulle kunna gå fel här.
