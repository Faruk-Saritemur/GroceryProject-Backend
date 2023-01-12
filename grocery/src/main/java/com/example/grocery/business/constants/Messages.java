package com.example.grocery.business.constants;

public class Messages {

    public class ErrorMessages {
        public static final String ID_NOT_FOUND = "Entered id not found on DB!";
        public static final String CATEGORY_ID_NOT_FOUND = "Entered category id not found on DB";
        public static final String PRODUCER_ID_NOT_FOUND = "Entered producer id not found on DB";
        public static final String SUPPLIER_ID_NOT_FOUND = "Entered supplier id not found on DB";
        public static final String USER_ID_NOT_FOUND = "Entered user id not found on DB";

        public static final String CATEGORY_NAME_REPEATED = "Category name can not be repeat!";
        public static final String PRODUCT_NAME_REPEATED = "Product name can not be repeat!";
        public static final String SUPPLIER_NAME_REPEATED = "Supplier name can not be repeat!";
        public static final String PRODUCER_NAME_REPEATED = "Producer name can not be repeat!";
        public static final String TAX_NUMBER_REPEATED = "Tax number can not be repeat!";
        public static final String NATIONAL_IDENTITY_REPEATED = "National Identity can not be repeated!";

        public static final String EMAIL_REPEATED = "Email address can not be repeat!";
        public static final String PHONE_NUMBER_REPEATED = "Phone number can not be repeat!";
        public static final String INDIVIDUAL_CUSTOMER_PASSWORD_NOT_VALID = "Password can not include firstname or lastname";
        public static final String EMPLOYEE_PASSWORD_NOT_VALID = "Password can not include firstname, lastname or year of birth";
        public static final String AGE_NOT_PERMISSIBLE = "Employee is must older than 18";

    }

    public class GetListMessages {
        public static final String USERS_LISTED = "Users listed!";
        public static final String SUPPLIERS_LISTED = "Suppliers listed!";
        public static final String PRODUCTS_LISTED = "Products listed!";
        public static final String PRODUCERS_LISTED = "Producers listed!";
        public static final String INDIVIDUAL_CUSTOMERS_LISTED = "Individual customers listed!";
        public static final String EMPLOYEES_LISTED = "Employees listed!";
        public static final String CUSTOMERS_LISTED = "Customers listed!";
        public static final String CORPORATE_CUSTOMERS_LISTED = "Corporate customers listed!";
        public static final String CATEGORIES_LISTED = "Categories listed!";
    }

    public class GetByIdMessages {
        public static final String USER_LISTED = "User listed by entered id!";
        public static final String SUPPLIER_LISTED = "Supplier listed by entered id!";
        public static final String PRODUCT_LISTED = "Product listed by entered id!";
        public static final String PRODUCER_LISTED = "Producer listed by entered id!";
        public static final String INDIVIDUAL_CUSTOMER_LISTED = "Individual customer listed by entered id!";
        public static final String EMPLOYEE_LISTED = "Employee listed by entered id!";
        public static final String CUSTOMER_LISTED = "Customer listed by entered id!";
        public static final String CORPORATE_CUSTOMER_LISTED = "Corporate customer listed by entered id!";
        public static final String CATEGORY_LISTED = "Category listed by entered id!";
    }

    public class CreateMessages {
        public static final String PRODUCT_CREATED = "Product added!";
        public static final String PRODUCER_CREATED = "Producer added!";
        public static final String SUPPLIER_CREATED = "Supplier added!";
        public static final String CATEGORY_CREATED = "Category added!";
        public static final String EMPLOYEE_CREATED = "Employee added!";
        public static final String INDIVIDUAL_CUSTOMER_CREATED = "Individual customer added!";
        public static final String CORPORATE_CUSTOMER_CREATED = "Corporate customer added!";
        public static final String USER_CREATED = "User added!";
    }

    public class DeleteMessages {
        public static final String PRODUCT_DELETED = "Product removed from DB!";
        public static final String PRODUCER_DELETED = "Producer removed from DB!";
        public static final String SUPPLIER_DELETED = "Supplier removed from DB!";
        public static final String CATEGORY_DELETED = "Category removed from DB!";
        public static final String EMPLOYEE_DELETED = "Employee removed from DB!";
        public static final String INDIVIDUAL_CUSTOMER_DELETED = "Individual customer removed from DB!";
        public static final String CORPORATE_CUSTOMER_DELETED = "Corporate customer removed from DB!";
        public static final String USER_DELETED = "User removed from DB";
    }

    public class UpdateMessages {
        public static final String PRODUCT_MODIFIED = "Product updated!";
        public static final String PRODUCER_MODIFIED = "Producer updated!";
        public static final String SUPPLIER_MODIFIED = "Supplier updated!";
        public static final String CATEGORY_MODIFIED = "Category updated!";
        public static final String EMPLOYEE_MODIFIED = "Employee updated!";
        public static final String INDIVIDUAL_CUSTOMER_MODIFIED = "Individual customer updated!";
        public static final String CORPORATE_CUSTOMER_MODIFIED = "Corporate customer updated!";
        public static final String USER_MODIFIED = "User updated!";
    }

    public class LogMessages {

    }
}