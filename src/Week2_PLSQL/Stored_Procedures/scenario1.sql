-- Scenario 1:
-- The bank needs to process monthly interest for all savings accounts.
-- This procedure calculates and updates the balance of each savings account by applying 1% interest.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    -- Update balance by adding 1% interest to all savings accounts
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';

    -- Commit the changes
    COMMIT;
END;
/
