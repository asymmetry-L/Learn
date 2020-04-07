num = 1
count = 0
while num <= 100:
    val = num % 2
    if val == 1:
        count = count + num
    else:
        count = count - num
    num = num + 1
print(count)