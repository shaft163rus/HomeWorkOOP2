public class Main {
    public static void main(String[] args) {


        Transport[] transports = new Transport[6];

        transports[0] = new Bicycle("Merida", 2);
        transports[1] = new Bicycle("Trek", 2);
        transports[2] = new Car("Mazda", 4);
        transports[3] = new Car("BMW", 4);
        transports[4] = new Truck("Kamaz", 12);
        transports[5] = new Truck("Belaz", 10);



        transports[0].check();
        System.out.println();
        transports[2].check();
        System.out.println();
        transports[5].check();


    }
}