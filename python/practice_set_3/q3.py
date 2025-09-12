user_name=input("Enter your name :")
count=0
for i in range(0,len(user_name)):
    if(user_name[i]==' '):
        count+=1
        if(count==2):
            print("double Space detected")
    else:
        count=0
          
    
