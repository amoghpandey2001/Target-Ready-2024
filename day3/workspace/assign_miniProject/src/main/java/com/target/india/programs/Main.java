package com.target.india.programs;

import com.target.india.utils.KeyboardUtil;
import com.target.india.model.CrudOperator;

public class Main {
    private static final String ADD_CUSTOMER_COMMAND = "1";
    private static final String VIEW_ALL_CUSTOMERS_COMMAND = "2";
    private static final String SEARCH_CUSTOMER_COMMAND = "3";
    private static final String DELETE_CUSTOMER_COMMAND = "4";
    private static final String UPDATE_CUSTOMER_COMMAND = "5";
    private static final String EXIT_COMMAND = "6";
    private static final String MENU_OPTIONS = """

            MENU
            1. Add new customer
            2. View all customers
            3. Search customers by city
            4. Delete a customer (by ID)
            5. Search customers by ID and edit/update details
            6. Exit
            
            Enter the choice:\s""";

    public static void main(String[] args) {
        String input = KeyboardUtil.getString(MENU_OPTIONS);
        while(!input.equals(EXIT_COMMAND))
        {
            try {
                switch (input) {

                    case ADD_CUSTOMER_COMMAND:
                        CrudOperator.processAddData();
                        break;

                    case VIEW_ALL_CUSTOMERS_COMMAND:
                        CrudOperator.printData();
                        break;

                    case SEARCH_CUSTOMER_COMMAND:
                        CrudOperator.processSearchData();
                        break;

                    case DELETE_CUSTOMER_COMMAND:
                        CrudOperator.processDeleteData();
                        break;

                    case UPDATE_CUSTOMER_COMMAND:
                        CrudOperator.processUpdateData();
                        break;

                    default:
                        System.out.println("Please enter a valid input or enter \"exit\" to terminate the program.\n");
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            input = KeyboardUtil.getString(MENU_OPTIONS);
        }
    }
}
