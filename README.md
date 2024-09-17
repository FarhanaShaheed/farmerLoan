
# FarmerLoan Project

## Overview

The `FarmerLoan` project is a simple Java application that calculates the simple interest on a loan taken by farmers. The program prompts the user to enter the principal amount and the time duration for repaying the loan, then calculates the simple interest based on a fixed interest rate.

## Features

- Accepts loan amount and repayment duration as input.
- Calculates simple interest using the formula: 
  \[
  \text{Simple Interest} = \frac{\text{Principal Amount} \times \text{Time Duration} \times \text{Interest Rate}}{100}
  \]
- Displays the calculated simple interest.

## Interest Rate

The interest rate is set to a static value of 2.5% within the `Farmer` class.

## Classes and Methods

### Farmer Class

- **Attributes:**
  - `principalAmount` - The loan amount in Euro.
  - `timeDuration` - The duration to repay the loan in months.
  - `interestRate` - Static interest rate (2.5%).
  - `simpleInterest` - Calculated simple interest.

- **Methods:**
  - `acceptInput()` - Prompts the user to enter the principal amount and time duration.
  - `compute()` - Calculates the simple interest.
  - `disp()` - Displays the calculated simple interest.

### FarmerLoan Class

- **main() Method:**
  - Creates three instances of the `Farmer` class.
  - Accepts input for each farmer.
  - Computes and displays the simple interest for each farmer.
