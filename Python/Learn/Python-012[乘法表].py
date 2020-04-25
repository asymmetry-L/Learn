n = 1
for i in range(0, 10):
    for j in range(1, n):
        print('%s * %s = %s     ' % (j, i, i*j),end='')
    n += 1
    print('\n')