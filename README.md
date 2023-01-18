# Theatre Manager

In this project, you'll design an application that facilitates managing a movie theatre, including the ability to sell tickets, check for available seats, view sales data, and more.

# Stage 1

## Objectives

Due to limited space in our new cinema theatre, you need to consider the seating capacity. The room has a capacity of 7 rows with 8 seats in each row. Your task is to assist them in visualizing the seating arrangement by printing a scheme to the console. 

Your output should resemble the example provided and should consist of 9 lines.

## Example

```
Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S
```

# Stage 2

## Objectives

In this stage, your task is to gather input for the number of rows and seats in each row. The cost of each ticket will be determined by the following rules:

- If the total number of seats in the room is 60 or less, the price for each ticket will be $10.
- If the total number of seats in the room is greater than 60, the tickets in the front half of the rows will be $10 and the tickets in the back half of the rows will be $8. If the number of rows is odd, the first half will include the first half of the rows and the second half will include the remaining rows.

Based on the input, calculate the profit from the sold tickets and print the result as shown in the examples. The program should then end. It's important to note that the number of rows and seats will not exceed 9.

## Examples

The greater-than symbol followed by a space (`>` ) represents the user input. Note that it's not part of the input.

**Example 1**

```
Enter the number of rows:
> 4
Enter the number of seats in each row:
> 5
Total income:
$200
```

**Example 2**

```
Enter the number of rows:
> 8
Enter the number of seats in each row:
> 9
Total income:
$648
```

**Example 3**

```
Enter the number of rows:
> 9
Enter the number of seats in each row:
> 7
Total income:
$560
```

# Stage 3

## Objectives

The program should take in two positive integers as input representing the number of rows and seats in each row. It should then display the seating arrangement as shown in the example. Next, the program should take in two additional integers as input representing the row number and seat number of the chosen seat. The price of the ticket is determined by the following rules: 

- If the total number of seats in the room is 60 or fewer, the price of each ticket is $10.
- For larger rooms, tickets for the front half of the rows cost $10 and those for the back half cost $8.

The program should then display the seating arrangement again with the chosen seat marked as `B` and display the ticket price. Keep in mind that the number of rows and seats will not exceed 9.

## Examples

The greater-than symbol followed by a space (`>` ) represents the user input. Note that it's not part of the input.

**Example 1**

```
Enter the number of rows:
> 7
Enter the number of seats in each row:
> 8

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

Enter a row number:
> 3
Enter a seat number in that row:
> 6

Ticket price: $10

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S B S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S
```

**Example 2**

```
Enter the number of rows:
> 8
Enter the number of seats in each row:
> 9

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S S S S S S
7 S S S S S S S S S
8 S S S S S S S S S

Enter a row number:
> 6
Enter a seat number in that row:
> 5

Ticket price: $8

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S B S S S S
7 S S S S S S S S S
8 S S S S S S S S S
```

# Stage 4

## Objectives

Initially, your program should input and store two positive integers, representing the number of rows and the number of seats per row. Following that, the program should display a menu containing the following three options:

- `Show the seats` should display the current seating arrangement, indicating empty seats with an `S` symbol and occupied seats with a `B` symbol.
- `Buy a ticket` should take in the coordinates of a seat from the input and print the corresponding ticket price. Additionally, once a seat is chosen, it should be designated with a `B` when the function to display the seats is called.
- `Exit` should stop the program.

## Example

The greater-than symbol followed by a space (`>` ) represents the user input. Note that it's not part of the input.

```
Enter the number of rows:
> 7
Enter the number of seats in each row:
> 7

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S S S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 2

Enter a row number:
> 4
Enter a seat number in that row:
> 5
Ticket price: $10

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S B S S
5 S S S S S S S
6 S S S S S S S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 2

Enter a row number:
> 6
Enter a seat number in that row:
> 6
Ticket price: $10

1. Show the seats
2. Buy a ticket
0. Exit
> 1

Cinema:
  1 2 3 4 5 6 7
1 S S S S S S S
2 S S S S S S S
3 S S S S S S S
4 S S S S B S S
5 S S S S S S S
6 S S S S S B S
7 S S S S S S S

1. Show the seats
2. Buy a ticket
0. Exit
> 0
```

# Stage 5

## Objectives

Now your menu should look like this:

```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```

When the option `Statistics` is selected, the program should display the following details:

- The total number of tickets sold;
- The proportion of tickets sold, rounded to 2 decimal places, as a percentage;
- The current revenue;
- The projected income, if all the tickets are sold.

The remaining menu options should function as they did previously, but the `Buy a Ticket` option should not permit the purchase of a seat that has already been sold. 

If a user selects a seat that has already been purchased, the program should display the message `That ticket has already been purchased!` and prompt the user to enter different seat coordinates until an available seat is chosen. Additionally, the program should not accept coordinates that are outside of the designated seat boundaries, and if this occurs, it should display the message `Wrong input!` and prompt the user to enter different seat coordinates until a valid option is selected.

## Examples

The greater-than symbol followed by a space (`>` ) represents the user input. Note that it's not part of the input.
