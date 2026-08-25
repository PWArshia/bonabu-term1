number=int(input("enter day:\n"))

while number < 1 or number > 366:
    number = int(input("Invalid day, enter again:\n"))


# The first 6 months of the Persian calendar have 31 days each.   
if number<=6*31:
    month=number//31
    if number%31!=0:
        month+=1
    print(month)
    
# Months 7 through 11 have 30 days each.
elif number>6*31 and number<=6*31 +150:
    month=6+ (number - 6 * 31) // 30
    if (number-6*31)%30 !=0:
        month+=1
    print(month)

# Any remaining valid day belongs to month 12.
else:
    print(12)
    
