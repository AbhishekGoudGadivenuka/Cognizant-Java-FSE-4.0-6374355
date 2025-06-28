-- Scenario 3:
-- The bank wants to send reminders to customers whose loans are due within the next 30 days.
-- This block fetches those loans and prints a reminder message for each customer.

DECLARE
    -- Cursor to fetch loans with due dates within the next 30 days
    CURSOR loan_cursor IS
        SELECT customer_id, loan_id, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;

    -- Variable to store customer name
    v_customer_name VARCHAR2(100);
BEGIN
    -- Loop through each loan that is due soon
    FOR loan_rec IN loan_cursor LOOP
        -- Fetch the name of the customer for the current loan
        SELECT name INTO v_customer_name
        FROM customers
        WHERE customer_id = loan_rec.customer_id;

        -- Print a reminder message using DBMS_OUTPUT
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_customer_name ||
                             ', your loan (ID: ' || loan_rec.loan_id ||
                             ') is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
