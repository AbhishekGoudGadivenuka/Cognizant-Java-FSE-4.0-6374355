-- Scenario 1:
-- The bank wants to apply a discount to loan interest rates for customers above 60 years old.
-- This block loops through all customers and reduces their interest rate by 1% if they are above 60.

DECLARE
    -- Declare a cursor to fetch customer ID, age, and current interest rate
    CURSOR cust_cursor IS
        SELECT customer_id, age, interest_rate FROM customers FOR UPDATE;
BEGIN
    -- Loop through each record returned by the cursor
    FOR cust_rec IN cust_cursor LOOP
        -- Check if the customer's age is above 60
        IF cust_rec.age > 60 THEN
            -- Apply a 1% discount to their current interest rate
            UPDATE customers
            SET interest_rate = interest_rate - 1
            WHERE customer_id = cust_rec.customer_id;
        END IF;
    END LOOP;

    -- Commit the changes to the database
    COMMIT;
END;
/
