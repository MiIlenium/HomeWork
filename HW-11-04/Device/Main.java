/*
Создать базовый класс «Устройство» и производные
классы «Чайник», «Микроволновка», «Автомобиль», «Па-
роход». С помощью конструктора установить имя каждого
устройства и его характеристики.
Реализуйте для каждого из классов методы:
■■ Sound — издает звук устройства (пишем текстом
в консоль);
■■ Show — отображает название устройства;
■■Desc — отображает описание устройства.
 */
package Device;

public class Main {
    public static void main(String[] args) {
        Teapot teapot = new Teapot();
        Microwave microwave = new Microwave();
        Vehicle vehicle = new Vehicle();

        teapot.setDesc("Teapot is used for boil a water.");
        teapot.setSound("Whistle");
        teapot.setShow("BrAun");
        System.out.println(teapot.getDesc() + " It sounds like a " + teapot.getSound() + ", and it is from the " + teapot.getShow());

        microwave.setDesc("Microwave is used for warm your food.");
        microwave.setSound("Be Be Be");
        microwave.setShow("Bosh");
        System.out.println(microwave.getDesc() + " It sounds like " + microwave.getSound() + ", and it is from the " + microwave.getShow());

        vehicle.setDesc("Vehicle is used for transport people.");
        vehicle.setSound("TrTrTr");
        vehicle.setShow("Volkswagen");
        System.out.println(vehicle.getDesc() + " It sounds like " + vehicle.getSound() + ", and it is from the " + vehicle.getShow());
    }
}
