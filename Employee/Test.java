package Employee;

import javax.sound.midi.SysexMessage;

public class Test {

    public static void main(String[] args) {

        Employee emp = new Employee();
        Employee emp2 = new PermanentEmployee();

        if(emp.equals(emp2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        emp.toString();
        emp.hashCode();
        System.out.println(emp2.getClass());

        emp.doSomething();
        emp2.doSomething();



    }
}
