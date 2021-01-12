#!/usr/bin/env python
#_*_ conding:utf-8 -*-

import socket

sk = socket.socket()
sk.bind(("127.0.0.1",9000))
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