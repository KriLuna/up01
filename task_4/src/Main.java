class Help_Service_Public_Transport{        //класс "Cправочная Cлужба Oбщественного Tранспорта"
    public class transport{ //внутренний клас "Транспорт"
        double departure_time;
        double time_of_arrival;
        double price;
        public transport(double departure_time, double time_of_arrival, double price){
            this.departure_time = departure_time;
            this.time_of_arrival = time_of_arrival;
            this.price = price;
        }
        public void print(){
            System.out.println("Время отправления: " + departure_time);
            System.out.println("Время прибытия: " + time_of_arrival);
            System.out.println("Стоимость проезда: " + price);
            System.out.println("_________________________________\n");
        }
    }
    private transport metro1;
    transport metro = new transport(10.10, 15.14, 177);
    private transport bus1;
    transport bus = new transport(12.55, 17.35, 103);
    private transport train1;
    transport train = new transport(17.20, 22.50, 181);
    public void print_all()
    {
        bus.print();
        metro.print();
        train.print();
    }
}
class practica{
    public static void main(String args[]) {
        Help_Service_Public_Transport obj1 = new Help_Service_Public_Transport();
        obj1.print_all();
    }
}
