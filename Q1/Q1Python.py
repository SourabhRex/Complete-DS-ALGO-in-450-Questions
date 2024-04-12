import numpy as np

n= int(input("Enter no. of terms: "))
l=[]
for i in range(n):
    l.append(int(input("Enter n numbers: ")))



arr=np.array(l)
print("Before reverse: ",arr)

print("After Reverse: ",arr[::-1])

ex=input("Enter any key to exit!")