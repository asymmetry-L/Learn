#!/usr/bin/env python
# -*- encoding: utf-8 -*-

# Here put the improt lib

def over(func):
    def bar(*args):
        re = func(*args)
        print('run over!')
        return re
    return bar

@over
def add(x, y):
    return x + y

a = 1000
b = 9999

print(add(a,b))
