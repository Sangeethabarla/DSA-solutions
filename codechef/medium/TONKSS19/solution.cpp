class Codechef {
    public static void main(String[] args) {
        int employeeId = 101; // Employee ID is accessible throughout the method

        {
            int salary = 50000; // Salary is only accessible inside this block
            System.out.println("Employee Details - ID: " + employeeId + ", Salary: " + salary);
        }

        System.out.println("Outside the block - Employee ID: " + employeeId);
        // System.out.println("Salary: " + salary); // Uncommenting this line will cause a compilation error
    }
}
