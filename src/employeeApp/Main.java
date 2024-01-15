package employeeApp;

import employeeApp.Model.Healthplan;
import employeeApp.enums.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan h1 = new Healthplan( id:1 , name:"A Sigorta", Plan.BASIC);
        Healthplan h2 = new Healthplan( id:2 , name:"B Sigorta", Plan.ADVANCE);

        System.out.println(h1);
        System.out.println(h2);

        String[] healthPlans = new String [3];
        healthPlans[0] = h1.getName();
        healthPlans[1] = h2.getName();


        Employee employee = new Employee(id: 1, fullName:"Ali Veli",
            email:"ali@gmail.com", password:"1234", healthPlans;)
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
