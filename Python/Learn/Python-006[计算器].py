a = '7 - 8 - 9 - + '
b = '4 - 5 - 6 - - '
c = '1 - 2 - 3 - * '
d = '. - 0 - = - / '
print(a + '\n' + b + '\n' + c + '\n' + d + '\n')
cal = input()
l = len(cal)
count = 0
while count < l:
    flag = cal[count].isdigit()
    print(cal[count], flag)
    count = count + 1