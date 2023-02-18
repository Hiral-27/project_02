/*
3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
 */
public abstract class T03Car {
    double carPrice;
    String color;

    public T03Car(double carPrice){
        this.carPrice= carPrice;
    }
   abstract double calculateSalePrice();
}

class Truck extends T03Car{
    int weight;

    Truck(double carPrice, int weight){
        super(carPrice);
        this.weight= weight;
    }
    @Override
    double calculateSalePrice() {
        if(weight> 2000){
            return carPrice-= (carPrice*10)/ 100;
        }else{
            return carPrice-= (carPrice*20)/ 100;
        }
    }
}

class Sedan extends T03Car{
    int length;

    Sedan(int length, double carPrice){
        super(carPrice);
        this.length= length;
    }

    @Override
    double calculateSalePrice() {
        if(length> 20){
            return carPrice-= (carPrice*5)/100;
        }else{
         return carPrice-= (carPrice*10)/100;
        }

    }
}
