n=int(input("Enter a number : "))
def factorial(n):
    if(n==1):
        return 1
    return n*factorial(n-1)
a=factorial(n)
print(a)