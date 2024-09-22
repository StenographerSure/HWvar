public class Main {
        public static void main(String[] args) {
            //задание 1
            //Присваиваем переменные

            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println("Task 1:");
            System.out.println("dog = " + dog);
            System.out.println("cat = " + cat);
            System.out.println("paper = " + paper);
            System.out.println(" ");

            //задание 2

            dog+=4;
            cat+=4;
            paper+=4;
            System.out.println("Task 2:");
            System.out.println("dog + 4 = " + dog);
            System.out.println("cat + 4 = " + cat);
            System.out.println("paper + 4 = " + paper);
            System.out.println(" ");

            //задание 3

            dog-=3.5;
            cat-=1.6;
            paper-=7639;
            System.out.println("Task 3:");
            System.out.println("dog - 3.5 = " + dog);
            System.out.println("cat - 1.6 = " + cat);
            System.out.println("paper - 7639 = " + paper);
            System.out.println(" ");

            //задание 4

            System.out.println("Task 4:");
            var friend = 19;
            System.out.println(friend);
            friend +=2;
            System.out.println(friend);
            friend = friend/7;
            System.out.println(friend);

            //задание 5

            System.out.println("Task 5:");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog += 4;
            System.out.println(frog);

            //задание 6

            System.out.println("Task 6:");

            var boxer_1 = 78.2;
            var boxer_2 = 82.7;

            System.out.println("Общая масса бойцов = " + (boxer_1 + boxer_2) + " кг");
            System.out.println("Разница масс бойцов = " + (Math.abs(boxer_1 - boxer_2)) + " кг");

            //задание 7

            System.out.println("Task 7:");
            System.out.println("Остаток от деления = " + (boxer_2 % boxer_1));

            //задание 8

            System.out.println("Task 8:");
            var employees = 640/8;
            System.out.println("Всего работников в компании — " + employees + " человек");
            employees += 94;
            System.out.println("Если в компании работает " + employees + " человек, то всего " + (employees*8) + " часов работы может быть поделено между сотрудниками "  );

        }
    }
