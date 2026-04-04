import copy
print ("\033c\033[40;37m\n")

ss="""8086 x86
80186 x86
80286 x86
80386 x86
80486 x86
arm7 arm
arm8 arm1"""

def uppers(s):
    ss=""
    for a in s:
         if ord(a)<=ord('z') and ord(a)>=ord('a'):
             aa=ord(a)-32
             ss=ss+chr(aa)
         else:
             ss=ss+a
         
    return ss
l=uppers(ss)
print(l)