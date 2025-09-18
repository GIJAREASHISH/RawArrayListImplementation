package Car;



import Employee.PermanentEmployee;

import java.util.ArrayList;

public class Test extends PermanentEmployee {

    public static void main(String[] args) {

//        Car.Maruti maruti = new Car.Maruti();
//        maruti.setcolor();
//        Car.Hyundai hyundai = new Car.Hyundai();
//        hyundai.setcolor();
//        hyundai.setEngine();
//        hyundai.setModel();
//        hyundai.setYear();




        //Car.Mahindra m1 = new Car.Mahindra("Gray","XUV",2025, "Diesel");
        //Car.Mahindra m2 = new Car.Mahindra("Blue","SUV",2025, "Diesel");

     // Car carMahindra = new Mahindra("Gray","XUV",2025, "Diesel");
        Car car1 = new Car("Gray","XUV",2025, "Diesel");
//
//        System.out.println(carMahindra.carChasisNo("123"));
//        carMahindra.carInsuranceNo("1234");


//        Car car1=Car.getInstace();
//        Car car2=Car.getInstace();

//        System.out.println(car1==car2);
//        //Car.Car maruti = new Car.Maruti("Green", "Alto", 2025, "CNG");
//        car1 = new Hyundai("Red","I10",2025, "Petrol");
//
//       // Car.Car car4=new Car.Car();
//
//        car1.display();
//        car2.display();
        //car4.display();



        //Car.Car carm= new Car.Mahindra();
//        m1.setTransmission("Manual");
//        m2.setTransmission("Auto");
//        m1.display();
//        m2.display();



//        car2.display();
//        car3.display();
//        System.out.println(car1);
//        mahindra.setcolor();
//        mahindra.setEngine();
//        mahindra.setModel();
//        mahindra.setYear();
//
//    PermanentEmployee permanent=new PermanentEmployee();
//
//    Test obj=new Test();
//    String email=obj.email;
//
//    String salary=obj.salary;
    //int height=obj.height();


        ArrayList<Car> cars= new ArrayList<Car>();
        cars.add(car1);

        for(Car num:cars){

            System.out.println(num.toString());
        }




    }
}
