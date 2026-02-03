# Adapter Pattern Question: Payment Gateway Integration

## **Problem**: Legacy Payment System Upgrade

## **Existing System**:
- **LegacyPaymentProcessor**: Only accepts payments via `processCreditCard(String cardNumber, double amount)`
- Current system works with old credit card processing

## **New Requirements**:
Need to support modern payment methods:
1. **PayPal**: Uses `makePayment(String email, double amount)`
2. **Stripe**: Uses `charge(String token, double amount)`

## **Constraints**:
- Cannot modify `LegacyPaymentProcessor` (used by other systems)
- Cannot modify third-party `PayPal` and `Stripe` SDKs
- Must support all payment methods through single interface

## **Your Task**:
Design an adapter system allowing the legacy processor to handle PayPal and Stripe payments transparently.

## **Expected**:
- Client calls same method for all payment types
- System automatically adapts to appropriate gateway
- Error handling for invalid payment methods