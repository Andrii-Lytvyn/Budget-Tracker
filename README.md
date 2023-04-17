# Budget-Tracker

@AA USER
@AA LOGIN
@AA PASS
CATEGORY

ID | NAME | USER | FLAG

1 | FOOD | 1    -> ONLY FOR PARENTS
2 | TOYS | 0    -> FOR EVERYONE

Category for CHILD:
 - toys (GOODS + Comments from CHILD)
 - snacks (FOOD + Comments from CHILD))
 - fun (PARTY + Comments from CHILD)

ID | DATA | USER | CATEGORY | AMOUNT | COMMENTS 
________________________________________________
TYPE OF :
ID - int
DATA - DATA
CATEGORY - LIST<STRING>
USERS - STRING
AMOUNT -DOUBLE (2)
COMMENT - STRING



BALANCE IN FILE, CRYPTO

Outcome
12 | 17.04.23 | CHILD | GOODS | -67 | Toys + Buzz lighter
Outcome
13 | 17.04.23 | PAPA | PARTY | 250 | Vodka + Beer






    - Outcome + Comments
        - Food
        - Closes
        - Party
        - Goods
        - Auto
        - add new....
    - Income
        - Salary + Comments
        - Gifts + Comments
        - Other + Comments
DATA
    - Income for Child 


+ IF USER = PARENT => 100$ CATEGORY | DATA | COMMENTS
+ ELSE USER = CHILD => FALSE
- USER | 60$ CATEGORY | DATA | COMMENTS |

_______________________
+ Balance: + 63$

USER = 1 => SHOW ALL CATEGORY
USER = 0 => SHOW ONLY SELF CATEGORY

REPORTS USER = 1 => SHOW ALL
REPORTS USER = 0 => SHOW SELF Expenses CATEGORY


USER CAN:
    - Add IN/OUT
        - CHOOSE CATEGORY (BY ID)
        - ENTER DATA
        - ENTER SUM
        - ADD COMMENT
        
    - EDIT IN/OUT
        - CHOOSE ID
        - EDIT CATEGORY
        - EDIT DATA
        - EDIT SUN
        - EDIT COMMENT

    - DELETE IN/OUT
        - CHOOSE ID

Output
ANALYTIC:
    - SORT (ID, CATEGORY, DATA, USER, SUM)
    - BALANCE
    - CHARTS (by SUM, USER, CATEGORY)
    - 



