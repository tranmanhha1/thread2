package Thread2;

public class Race {
    public static void main(String a[]){
    RaceCar[] cars = new RaceCar[5];
    cars[0] = new RaceCar(10,"SupperMan");
    cars[1] = new RaceCar(10,"BatMan");
    cars[2] = new RaceCar(10,"IronMan");
    cars[3] = new RaceCar(10,"Captain America");
    cars[4] = new RaceCar(10,"Black Widow");
    for (int i=0;i<5;i++)
        cars[i].start();
}
}
