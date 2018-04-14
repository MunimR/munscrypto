#!/usr/bin/env python3

def xor(c, n):
    return chr(ord())

def xor_encrypt(m, k, hi, ho):
    return 0

hexIn = input("input as hex? (y/n): ")
plain = input("enter plain-text: ")
pattern = input("enter key: ")
hexOut = input("output as hex? (y/n): ")

if (hexOut.lower() == "y"):
    hexOut = True
else:
    hexOut = False

if (hexIn.lower() == "y"):
    hexIn = True
else:
    hexIn = False

print("encrypted text: " + str(xor_encrypt(plain, pattern, hexIn, hexOut)))
