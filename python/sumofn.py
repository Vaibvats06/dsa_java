n=int(input("Enter a nth number : "))
def nthNumber(n):
    if(n==1):
       return 1
    return n+nthNumber(n-1)
a=nthNumber(n)
print(f"hello{n}")