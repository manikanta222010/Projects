import java.util.Scanner;
public class Online_shopping {
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
Scanner NumScanner=new Scanner(System.in);
System.out.println("******~FLIPKART~******");
double total=0;

double Redmi=6000.00;
double Samsung=6050.00;
double Oppo=5000.00;
double Apple=9000.00;
double Vivo=5000.00;
double Nokia=9050.00;
double Blackberry=8000.00;
double Moto=6000.00;
double Oneplus=9999.00;
double Dell=90000.00;
double Asus=50000.00;
double Hp=80000.00;
double Msi=99999.00;
double Mac=90000.00;
double Nikon=60000.00;
double Canon=50000.00;
double Sony=55000.00;
double Mitv=30000.00;
double Samsungtv=60000.00;
double Sonytv=80000.00;
double Lgtv=45000.00;
double frontloaded=45000.00;
double toploaded=35000.00;
double Samsungfrige=20000.00;
double Lgfrige=16000.00;
double Ifbfrige=19000.00;
double Godrejfrige=17000.00;
double Whirlpoolfrige=16000.00;
double Boschfrige=18000.000;
double Microwave=12000.00;
double Toaster=7000.00;
double Mixer=3500.00;
double Kettel=2000.00;
double cookers=1200.00;
double AC1tonn=27000.00;
double AC2tonn=35000.00;
double Fan=1100.00;
double Filter=1700.00;


// variable to allow user to select choice from the menu;
char choice;
//double total;
// loop from here so that this is printed on the screen continuously till quite
do
{
System.out.println("|------------------------------------|");
System.out.println("| Select from the choices below      |");
System.out.println("|------------------------------------|");
System.out.println("| Code | Description                 |");
System.out.println("|------------------------------------|");
System.out.println("|  M   | Mobile                      |");
System.out.println("|  L   | Laptop                      |");
System.out.println("|  C   | Camera                      |");
System.out.println("|  T   | TV                          |");
System.out.println("|  W   | Washing Machine             |");
System.out.println("|  A   | AC                          |");
System.out.println("|  O   | Other                       |");
System.out.println("|------------------------------------|");

System.out.println("|  E   | EXIT                        |");
System.out.println("|------------------------------------|");
System.out.println();
System.out.println("Enter choice");
// user choice here
choice=kb.next().charAt(0);
// switch statement to allow user to select type of meal
switch(choice)
{
/** this is our first case of the switch
statement.
* the user will select options from the
mobile menu.
* we will repeat another do while
statement and case for each model choosen.
*/
case 'M':
do{
System.out.println("|--------------------------------------------|");
System.out.println("| Select mobile model from the choices below |");
System.out.println("|--------------------------------------------|");
System.out.println("| Code | Description |");
System.out.println("|--------------------------------------------|");
System.out.println("| I | Redmi=6000.00                          |");
System.out.println("| S | Samsung=6050.00                        |");
System.out.println("| O | Oppo=5000.00                           |");
System.out.println("| A | Apple=9000.00                          |");
System.out.println("| V | Vivo=5000.00                           |");
System.out.println("| N | Nokia=9050.00                          |");
System.out.println("| O | Blackberry=8000.00                     |");
System.out.println("| M | Moto=6000.00                           |");
System.out.println("| K | Oneplus=9999.00                        |");
System.out.println("|--------------------------------------------|");
System.out.println("| R | RETURN                                 |");
System.out.println("|--------------------------------------------|");
System.out.println("| E | EXIT                                   |");
System.out.println("|--------------------------------------------|");
System.out.println();
System.out.println("Enter choice ");
choice=kb.next().charAt(0);
// user choice here
System.out.println("Enter quantity");
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'I' : System.out.println("Redmi selected");
//remember that total was initialized from zero
total=total* Redmi;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'S' : System.out.println("Samsung selected");
total=total*Samsung;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'O' : System.out.println("Oppo selected");
total=total*Oppo;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'A' : System.out.println("Apple selected");
total=total*Apple;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'V' : System.out.println("Vivo selected");
total=total*Vivo;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'N' : System.out.println("Nokia selected");
total=total*Nokia;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'B' : System.out.println("Blackberry selected");
total=total*Blackberry;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'M' : System.out.println("Moto selected");
total=total*Moto;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'K' : System.out.println("Oneplus selected");
total=total*Oneplus;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;

//return program to 1st screen
case
'R' : System.out.println("Return Selected");
break;
case
'E' : System.out.println("EXITING SYSTEM");
break;
//invalid entry or caps lock is off
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');
// breaking here because we just deal with our 1st case
break;
// second case here which is the main
case 'L' :
do{
System.out.println("|-----------------------------------------|");
System.out.println("| Select Laptop company from the choices  |");
System.out.println("|-----------------------------------------|");
System.out.println("| Code | Description                      |");
System.out.println("|-----------------------------------------|");
System.out.println("|  D   | Dell=90000.00                    |");
System.out.println("|  A   | Asus=50000.00                    |");
System.out.println("|  H   | Hp=80000.00                      |");
System.out.println("|  M   | Msi=99999.00                     |");
System.out.println("|  B   | Mac=90000.00                     |");
System.out.println("|-----------------------------------------|");
System.out.println("|  R   | RETURN                           |");
System.out.println("|-----------------------------------------|");
System.out.println("|  E   | EXIT                             |");
System.out.println("|-----------------------------------------|");
System.out.println();
System.out.println("Enter choice: ");
System.out.println("Enter quantity: ");
// user choice here
choice=kb.next().charAt(0);
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'D':System.out.println("Dell selected");
total=total*Dell;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'A' :System.out.println("Asus Selected");
total=total*Asus;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'H' :System.out.println("Hp Selected");
total=total*Hp;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'M' :System.out.println("Msi Selected");
total=total*Msi;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'B' :System.out.println("Apple Macbook Selected");
total=total*Mac;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;

case
'R' : System.out.println("Returning to fist screen");
break;
case
'E' : System.out.println("EXITING SYSTEM");
break;
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');

break;
case 'F' :
do{
System.out.println("|-----------------------------------------------|");
System.out.println("| Select Refrigerator company from the choices  |");
System.out.println("|-----------------------------------------------|");
System.out.println("| Code | Description                            |");
System.out.println("|-----------------------------------------------|");
System.out.println("|   S  | Samsungfrige=20000.00                  |");
System.out.println("|   L  | Lgfrige=16000.00                       |");
System.out.println("|   I  | Ifbfrige=19000.00                      |");
System.out.println("|   G  | Godrejfrige=17000.00                   |");
System.out.println("|   W  | Whirlpoolfrige=16000.00                |");
System.out.println("|   B  | Boschfrige=18000.000                   |");
System.out.println("|-----------------------------------------------|");
System.out.println("|   R  | RETURN                                 |");
System.out.println("|-----------------------------------------------|");
System.out.println("|   E  | EXIT                                   |");
System.out.println("|-----------------------------------------------|");
System.out.println();
System.out.println("Enter choice: ");
System.out.println("Enter quantity: ");
// user choice here
choice=kb.next().charAt(0);
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'S':System.out.println("Samsungfrige selected");
total=total*Samsungfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'L' :System.out.println("Lgfrige Selected");
total=total*Lgfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'I' :System.out.println("Ifbfrige Selected");
total=total*Ifbfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'G' :System.out.println("Godrejfrige Selected");
total=total*Godrejfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'W' :System.out.println("Whirlpoolfrige Selected");
total=total*Whirlpoolfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'B' :System.out.println("Boschfrige Selected");
total=total*Boschfrige;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");    
break;

case
'R' : System.out.println("Returning to fist screen");
break;
case
'E' : System.out.println("EXITING SYSTEM");
break;
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');
// break here:end of main meals switch statement;
break;
case 'O' :
do{
System.out.println("|---------------------------------------------|");
System.out.println("| Select Other devices type from the choices  |");
System.out.println("|---------------------------------------------|");
System.out.println("| Code | Description                          |");
System.out.println("|---------------------------------------------|");
System.out.println("|  M   | Microwave=12000.00                   |");
System.out.println("|  T   | Toaster=7000.00                      |");
System.out.println("|  X   | Mixer=3500.00                        |");
System.out.println("|  K   | Kettel=2000.00                       |");
System.out.println("|  C   | cookers=1200.00                      |");
System.out.println("|  F   | Fan=1100.00                          |");
System.out.println("|---------------------------------------------|");
System.out.println("|  R   | RETURN                               |");
System.out.println("|---------------------------------------------|");
System.out.println("|  E   | EXIT                                 |");
System.out.println("|---------------------------------------------|");
System.out.println();
System.out.println("Enter choice: ");
System.out.println("Enter quantity: ");
// user choice here
choice=kb.next().charAt(0);
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'M':System.out.println("Microwave selected");
total=total*Microwave;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'T' :System.out.println("Toaster Selected");
total=total*Toaster;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'X' :System.out.println("Mixer Selected");
total=total*Mixer;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'K' :System.out.println("Kettel Selected");
total=total*Kettel;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'C' :System.out.println("cookers Selected");
total=total*cookers;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'F' :System.out.println("Fan Selected");
total=total*Fan;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;

case
'R' : System.out.println("Returning to fist screen");
break;
case
'E' : System.out.println("EXITING SYSTEM");
break;
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');
// break here:end of main meals switch statement;
break;


case 'T' :
do{
System.out.println("|-----------------------------------------|");
System.out.println("|Select TV company from the choices       |");
System.out.println("|-----------------------------------------|");
System.out.println("|Code | Description                       |");
System.out.println("|-----------------------------------------|");
System.out.println("|  M  | Mitv=30000.00                     |");
System.out.println("|  S  | Sonytv=80000.00                   |");
System.out.println("|  L  | Lgtv=45000.00                     |");
System.out.println("|-----------------------------------------|");
System.out.println("|  R  | RETURN                            |");
System.out.println("|-----------------------------------------|");
System.out.println("|  E  | EXIT                              |");
System.out.println("|-----------------------------------------|");
System.out.println();
System.out.println("Enter choice: ");
System.out.println("Enter quantity: ");
// user choice here
choice=kb.next().charAt(0);
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'M' : System.out.println("Mitv selected");
//remember that total was initialized from zero
total=total*Mitv;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'S' : System.out.println("Sonytv selected");
total=total*Sonytv;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case
'L' : System.out.println("Lgtv  selected");
total=total*Lgtv;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
//return program to 1st screen
case
'R' : System.out.println("Return Selected");
break;
case
'E' : System.out.println("EXITING SYSTEM");
break;
//invalid entry or caps lock is off
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');
// breaking here because we just deal with our 1st case
break;

case 'C' :
do{
System.out.println("|-----------------------------------------|");
System.out.println("|Select Camera company from the choices   |");
System.out.println("|-----------------------------------------|");
System.out.println("|Code | Description                       |");
System.out.println("|-----------------------------------------|");
System.out.println("|  N  | Nikon=60000.00                    |");
System.out.println("|  C  | Canon=50000.00                    |");
System.out.println("|  S  | Sony=55000.00                     |");
System.out.println("|-----------------------------------------|");
System.out.println("|  R  | RETURN                            |");
System.out.println("|-----------------------------------------|");
System.out.println("|  E  | EXIT                              |");
System.out.println("|-----------------------------------------|");
System.out.println();
System.out.println("Enter choice: ");
System.out.println("Enter quantity: ");
// user choice here
choice=kb.next().charAt(0);
// user quantity here
total=NumScanner.nextInt();
switch(choice)
{
case
'N':System.out.println("Nikon selected");
total=total*Nikon ;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case 'C'
:System.out.println("Canon Selected");
total=total*Canon ;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case 'S'
:System.out.println("Sony Selected");
total=total*Sony;
System.out.println("Your total bill is RM " +total);
System.out.println("Would you like to order more?");
break;
case 'R' :
System.out.println("Returning to fist screen");
break;
case 'E' :
System.out.println("EXITING SYSTEM");
break;
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='R');
break;
case 'E' : System.out.println("EXITING SYSTEM");
break;
default:System.out.println("Invalid selection or check caps lock is on");
}
}while(choice!='E');
System.out.println("Total bill to pay RM "+total);
System.out.println("THANK YOU FOR YOUR ORDER");
}
}