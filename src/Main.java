public class Main {
    public static void main(String[] args) {

        //Task 1 "Инициализируем"
        int i = 2100123;
        System.out.println("Значение переменной i с типом int равно "+ i +".");
        byte b = -128;
        System.out.println("Значение переменной b с типом byte равно "+ b +".");
        short s = 15004;
        System.out.println("Значение переменной s с типом short равно "+ s +".");
        long l = 14512365487L;
        System.out.println("Значение переменной l с типом long равно "+ l +".");
        float f = 1.4f;
        System.out.println("Значение переменной f с типом float равно "+ f +".");
        double d = 1.7777777777;
        System.out.println("Значение переменной d с типом double равно "+ d +".\n");


        //Task 2 "Инициализируем-2"
        float floatValue = 27.12f;
        long longValue = 987678965549L;
        double doubleValue = 2.786;
        short shortValue = 569;
        short shortValue2 = 159;
        int intValue2 = 27897;
        byte byteValue = 67;


        //Task 3 "Сколько листов достанется каждому ученику"
        int countOfStudents1 = 23;
        int countOfStudents2 = 27;
        int countOfStudents3 = 30;
        int totalSheetsOfPaper = 480;
        int sheetsOfPaperOnOneStudent = totalSheetsOfPaper / (countOfStudents1 + countOfStudents2 + countOfStudents3);
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperOnOneStudent + " листов бумаги.\n");


        //Task 4 "Производительность машины для изготовления бутылок"
        int machineCapacityPerMinute = 16;
        int machineCapacityPer20Minutes = machineCapacityPerMinute * 20;
        int machineCapacityPerDay = 24 * 60 * machineCapacityPerMinute;
        int machineCapacityPer3Days = machineCapacityPerDay * 3;
        int daysOfMonth = 30;
        int machineCapacityPerMonth = machineCapacityPerDay * daysOfMonth;

        System.out.println("За 20 минут машина произвела " + machineCapacityPer20Minutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + machineCapacityPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + machineCapacityPer3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + machineCapacityPerMonth + " штук бутылок.\n");


        //Task 5 "Количество краски для ремонта школы"
        int totalCans = 120;
        int brownCansPerOneClassRoom = 4;
        int whiteCansPerOneClassRoom = 2;
        int countOfClassRooms = totalCans / (brownCansPerOneClassRoom + whiteCansPerOneClassRoom);
        int totalBrownColor = countOfClassRooms * brownCansPerOneClassRoom;
        int totalWhiteColor = countOfClassRooms * whiteCansPerOneClassRoom;
        System.out.println("В школе, где " + countOfClassRooms + " классов, нужно " + totalWhiteColor +
                                " банок белой краски и " + totalBrownColor +" банок коричневой краски.\n");


        //Task 6 "Завтрак спортсмена"
        float countOfBananas = 5;
        float countOfMilk = 200 / 100;
        float countOfIceCream = 2;
        float countOfRawEgg = 4;
        float weightOfBanana = 80;
        float weightOf100MlMilk = 105;
        float weightOfIceCream = 100;
        float weightOfRawEgg = 70;

        float totalWeightOfBreakfastInGrams = (countOfBananas * weightOfBanana) + (countOfMilk * weightOf100MlMilk) +
                                     (countOfIceCream * weightOfIceCream) + (countOfRawEgg * weightOfRawEgg);
        float totalWeightOfBreakfastInKilos = totalWeightOfBreakfastInGrams / 1000;
        System.out.println("Общий вес спортивного завтрака составляет " + totalWeightOfBreakfastInGrams + " грамм(ов) или " + totalWeightOfBreakfastInKilos + " килограмм(ов).\n");


        //Task 7 "Невозможное возможно (но только в консоли)"
        int overWeightInKilos = 7;
        float weightLossOnDiet1 = 0.25f;
        float weightLossOnDiet2 = 0.5f;
        int daysOfVarDiet1 = (int) (overWeightInKilos / weightLossOnDiet1);
        int daysOfVarDiet2 = (int) (overWeightInKilos / weightLossOnDiet2);
        int averageNumberOfDays = (daysOfVarDiet1 + daysOfVarDiet2) / 2;
        System.out.println(daysOfVarDiet1 + " день (дней) уйдет на то, чтобы сбросить " + overWeightInKilos + " килограммов, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(daysOfVarDiet2 + " день (дней) уйдет на то, чтобы сбросить " + overWeightInKilos + " килограммов, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println("В среднем может потребоваться " + averageNumberOfDays + " день (дней), чтобы добиться результата похудения.\n");


        //Task 8 "Индексация для ценных сотрудников"
        double salaryOfEmployeeMaria = 67760;
        double salaryOfEmployeeDenis = 83690;
        double salaryOfEmployeeKristina = 76230;
        double percentageIncrease = 0.1;
        double newSalaryOfEmployeeMaria = (salaryOfEmployeeMaria * percentageIncrease) + salaryOfEmployeeMaria;
        double newSalaryOfEmployeeDenis = (salaryOfEmployeeDenis * percentageIncrease) + salaryOfEmployeeDenis;
        double newSalaryOfEmployeeKristina = (salaryOfEmployeeKristina * percentageIncrease) + salaryOfEmployeeKristina;
        double differenceSalaryToMaria = newSalaryOfEmployeeMaria - salaryOfEmployeeMaria;
        double differenceSalaryToDenis = newSalaryOfEmployeeDenis - salaryOfEmployeeDenis;
        double differenceSalaryToKristina = newSalaryOfEmployeeKristina - salaryOfEmployeeKristina;

        System.out.println("Маша теперь получает " + newSalaryOfEmployeeMaria + " рублей. Годовой доход вырос на " + differenceSalaryToMaria + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryOfEmployeeDenis + " рублей. Годовой доход вырос на " + differenceSalaryToDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryOfEmployeeKristina + " рублей. Годовой доход вырос на " + differenceSalaryToKristina + " рублей.");
    }
}