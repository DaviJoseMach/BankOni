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

>     import java.text.DecimalFormat;
>     
>     import java.util.ArrayList;
>     
>     import java.util.HashMap;
>     
>     import java.util.InputMismatchException;
>     
>     import java.util.List;
>     
>     import java.util.Map;
>     
>     import java.util.Random;
>     
>     import java.util.Scanner;
>     
>     import java.io.IOException;
>     
>     import java.io.InputStreamReader;
>     
>     import java.io.PrintWriter;
>     
>     import java.security.Key;
>     
>     import java.io.BufferedReader;

## Prerequisites
- Java Development Kit (JDK) 8 or higher installed.
- Java IDE such as Eclipse or IntelliJ IDEA.

## How to Run
1. Clone the BankOni repository.
2. Import the project into your Java IDE.
3. Run the "bank.java" file to launch the application.

## Detailed installation
To run the project, follow the instructions below:

1. Make sure you have the JDK (Java Development Kit) installed on your machine. You can download and install it from the official Oracle website: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
    
2. Clone the repository to your local environment. You can clone the repository using the git command:
    
     bashCopy code
    
     `git clone https://github.com/LeviAckr/BankOni.git`
    
3. Access the project directory:
    
     bashCopy code
    
     `cd BankOni`
    
4. Compile the project source code. Use the `javac` command to compile the `.java` files:
    
     bashCopy code
    
     `javac bank.java`
    
5. Now you can run the project. Use the `java` command followed by the main class name:
    
     bashCopy code
    
     `java bank`
Após seguir essas etapas, o projeto será compilado e executado corretamente em sua máquina. Certifique-se de ter o Java instalado e configurado corretamente para garantir um bom funcionamento do projeto.

## Commands Available
- `/actions`: Displays the list of available actions.
- `/comprar <code> <quantity>`: Purchases the specified quantity of the share with the informed code.
- `/sell <code> <quantity>`: Sell the specified quantity of the action with the informed code.
- `/port`: Displays the current portfolio with the purchased shares and their values.
- `/capital`: Displays the total amount of available capital.
- `/clear`: Clears the portfolio, removing all purchased shares.
- `/multi <quantity>`: bet a certain amount of your capital on heads or tails, being able to double or lose the entire amount
- `/key`: show the current system **key**
- `/keyreset`: will open an *~~input~~* so you can create a new key and replace the previous one
- `/teste`:  run the t`rial/developer` version by adding a huge amount of capital to your account and automatically buying **100 units of all stocks**
- `/table`: display your account data in table form
- `/help`: Displays the list of available commands.


## Examples of Usage
- `/actions`: Lists the available actions.
- `/buy AAPL 10`: Buys 10 Apple shares.
- `/sell AAPL 5`: Sell 5 Apple shares.
- `/port`: Displays the current portfolio with the total value of shares.
- `/capital`: Displays the total amount of available capital.
- `/clear`: Clears the portfolio, removing all purchased shares.
- `/help`: Displays the list of available commands.

## Key
- as we can see in the current directory of the project there is a file called `Key.java` that offers the system a very interesting proposal
- this system is basically a Key generator for the **project but the key generated or manufactured by yourself will** be saved in a local database through a `.TXT` so that the key will be saved even after restarting the system
- ***key commands you can check in {COMMANDS} in the readme***

## Contribution
If you want to contribute to the project, please follow the steps below:
1. Fork the BankOni repository.
2. Create a new branch with your modification: `git checkout -b my-modification`.
3. Make the desired code changes.
4. Commit your changes: `git commit -m 'My modification'`.
5. Push to branch: `git push origin my-modification`.
6. Open a pull request on the original repository.
----

## Relases 

- **1.0** - initial version of the project
- **1.0.1**  - bug ***fixing*** and ~~deploy update~~
- **1.3** - (add -> `/clean ; /port ; /capital; /help`; commands)
bug *fixing and adding more* ~~lol~~
- **1.4** - (add + `/clear (fixed)` ; new scripts ; code organization main ***(bank.java)*** + ("bet" system with 
your capital))
- **1.4.2** - I repair the Readme Fixed bugs in redmi and added functions that were not in ***1.4***
- **1.7.9** - Add + **/test /key cmds / table commands** == bug fixes and code changes
## Contact
- [My Twitter](https://twitter.com/davvzin)
- My Discord -> `__sombra_`
