'''
1 for  snake 
-1 for water 
0 for gun

'''
computer =  -1
youstr = (input("Enter the choice :"))
youDict ={
    "s":1,
    "w":-1,
    "g":0
}
you = youDict[youstr]
if(computer == -1 and you==1):
    print("you win the game")

elif(computer ==-1 and you==0):
    print(" you lose the game !")

elif(computer ==1 and you==-1):
    print(" you lose the game !")

elif(computer ==1 and you==0):
    print(" you win the game !")

elif(computer ==0 and you==-1):
    print(" you win the game !")

elif(computer ==0 and you==-1):
    print(" you lose the game !")

else:
    print("something getting wrong")
