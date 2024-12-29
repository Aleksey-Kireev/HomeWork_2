//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
      public static void main(String[] args) {
// Задача 1
//           dog значение 8.0;
//           cat значение 3.6;
//           paper значение 763789

    System.out.println("Задание № 1 ");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

// Задача 2
//  Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4

    System.out.println("Задание № 2 ");
        dog = 8.0 + 4;
        System.out.println(dog);
        cat = 3.6 + 4;
        System.out.println(cat);
        paper = 763789 + 4;
        System.out.println(paper);

//           ----    Задача 3   ----
//  dog уменьшить на 3.5;
//  cat уменьшить на 1.6;
//  paper уменьшить на 7639

    System.out.println("Задание № 3 ");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

//           ----    Задача 4   ----

    System.out.println("Задание № 4 ");
        var friend = 19;
          System.out.println(friend);
        friend = friend+2;
          System.out.println(friend);
          friend = friend / 7;
          System.out.println(friend);

//           ----    Задача 5   ----

   System.out.println("Задание № 5 ");
        var frog = 3.5;
          System.out.println(frog);
        frog = frog * 10;
          System.out.println(frog);
        frog = frog / 3.5;
          System.out.println(frog);
        frog = frog + 4;
          System.out.println(frog);

//           ----    Задача 6   ----

   System.out.println("Задание № 6 ");
        var weight_1 = 78.2;
        var weight_2 = 82.7;
        var summa = weight_1 + weight_2;
          System.out.println(summa);
        var difference = weight_2 - weight_1;
          System.out.println(difference);


//           ----    Задача 7   ----

   System.out.println("Задание № 7 ");
        var ostatok = weight_2 % weight_1;
          System.out.println(ostatok);

//           ----    Задача 8   ----

          System.out.println("Задание № 8 ");
        var worker_1 = 640 / 8;
          System.out.println("Всего работников в компании — " + worker_1 + " человек.");
        var worker_2 = worker_1 + 94;
        var workHours = worker_2 * 8;
          System.out.println("Если в компании работает " + worker_2 + " человека, то всего " + workHours + " часа работы может быть поделено между сотрудниками.");


        }
    }