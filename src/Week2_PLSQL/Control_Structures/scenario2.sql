-- Scenario 2:
-- A customer can be promoted to VIP status based on their balance.
-- This block iterates through all customers and sets IsVIP = TRUE if their balance is greater than $10,000.

DECLARE
    -- Declare a cursor to fetch customer ID and balance
    CURSOR cust_cursor IS
        SELECT customer_id, balance FROM customers FOR UPDATE;
BEGIN
    -- Loop through each record in the cursor
    FOR cust_rec IN cust_cursor LOOP
        -- Check if the customer's balance is over $10,000
        IF cust_rec.balance > 10000 THEN
            -- Set the IsVIP flag to TRUE for eligible customers
            UPDATE customers
            SET IsVIP = 'TRUE'
            WHERE customer_id = cust_rec.customer_id;
        END IF;
    END LOOP;

    -- Commit the changes to the database
    COMMIT;
END;
/
