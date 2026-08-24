number=int(input("enter day(1-366):\n"))


# Keep asking until the user enters a valid day number.
while number>366 or number<1:
    number=int(input("invalid day,enter again:\n"))


# The first 6 months of the Persian calendar have 31 days each.
if number<=6*31:
    day= number%31

    # If the remainder is 0, the day is the last day of the month.
    if day==0:
        day=31
    print(day)


# Months 7 through 11 have 30 days each.
elif number>6*31 and number<=6*31+150:
    day=(number-6*31)%30

    # If the remainder is 0, the day is the 30th day of the month.
    if day==0:
            day=30
    print(day)

# Any remaining valid day belongs to the 12th month.
else:
    day=number-(6*31+150)
    print(day)