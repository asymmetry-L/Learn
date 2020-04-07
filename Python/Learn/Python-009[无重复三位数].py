#!/usr/bin/env python
#_*_ conding:utf-8 -*-

# 1. 有1,2,3,4四个数字,能组成多少互不相同且无重复数字的三位数,都是多少?
a = [1,2,3,4]
b = 0
for i in a:
    for j in a:
        for k in a:
            if i != j and j != k and i != k:
                sum = i * 100 + j * 10 + k
                print(sum)
                b += 1
print(f'共有{b}个互不相同且无重复数字的三位数')