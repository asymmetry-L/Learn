#!/usr/bin/env python
# -*- encoding: utf-8 -*-

# 将IP 192.168.12.79 转换为八位二进制，并拼接起来构成一个新的二进制数，再将其转换为十进制

ip = '192.168.12.79'
ip_list = ip.split('.')
new_num = ''
for item in ip_list:
    item = bin(int(item))
    item = item.replace('0b','')
    while len(item) < 8:
        item = '0' + item
    new_num += item
result = int(new_num,2)
print(result)