#!/usr/bin/env python
#_*_ conding:utf-8 -*-

import socket

sk = socket.socket()
sk.bind(("192.168.1.224",9000))
sk.listen()
print("+"*20)
conn,addr = sk.accept()
msg = conn.recv(1024)
text = ''
while True:
    print(msg.decode('utf-8'))
    text = input('YOU:')
    if text == 'exit':
        conn.close()
    conn.send(text.encode('utf-8'))
sk.close()