temp=int(input("Enter Temperature in degree celsius: "))
def convertToFahrenheit():
    Fahrenheit=((temp * 9/5) + 32)
    return Fahrenheit
a=convertToFahrenheit()
print(a)