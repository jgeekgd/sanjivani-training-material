/*

ISOLATION LEVEL-

# One of the foundations of database processing. 
# Isolation is the `I` in the acronym ACID; 
  the isolation level is the setting that fine-tunes the balance between 
  performance and reliability, consistency, and reproducibility of results when 
   multiple transactions are making changes and performing queries at the same time.
# From highest amount of consistency and protection to the least, the isolation levels 
  supported by InnoDB are: SERIALIZABLE, REPEATABLE READ, READ COMMITTED, and READ UNCOMMITTED.
# With InnoDB tables, many users can keep the default isolation level (REPEATABLE READ) for all operations. 
# Expert users might choose the READ COMMITTED level as they push the boundaries of scalability with OLTP processing, 
  or during data warehousing operations where minor inconsistencies do not affect the aggregate results of large amounts of data. 
# The levels on the edges (SERIALIZABLE and READ UNCOMMITTED) change the processing behavior to such an extent that they are rarely used.
# Hence, we generally use READ COMMITED and REPEATABLE READ
# Isolation levels can be set at GLOBAL or SESSION level
*/
USE gd_sanjivani;
DROP TABLE IF EXISTS ACCOUNT;
CREATE TABLE ACCOUNT ( balance int);
SELECT * FROM ACCOUNT;

START TRANSACTION;
USE gd_sanjivani;
INSERT INTO ACCOUNT VALUES (100);
SELECT * FROM ACCOUNT;
COMMIT;

UPDATE ACCOUNT SET balance=balance+100;


-- NOTE: close an reopen another command prompt windows post login in case of any issues
-- or "exit" command to close session and relogin using mysql -u root -p command.

-- REPEATABLE READ
-- The default isolation level for InnoDB. 
-- It prevents any rows that are queried from being changed by other transactions, thus blocking non-repeatable reads but not phantom reads. .
-- The phantom read problem occurs when a transaction reads a variable once but when it tries to read that same variable again, an error occurs saying that the variable does not exist
-- It uses a moderately strict locking strategy so that all queries within a transaction see data from the same snapshot, that is, the data as it was at the time the transaction started.
-- When a transaction with this isolation level performs UPDATE ... WHERE, DELETE ... WHERE, SELECT ... FOR UPDATE, and LOCK IN SHARE MODE operations, other transactions might have to wait.

-- READ COMMITTED
-- An isolation level that uses a locking strategy that relaxes some of the protection between transactions, in the interest of performance. 
-- Transactions cannot see uncommitted data from other transactions, but they can see data that is committed by another transaction after the current transaction started. 
-- Thus, a transaction never sees any bad data, but the data that it does see may depend to some extent on the timing of other transactions.
-- When a transaction with this isolation level performs UPDATE ... WHERE or DELETE ... WHERE operations, other transactions might have to wait. 

-- READ UNCOMMITTED
-- The isolation level that provides the least amount of protection between transactions. 
-- Queries employ a locking strategy that allows them to proceed in situations where they would normally wait for another transaction. 
-- However, this extra performance comes at the cost of less reliable results, including data that has been changed by other transactions and not committed yet (known as dirty read). 
-- Use this isolation level with great caution, and be aware that the results might not be consistent or reproducible, depending on what other transactions are doing at the same time. 
-- Typically, transactions with this isolation level only do queries, not insert, update, or delete operations.

-- SERIALIZABLE
-- The isolation level that uses the most conservative locking strategy, to prevent any other transactions from inserting or changing data that was read by this transaction, until it is finished. 
-- This way, the same query can be run over and over within a transaction, and be certain to retrieve the same set of results each time. Any attempt to change data that was committed by another transaction since the start of the current transaction, cause the current transaction to wait.
-- This is the default isolation level specified by the SQL standard. In practice, this degree of strictness is rarely needed, so the default isolation level for InnoDB is the next most strict, REPEATABLE READ.

#https://dev.mysql.com/doc/refman/8.0/en/glossary.html#glos_read_committed
#https://dev.mysql.com/doc/refman/8.0/en/innodb-locking.html#:~:text=An%20intention%20exclusive%20lock%20(%20IX,individual%20rows%20in%20a%20table.

# ROW LEVEL LOCKS S & X
-- Shared and Exclusive Locks
-- InnoDB implements standard row-level locking where there are two types of locks, shared (S) locks and exclusive (X) locks.
-- A shared (S) lock permits the transaction that holds the lock to read a row.
-- An exclusive (X) lock permits the transaction that holds the lock to update or delete a row.
-- If transaction T1 holds a shared (S) lock on row r, then requests from some distinct transaction T2 for a lock on row r are handled as follows:
-- A request by T2 for an S lock can be granted immediately. As a result, both T1 and T2 hold an S lock on r.
-- A request by T2 for an X lock cannot be granted immediately.
-- If a transaction T1 holds an exclusive (X) lock on row r, a request from some distinct transaction T2 for a lock of either type on r cannot be granted immediately. Instead, transaction T2 has to wait for transaction T1 to release its lock on row r.

select * from performance_schema.data_locks;
show processlist;
select * from information_schema.processlist;

