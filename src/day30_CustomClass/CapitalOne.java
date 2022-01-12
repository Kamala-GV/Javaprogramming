package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setInfo("Kamala",5566,'F',"SDET",110000, true);


        Employee employee2=new Employee();
        employee2.setInfo("Ayla",5266,'F',"QA",100000, false);


        Employee employee3=new Employee();
        employee3.setInfo("Ali",5126,'M',"SDET",95000, true);

        Employee employee4=new Employee();
        employee4.setInfo("Aygun",6666,'F',"Automation engineer",90000, false);


      Employee[] employees={employee1,employee2,employee3,employee4};

      int fullTimeCount=0;
      int partTimeCount=0;
      double max=employees[0].salary;
      double min=employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                fullTimeCount++;
            }else{
                partTimeCount++;
            }

            if(employee.salary>max){
                max=employee.salary;

            }
            if (employee.salary<min){
                min=employee.salary;
            }

        }

        System.out.println("Fulltime employees:" +fullTimeCount);
        System.out.println("Parttime employees:"+partTimeCount);

        System.out.println(max);
        System.out.println(min);





    }
}
