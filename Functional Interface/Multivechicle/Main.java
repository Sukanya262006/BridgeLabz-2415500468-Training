public class Main{
    public class void main(String[] args){
        Vechicle car= new Car();
        Vechicle bus= new Buses();
        Vechicle bike= new Bikes();

        car.rent();
        bus.rent();
        bike.rent();

        car.returnVechicle();
        bus.returnVechicle();
        bike.returnVechicle();
    }
}