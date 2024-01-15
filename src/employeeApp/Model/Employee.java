package employeeApp.Model;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee (int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index,String name) {
        if(index < 0) {
            System.out.println("Index değeri 0'dan küçük olamaz");
        } else{
            try {
                boolean isExist = false;
                for(String healthPlan: healthPlans) {
                    if(healthPlan != null && healthPlan.equals(name)) {
                        isExist = true;
                        System.out.println(name + " Healthplans içerisinde mevcut. ");
                        break;
                    }
                }

                if(!isExist) {
                    if(healthPlans[index] == null){
                        healthPlans[index] = name;
                    }else{
                        System.out.println("İlgili index doludur" + index);
                    }

                }




            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index:" + index);
            } catch (Exception exception) {
                System.out.println("Error occured:" + exception.getMessage());
            }
        }

    }
}
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
