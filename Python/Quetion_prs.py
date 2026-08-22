a = int(input ("Enter the value :"))
i =1
sum =0
while(i<=a):
    sum += i
    i+=1
print(sum)
product =1
for i in range(1,a+1):
    product = product*i

print(f"the factorial of{a} is {product}")
