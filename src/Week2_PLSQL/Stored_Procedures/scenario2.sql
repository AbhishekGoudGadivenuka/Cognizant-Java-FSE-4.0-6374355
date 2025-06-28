-- Scenario 2:
-- The bank wants to implement a bonus scheme for employees based on their performance.
-- This procedure updates employee salaries in a given department by adding a bonus percentage (passed as parameter).

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_id IN NUMBER,             -- Department ID
    bonus_percent IN NUMBER        -- Bonus percentage (e.g., 10 for 10%)
) AS
BEGIN
    -- Update salary of employees in the given department
    UPDATE employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;

    -- Commit the changes
    COMMIT;
END;
/
