/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer,customer2,customer3;
    public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer2 = new MountainCustomer();
                break;
            case "Delinquent":
                customer3 = new DelinquentCustomer();
                break;
        }
    }
    public String generateMail() {
        return customer.createMail();
    }
    public String generateMail2() {
        return customer2.createMail();
    }
    public String generateMail3() {
        return customer3.createMail();
    }
    
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.getCustomerTypeFromUser("Regular");
                System.out.println(app.generateMail());   
                break;
            case 2:
                app.getCustomerTypeFromUser("Mountain");
                System.out.println(app.generateMail2());   
                break;
            case 3:
                app.getCustomerTypeFromUser("Delinquent");
                System.out.println(app.generateMail3());   
                break;
            
        }
              
    }
}
