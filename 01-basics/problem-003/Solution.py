# Get the amount of money from the user
money = int(input("Enter value:\n"))

# Calculate the number of 50-value bills
count_50 = money // 50
money %= 50  

# Calculate the number of 10-value bills
count_10 = money // 10
money %= 10  

# Calculate the number of 5-value bills
count_5 = money // 5
money %= 5  

# The remaining money is represented by 1-value bills
count_1 = money


print(
    f"We have {count_50} of 50, "
    f"{count_10} of 10, "
    f"{count_5} of 5, "
    f"and {count_1} of 1."
)