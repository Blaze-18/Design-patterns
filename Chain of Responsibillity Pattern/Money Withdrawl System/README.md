# Chain of Responsibility Pattern Question - **Bank Withdrawal System**

## **Problem**: Multi-Level Money Withdrawal Authorization

## **Scenario**:
A bank needs an automated withdrawal authorization system. Different withdrawal amounts require authorization from different bank officials.

## **Authorization Rules**:
1. **Small Withdrawals** (< $1,000) → Teller approval only
2. **Medium Withdrawals** ($1,000 - $10,000) → Teller → Supervisor approval needed
3. **Large Withdrawals** ($10,000 - $50,000) → Teller → Supervisor → Branch Manager approval needed
4. **Very Large Withdrawals** (> $50,000) → Teller → Supervisor → Branch Manager → Regional Manager approval mandatory

## **Existing System**:
- Withdrawal requests have: `accountNumber`, `amount`, `requestType` (CASH/TRANSFER)
- Each authorizer can: `approve(request)`, `reject(request)`, or `escalate(request)`

## **Constraints**:
- Authorizers should not know about other authorizers in the chain
- System must handle new authorization levels (e.g., Fraud Department)
- Authorization flow must be dynamic based on amount
- Each authorizer can add remarks but cannot bypass chain order

## **Your Task**:
Design a Chain of Responsibility system that automatically routes withdrawal requests to appropriate authorizers based on amount.

## **Expected Behavior**:
```
Withdrawal($500) → Teller approves → COMPLETE
Withdrawal($5,000) → Teller → Supervisor approves → COMPLETE
Withdrawal($25,000) → Teller → Supervisor → Branch Manager approves → COMPLETE
Withdrawal($100,000) → Teller → Supervisor → Branch Manager → Regional Manager approves → COMPLETE
```

## **Requirements**:
- Implement Chain of Responsibility pattern
- Each handler decides to approve or escalate
- Show how rejected requests stop the chain
- Demonstrate adding a new authorization level