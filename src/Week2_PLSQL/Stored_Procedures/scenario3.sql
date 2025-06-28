-- Scenario 3:
-- Customers should be able to transfer funds between their accounts.
-- This procedure transfers a specified amount from one account to another,
-- checking that the source account has sufficient balance before transferring.

CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account_id IN NUMBER,  -- Source account ID
    to_account_id IN NUMBER,    -- Destination account ID
    transfer_amount IN NUMBER   -- Amount to transfer
) AS
    source_balance NUMBER;
BEGIN
    -- Fetch the balance of the source account
    SELECT balance INTO source_balance
    FROM accounts
    WHERE account_id = from_account_id;

    -- Check if source has sufficient balance
    IF source_balance < transfer_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance for transfer');
    END IF;

    -- Deduct from source account
    UPDATE accounts
    SET balance = balance - transfer_amount
    WHERE account_id = from_account_id;

    -- Add to destination account
    UPDATE accounts
    SET balance = balance + transfer_amount
    WHERE account_id = to_account_id;

    -- Commit the transfer
    COMMIT;
END;
/
