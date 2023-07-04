# BankOni

## Description
BankOni is a banking simulation application that allows you to buy and sell shares, monitor a portfolio and check the current value of shares.

## Operation
The application is built in Java and uses the Java Swing library for the GUI. It connects to a simulated server to obtain information about stocks such as maximum value, minimum value and current value.

BankOni's main features include:
- Display of available actions with their respective codes and names.
- Display of detailed information about a selected stock.
- Purchase of shares based on the share code and the desired amount.
- Sale of shares based on the share code and the quantity available in the portfolio.
- Display of the current portfolio with the shares purchased and their quantities.
- Calculation of total portfolio value based on current stock prices.
- Verification of available capital before making a purchase.

## Libraries Used

> - `Java Swing`: Graphic library to build the user interface.
> - `Java Random`: Library to generate random values to simulate stock prices.
> - `Java DecimalFormat`: Library for formatting decimal numbers.
> - ***Java ArrayList***: Library to create and manipulate dynamic lists.
> - **Java HashMap**: Library for creating and manipulating key-value mapping data structures.
> - `Java Scanner`: Library to read user inputs from the command line.

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed.
- Java IDE such as Eclipse or IntelliJ IDEA.

## How to Run
1. Clone the BankOni repository.
2. Import the project into your Java IDE.
3. Run the "bank.java" file to launch the application.

## Commands Available
- `/actions`: Displays the list of available actions.
- `/comprar <code> <quantity>`: Purchases the specified quantity of the share with the informed code.
- `/sell <code> <quantity>`: Sell the specified quantity of the action with the informed code.
- `/port`: Displays the current portfolio with the purchased shares and their values.
- `/capital`: Displays the total amount of available capital.
- `/clear`: Clears the portfolio, removing all purchased shares.
- `/help`: Displays the list of available commands.

## Examples of Usage
- `/actions`: Lists the available actions.
- `/buy AAPL 10`: Buys 10 Apple shares.
- `/sell AAPL 5`: Sell 5 Apple shares.
- `/port`: Displays the current portfolio with the total value of shares.
- `/capital`: Displays the total amount of available capital.
- `/clear`: Clears the portfolio, removing all purchased shares.
- `/help`: Displays the list of available commands.

## Contribution
If you want to contribute to the project, please follow the steps below:
1. Fork the BankOni repository.
2. Create a new branch with your modification: `git checkout -b my-modification`.
3. Make the desired code changes.
4. Commit your changes: `git commit -m 'My modification'`.
5. Push to branch: `git push origin my-modification`.
6. Open a pull request on the original repository.

## Contact
- [My Twitter](https://twitter.com/davvzin)
- My Discord -> `__sombra_`
