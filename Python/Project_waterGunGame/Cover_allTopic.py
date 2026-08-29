# =====================================
# 1. VARIABLES AND DATA TYPES
# =====================================

name = "Shree"      # String
age = 20            # Integer
height = 5.8        # Float
is_student = True   # Boolean

print(name)
print(age)
print(height)
print(is_student)


    
# =====================================
# 2. USER INPUT
# =====================================

user_name = input("Enter your name: ")
user_age = int(input("Enter your age: "))

print("Welcome", user_name)
print("Your age is", user_age)


# =====================================
# 3. OPERATORS
# =====================================

a = 10
b = 3

print("Addition =", a + b)
print("Subtraction =", a - b)
print("Multiplication =", a * b)
print("Division =", a / b)
print("Remainder =", a % b)
print("Power =", a ** b)


# =====================================
# 4. IF ELSE
# =====================================

marks = 75

if marks >= 40:
    print("Pass")
else:
    print("Fail")


# =====================================
# 5. FOR LOOP
# =====================================

for i in range(1, 6):
    print(i)


# =====================================
# 6. WHILE LOOP
# =====================================

count = 1

while count <= 5:
    print(count)
    count += 1


# =====================================
# 7. FUNCTIONS
# =====================================

def add(x, y):
    return x + y

result = add(10, 20)
print(result)


# =====================================
# 8. STRINGS
# =====================================

text = "Python"

print(text)
print(len(text))
print(text.upper())
print(text.lower())


# =====================================
# 9. LISTS
# =====================================

numbers = [10, 20, 30, 40]

numbers.append(50)

print(numbers)
print(numbers[0])
print(numbers[-1])


# =====================================
# 10. TUPLES
# =====================================

data = (1, 2, 3, 4)

print(data)
print(data[1])


# =====================================
# 11. SETS
# =====================================

my_set = {1, 2, 3, 3, 4, 5}

print(my_set)


# =====================================
# 12. DICTIONARIES
# =====================================

student = {
    "name": "Shree",
    "age": 20,
    "city": "Raipur"
}

print(student)
print(student["name"])


# =====================================
# 13. EXCEPTION HANDLING
# =====================================

try:
    num = int(input("Enter Number: "))
    print(num)
except:
    print("Invalid Input")


# =====================================
# 14. FILE HANDLING
# =====================================

file = open("demo.txt", "w")

file.write("Hello Python")

file.close()

print("File Created")


# =====================================
# 15. CLASS AND OBJECT
# =====================================

class Student:

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print("Name:", self.name)
        print("Age:", self.age)

s1 = Student("Shree", 20)

s1.display()


# =====================================
# 16. INHERITANCE
# =====================================

class Animal:

    def sound(self):
        print("Animal Sound")

class Dog(Animal):

    def bark(self):
        print("Bark Bark")

d = Dog()

d.sound()
d.bark()


# =====================================
# 17. POLYMORPHISM
# =====================================

class Cat:

    def sound(self):
        print("Meow")

class Lion:

    def sound(self):
        print("Roar")

animals = [Cat(), Lion()]

for animal in animals:
    animal.sound()


# =====================================
# 18. ENCAPSULATION
# =====================================

class Account:

    def __init__(self):
        self.__balance = 1000

    def get_balance(self):
        return self.__balance

a = Account()

print(a.get_balance())


# =====================================
# 19. ABSTRACTION
# =====================================

from abc import ABC, abstractmethod

class Vehicle(ABC):

    @abstractmethod
    def start(self):
        pass

class Car(Vehicle):

    def start(self):
        print("Car Started")

c = Car()

c.start()