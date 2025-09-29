# name = "amit"
# age = 22
# name = "sahami"
# age = 23.0
# is_adult = True
# print("HELLO World!")
# print("name")
# print(name)
# print(age)

# USER INPUT

# name = input("what is your name\n")
# print(name)
# print("hello" + name)  #concetination


# TYPE CONVERSION

# old_age = input("enter you old age\n")
# new_age = old_age + 2       #concetination
# print(new_age)

# old_age = input("enter you old age\n")
# new_age = int(old_age) + 2
# print(new_age)


#  SUM OF NUMBER

# first = input("enter first number")
# second = input("enter second number")
# sum = first + second     #concetination       
# print(sum)

# first = input("enter first number\n")
# second = input("enter second number\n")
# sum = int(first) + int(second)
# print("SUM IS :" + str(sum))


# STRING

# name = "sahami"
# print(name.upper())
# print(name.lower())
# print(name.find("h"))
# print(name.replace("sahami","amit"))
# print(name.replace("ami","amit"))



#CHECK SUBSTRING EXIST OR NOT

# name = "Tony Stark"
# print("T" in name)
# print("m" in name)


# ARITHMETIC OPERATOR

# print(5+2)
# print(5-2)
# print(5*2)
# print(5/2)
# print(5//2)  # it cannot show decimal part in division
# print(5%2)
# print(5**2)   # power operator
# i = 5
# i = i+2
# i+=2
# print(i)
# result = 2+3*5
# print(result) 


# COMPARISION OPERATOR

# print(3<2)
# print(3>2)
# print(3==2)
# print(3<=2)
# print(3>=2)
# print(3!=2)


# LOGICAL OPERATOR

# print(2<3 or 2<1)
# print(3>2 and 1<2)
# print(not 3>2)



# CONDITION STATEMENT

# age = 6
# if age >=18:
#     print("you are adult")
#     print("you can vote")
# elif age < 18 and age >3:
#     print("you are in school")
# else:
#     print("you are child")    
# print("thankyou")


# CALCULATOR

# first = input("enter first number/n :")
# operator = input("enter operator (+,-,*,/,%)\n :")
# second = input("enter second number/n :")
# first = int(first)
# second = int(second)
# if operator == "+":
#     print(first + second)
# elif operator == "-":
#     print(first - second)
# elif operator == "*":
#     print(first * second)
# elif operator == "/":
#     print(first / second)
# elif operator == "%":
#     print(first % second)
# else:
#     print("invalid operation ")
    

# RANGE

# number = range(5)
# print(number)


# LOOP(while loop)

# i = 1
# while i<=5:
#     print(i)
#     i = i + 1

# j = 1
# while j<=5:
#     print(j * "*")
#     j = j + 1

# k = 5
# while k>=0:
#     print(k * "*")
#     k = k - 1

# # (for loop)
# for item in range(5):
#     print(item + 1)


# LIST

# marks = [95,98,97]
# print(marks)
# print(marks[0])
# print(marks[1])
# print(marks[-1])
# print(marks[-3])
# print(marks[0:2])
# print(marks[1:3])
# for score in marks:
#     print(score)

# marks.append(99)
# print(marks)

# marks.insert(0,92)
# print(marks)

# print(99 in marks)
# print(93 in marks)

# print(len(marks))

# i = 0
# while i < len(marks):
#     print(marks[i])
#     i = i+1

# marks.clear()
# print(marks)


# BREAK AND CONTINUE

# student = ["ram", "syam", "kishan", "radha", "radhika"]
# # for student in student:
# #     if student == "radha":
# #         break
# #     print(student)

# for student in student:
#     if student == "kishan":
#         continue
#     print(student)



# TUPLE

# marks = (95,98,97)
# print (marks)
# Marks =  (95,98,97,97,97)
# print(Marks.count(97))
# print(Marks.index(98))

#SET

# marks = {95,97,98,97,}
# print(marks)   # In set there are no index exist
# for score in marks:
#     print(score)



#DICTIONARY

# marks = {"english":95, "chemistry":98, "physics": 97}
# print(marks["chemistry"])
# marks["physics"] = 99
# print(marks)



#FUNCTION

# 1.in -built function
# 2.module function

# 3.user define function
def print_sum(first , second , third = 3):
    print(first + second + third)

print_sum(1,2)    