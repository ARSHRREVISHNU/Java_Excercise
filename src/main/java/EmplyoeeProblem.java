import java.util.Arrays;

public class EmplyoeeProblem {

    public static void employeeHire(int arr[])
    {
        int size = arr.length;

        Arrays.sort(arr);
       int prod = arr[size-1]*arr[size-2]*arr[size-3];

       System.out.println(prod);
            }


            public static void main(String args[]){



            EmplyoeeProblem employee = new EmplyoeeProblem();
                employee.employeeHire(new int[]{10, 20, 30, 40, 60, 35, 06, 100});

    }
}
