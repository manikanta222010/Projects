#include<stdio.h>
#include<conio.h>
#include<windows.h>
#include<stdlib.h>
void displayscore()
 {
 char name[20];
 float s;
 FILE *f;
 system("cls");
 f=fopen("score.txt","r");
 fscanf(f,"%s%f",&name,&s);
 printf("\n\n\t\t ");
 printf("\n\n\t\t %s has secured the Highest Score %.2f",name,s);
 printf("\n\n\t\t ");
 fclose(f);
 getch();
 }


void help()
 {
 system("cls");
 printf("1.Don't press enter while completing a Question\n\n");
 printf("2.For further problems contact Lab Incharge");
 printf("\n\n press any key to display main menu");
 }
void writescore(float score, char plnm[20])
 {
 float sc;
 char nm[20];
 FILE *f;
 system("cls");
 f=fopen("score.txt","r");
 fscanf(f,"%s%f",&nm,&sc);
 if (score>=sc)
   { sc=score;
     fclose(f);
     f=fopen("score.txt","w");
     fprintf(f,"%s\n%.2f",plnm,sc);
     fclose(f);
   }
 }
int main()
     {
     int countq,countr;
     int r,i;
     int pa;int nq[6];int w;
     float score;
     char choice;
     char playername[20];
     time_t initialtime,finaltime;
     system("cls");
     //randomize();
     mainhome:
     system("cls");
     puts("\n\t\t WELCOME TO C.P. TEST PROGRAM\n\n") ;
     puts("\n\t\t-------------------------------");
     puts("\n\t\t Enter 'S' to Start game       ");
     puts("\n\t\t Enter 'Q' to Quit             ");
     puts("\n\t\t Enter 'H' for Instructions            ");
     printf("\n\t\t-------------------------------\n\n\t\t  ");
     choice=toupper(getch());
    if (choice=='Q')
    exit(1);
    else if (choice=='H')

 {
 help();
 getch();
 goto mainhome;
 }
    else if(choice=='S'){
     system("cls");

     printf("\n\n\n\t\t\tEnter your name...");
     printf("\n\t\t\t(only one word)\n\n\t\t\t");
     gets(playername);

     home:
     system("cls");
     initialtime=time(NULL);
     countq=countr=0;
     i=1;
     start:
     srand ( time(NULL) );
     r=rand()%23+1;
     nq[i]=r;
     for (w=0;w<i;w++)
 if (nq[w]==r) goto start;

     switch(r)
  {
  case 1:
  printf("\n\nLibrary function pow() belongs to which header file?");
  printf("\n\nA.mathio.h\tB.math.h\n\nC.square.h\tD.stdio.h\n\n");
  countq++;
  if (toupper(getch())=='B')
   {
   printf("\n\nCorrect!!!");
   countr++;
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is B.math.h");
   break;
   }

  case 2:
  printf("\n\n\nLibray function getch() belongs to which header file?");
  printf("\n\nA.stdio.h\tB.conio.h\n\nC.stdlib.h\tD.stdlibio.h\n\n");
  countq++;
  if (toupper(getch())=='B')
   {printf("\n\nCorrect!!!");countr++; break;}
  else
   {
   printf("\n\nWrong!!! The correct answer is B.conio.h");
  break;
   }

  case 3:
  printf("\n\n\nWhat is the following is invalid header file in C?");
  printf("\n\nA.math.h\tB.mathio.h\n\nC.string.h\tD.ctype.h\n\n");
  countq++;
  if (toupper(getch())=='B')
   {
   printf("\n\nCorrect!!!");
   countr++;
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is B.mathio.h");
   break;
   }


  case 4:
  printf("\n\n\nThe concept of two two functions with same name is know as?");
  printf("\n\nA.Operator Overloading\tB.Function Overriding\n\nC.Function Overloading\tD.Function renaming\n\n");
  countq++;
  if (toupper(getch())=='C')
   {
   printf("\n\nCorrect!!!");
   countr++;
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is C.Function Overloading");
   break;
   }


  case 5:
  printf("\n\n\nWhat is meaning of below lines?  void sum (int, int);");

  printf("\n\nA.sum is a function which takes two int arguments and returns void\tB.it will produce compilation error\n\nC.Can't comment\tD.sum is function which takes int arguments\n\n");
  countq++;
  if (toupper(getch())=='A')
   {
   printf("\n\nCorrect!!!");
   countr++;
    break;
	}
  else
   {
   printf("\n\nWrong!!! The correct answer is A.sum is a function which takes two int arguments and returns void");
   break;
   }

  case 6:
  printf("\n\n\nWhen C Language was invented?");
  printf("\n\nA. 1970\tB. 1972\n\nC. 1978\tD. 1979\n\n");
  countq++;
  if (toupper(getch())=='B' )
   {
   printf("\n\nCorrect!!!");
   countr++;
    break;
	}
  else
   {
   printf("\n\nWrong!!! The correct answer is B. 1972");
   break;
   }


  case 7:
  printf("\n\n\nHow many loops are there in C?");
  printf("\n\nA.2\tB.1\n\nC.3\tD.4\n\n");
  countq++;
  if (toupper(getch())=='C')
   {printf("\n\nCorrect!!!");countr++; break;}
  else
   {printf("\n\nWrong!!! The correct answer is C. 3");break;}


  case 8:
  printf("\n\n\nCan we declare function inside structure of C Programming?");
  printf("\n\nA.Yes\tB.Depends on Compiler\n\nC.Yes but run time error\tD.No\n\n");
  countq++;
  if (toupper(getch())=='D')
   {
   printf("\n\nCorrect!!!");
   countr++; 
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is D.No");
   break;
   }


  case 9:
  printf("\n\n\nWho is the father of C Language?");
  printf("\n\nA.Bjarne Stroustrup\tB.James A.Gosling\n\nC.Dennis Ritchie\t\tD.Dr.E.F.Codd\n\n");
  countq++;
  if (toupper(getch())=='C')
   {
   printf("\n\nCorrect!!!");
   countr++;
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is C.Dennis Ritchie");
   break;
   }
  case 10:
  printf("\n\n\nC Language developed  at?");
  printf("\n\nA.Cambridge University\tB.Sun Microsystems\n\nC.AT & T's Bell Laboratories in 1970\tD.AT & T's Bell Laboratories in 1972\n\n");
  countq++;
  if (toupper(getch())=='D')
   {
   printf("\n\nCorrect!!!");countr++;
   break;
   }
  else
   {
   printf("\n\nWrong!!! The correct answer is D.AT & T's Bell Laboratories in 1972 ");
   break;
   }
  }
 i++;
 if (i<=5) goto start;
 finaltime=time(NULL);
 score=(float)countr/countq*100-difftime(finaltime,initialtime)/3;
 if (score<0) score=0;
 printf("\n\n\nYour Score: %.2f",score);
 if (score==100) printf("\n\nEXCELLENT!!! KEEP IT UP");
 else if (score>=80 && score<100) printf("\n\nVERY GOOD!!");
 else if (score>=60 &&score<80) printf("\n\nGOOD! BUT YOU NEED TO KNOW MORE.");
 else if (score>=40 && score<60) printf("\n\nSATISFACTORY RESULT, BUT NEED LITTLE MORE EFFORT");
 else printf("\n\nYOU ARE VERY POOR IN C.P.,WORK HARD");
 puts("\n\nNEXT QUESTION?(Y/N)");
 if (toupper(getch())=='Y')
  goto home;
 else
  {
  writescore(score,playername);
  goto mainhome;
  }
 }
   else
 {
 printf("\n\n\t\t  Enter the right key\n\n\t\t  ");
 Sleep(700);
 goto mainhome;
 }
 return 0;
}
