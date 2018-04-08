#!/usr/bin/env python3

def addToChar(c, n):
	i = ord(c)
	if c.islower():
		return chr(97 + ((i - 97 + n) % 26))
	elif c.isupper():
		return chr(65 + ((i - 65 + n) % 26))
	return c

def caesar_shift(s, n):
	result = ""
	for c in s:
		result += addToChar(c, n)
	return result

raw = input("enter plain-text: ")
n = int(input("enter offset (1 - 25): ")) % 26

print("encrypted text: " + caesar_shift(raw, n))