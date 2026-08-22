def factorail(n):
    if(n==1 or n==0):
        return 1
    return n*factorail(n-1)
n = int(input("ente2r the number :"))
print(f"the factorial of the number is : {factorail(n)}")