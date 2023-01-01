public class Main {
    public static void main(String[] args) {
        int age = 20;
        if (age < 18)
        {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
        else
        {
            System.out.println("Если возраст человека равен " +age + " ,то он совершеннолетний");
        }
        int temp = 8;
        if (temp < 5) {
            System.out.println("На улице " + temp + " На улице холодно, нужно надеть шапку");
        }
        else if (temp > 5)
        {
            System.out.println("На улице " + temp + " Сегодня тепло, можно идти без шапки");
        }


        int speed = 59;
        if (speed < 60)
        {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        else if (speed > 60)
        {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф" );
        }

        int humanAge = 18;
        if (humanAge >=2 && humanAge <=6)
        {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в десткий сад");
        }
        else if (humanAge >=7 && humanAge <=18)
        {
            System.out.println("Если возраст человека равен " + humanAge + " то ему нужно ходить в школу");
        }
        else if (humanAge>18 && humanAge<24)
        {
            System.out.println("Если возраст человека равен " + humanAge + " то его место в университете");
        }
        else if (humanAge>= 24)
        {
            System.out.println("Если возраст человека равен " + humanAge + " то ему пора ходить на работу");
        }
        int child = 5;
        if (child<5)
        {
            System.out.println("Если возраст ребенка равен " + child + " ,то он не может кататься на аттракционе");
        }
        else if (child>=5 && child<14)
        {
            System.out.println("Если возраст ребенка равен " + child + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (child>=14)
        {
            System.out.println("Если возраст ребенка равен " + child + " ,то он может кататься без сопровождения взрослого");
        }
        int human = 103;
        if (human<=60)
        {
            System.out.println("В вагоне осталось сидячих мест " + (60 - human) + " и 42 стоячих");
        }
        else if (human>60 && human<=102)
        {
            System.out.println("В вагоне не осталось сидячих мест, " + (102 - human) + " стоячих места");
        }
        else
        {
            System.out.println("Вагон полностью забит ");
        }
        int one = 3;
        int two = 5;
        int three = 6;
        if (one>=two && one>=three)
        {
            System.out.println(one + " one больше остальных");
        }
        else if (two>=one && two>=three)
        {
            System.out.println(two + " two больше остальных");
        }
        else if (three>=one && three>=two)
        {
            System.out.println(three + " three больше остальных");
        }
    }
}
