public class T03CarTester {
    public static void main(String[] args) {
        T03Car[] cars= {new Truck(35000.50,1000), new Sedan(25,40000.64)};
        for (int i=0; i< cars.length; i++){
            T03Car car= cars[i];
            if(i==0){
                System.out.println("Truck Sale Price: "+car.calculateSalePrice());
            } else{
                System.out.println("Sedan Sale Price: "+car.calculateSalePrice());
            }
        }
    }
}
