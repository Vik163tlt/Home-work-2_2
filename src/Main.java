public class Main {
    public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
                task5();
                task6();
                task7();
            }

            private static void task1() {
                System.out.println("Задание 1");
                int clientOS = 0;      //0 — iOS, 1 — Android
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else  {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            private static void task2() {
                System.out.println("Задание 2");
                int clientOS = 1;      //0 — iOS, 1 — Android
                int clientDeviceYear = 2015;
                if (clientOS == 0) {
                    if (clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                            System.out.println("Установите версию приложения для iOS по ссылке");
                        }
                } else {
                    if (clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }else {
                            System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }
            }
            private static void task3() {
                System.out.println("Задание 3");
                int year = 2000;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " - год является високосным");
                } else {
                    System.out.println(year + " - год не является високосным");
                }
            }
            private static void task4() {
                System.out.println("Задание 4");
                int deliveryDistance = 95; // Код написан в зависимости от критериев оценки
                int days = (deliveryDistance + 59) / 40;
                System.out.println("Потребуется дней:" + days);
            }
            private static void task5() {
                System.out.println("Задание 5");
                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                    System.out.println("Такого дня не существует");
                }
            }
            private static void task6() {
                System.out.println("Задание 6");
                var age = 19;
                var salary = 58_000;
                String rub = " рублей";
                String text = "Мы готовы выдать вам кредитную карту с лимитом ";
                if (age<23) {
                    if (salary >= 50_000) {
                        System.out.println(text + salary * 1.2 * 2 + rub);
                    } else if (salary >= 80_000) {
                        System.out.println(text + salary * 1.5 * 2 + rub);
                    }else {
                        System.out.println(text + salary * 2 + rub);}
                    }
                else {
                    if (salary >= 50_000) {
                        System.out.println(text + salary * 1.2 * 3 + rub);
                    } else if (salary >= 80_000) {
                        System.out.println(text + salary * 1.5 * 3 + rub);
                    }else {
                        System.out.println(text + salary * 3 + rub);}
                }
            }
            private static void task7() {
                System.out.println("Задание 7");
                var age = 25;
                var salary = 60_000;
                var wantedSum = 330_000;
                var basePayMonth = (wantedSum * 1.1 / 12);
                System.out.println(basePayMonth);
                var maxPay = salary * 0.5;
                    if (salary > 80_000) {
                        maxPay = maxPay - maxPay * 0.007;
                    } else {
                        if (age < 23) {
                            maxPay = maxPay + maxPay * 0.01;
                        }
                        if (age < 30) {
                            maxPay = maxPay * 1.005;
                        }
                    }

                    boolean approval = basePayMonth - maxPay > 0;
                    if (approval) {
                        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + basePayMonth + "\nПлатеж по кредиту " + maxPay + " рублей. Одобрено");
                    }else {
                            System.out.println("Максимальный платеж при ЗП "+salary+ " равен "+basePayMonth+ "\nПлатеж по кредиту "+maxPay+" рублей. Отказано");
                        }
                }// Как оптимизировать код и уменьшить знаки после запятой?????
            }