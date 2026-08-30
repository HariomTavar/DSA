import random 
n = random.randint(1,100)
a = -1
gueasses = 0
while(a != n):
    gueasses +=1
    a = int(input("Guess the number : "))
    if(a>n):
        print("lower number !")
    elif(a<n):
    
        print("higher number !")
    else:
        print("Correct!")

print(f"you have to guess the number correctly in {gueasses} attempt")