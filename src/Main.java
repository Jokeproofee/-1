public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        Human human = new Human(35,"Максим","Минск","бренд-менеджер");
        Human human1 = new Human(29,"Аня","Москва","методист образовательных программ");
        Human human2 = new Human(28,"Катя","Калининград","продакт-менеджер");
        Human human3 = new Human(27,"Артём","Москва","директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() + ". Я родился в " + (year - human.getYearOfBirth()) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human1.getName() + ". Я из города " + human1.getTown() + ". Я родился в " + (year - human1.getYearOfBirth()) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.getName() + ". Я из города " + human2.getTown() + ". Я родился в " + (year - human2.getYearOfBirth()) + " году. Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.getName() + ". Я из города " + human3.getTown() + ". Я родился в " + (year - human3.getYearOfBirth()) + " году. Будем знакомы!");

        //Задание 2
        System.out.println("Задание 2");
        System.out.println("Привет! Меня зовут " + human.getName() + ". Я из города " + human.getTown() + ". Мне " + human.getYearOfBirth() + " лет." + " Я работаю на должности " + human.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human1.getName() + ". Я из города " + human1.getTown() + ". Мне " + human1.getYearOfBirth() + " лет." + " Я работаю на должности " + human1.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human2.getName() + ". Я из города " + human2.getTown() + ". Мне " + human2.getYearOfBirth() + " лет." + " Я работаю на должности " + human2.getJob() + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + human3.getName() + ". Я из города " + human3.getTown() + ". Мне " + human3.getYearOfBirth() + " лет." + " Я работаю на должности " + human3.getJob() + ". Будем знакомы!");

        //Задание 3
        System.out.println("Задание 3");
        Car lada = new Car("Lada","Grande",1.7,"жёлтый",2015,"Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        Car bmw = new Car("BMW","Z8",3.0,"черный",2021,"Германия");
        Car kia = new Car("Kia","Sportage 4",2.4,"красный",2018,"Южная Корея");
        Car hyundai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");

        System.out.println(lada.getBrand() + " " + lada.getModel() + ", " + lada.getProductionYear() + " год выпуска, страна сборки " + lada.getProductionCountry() + "," + lada.getColor() + " цвет, объем двигателя - " + lada.getEngineVolume() + " литра.");
        System.out.println(audi.getBrand() + " " + audi.getModel() + ", " + audi.getProductionYear() + " год выпуска, страна сборки " + audi.getProductionCountry() + "," + audi.getColor() + " цвет, объем двигателя - " + audi.getEngineVolume() + " литра.");
        System.out.println(bmw.getBrand() + " " + bmw.getModel() + ", " + bmw.getProductionYear() + " год выпуска, страна сборки " + bmw.getProductionCountry() + "," + bmw.getColor() + " цвет, объем двигателя - " + bmw.getEngineVolume() + " литра.");
        System.out.println(kia.getBrand() + " " + kia.getModel() + ", " + kia.getProductionYear() + " год выпуска, страна сборки " + kia.getProductionCountry() + "," + kia.getColor() + " цвет, объем двигателя - " + kia.getEngineVolume() + " литра.");
        System.out.println(hyundai.getBrand() + " " + hyundai.getModel() + ", " + hyundai.getProductionYear() + " год выпуска, страна сборки " + hyundai.getProductionCountry() + "," + hyundai.getColor() + " цвет, объем двигателя - " + hyundai.getEngineVolume() + " литра.");

    }
}