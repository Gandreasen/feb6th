

import random 

ttroops = 0
etroops = 0
b = 0
count = 0
    
def start():
        print"Congratulations on your promotion to general.  Great timing since the Martians are attacking"
        atroop = raw_input("Shall we see how many troops we can round up?  ")
        atroop = atroop.lower()
        
        if "y" in atroop:
            print "Very good.  I do have some questions while we wait for your troop count to come in."
            garbage = raw_input("Tell me something about yourself. ")
            print "Wow, isn't that special."  
            age = raw_input("How old are you? ")
            #age = int(age)
            #print 'Your ' + age + 'old.'
            retire = raw_input("How old is your oldest parent? ")
            #retire = int(retire)*500
            address = raw_input("What is your home address number? ")
            #address = int(address)

            global b
            a = random.choice([age, retire, address])
            a = int(a)
            a = a * 20
            b = random.choice([age, retire, address])
            b = int(b)
            b = b *500
            
            
            ftroops = random.randint(a, b)
            print ftroops 
            global ttroops
            ttroops= (ftroops)
            print ("Thank you.  Your troop numbers are in.  You have " + str(ftroops) +" total troops.")
            #ttroops = ftroops            
            wave1()

   
    

def wave1():
    global ttroops
    print ttroops
    global count
    count + 1 
    global b
    b = (b *150)
    print (str(b) + " enemy troops have arrived to take over the world")
    print "You must save us all.  Be careful when you deploy troops."
    print "If you send too many, they could be ambushed by a smaller group and destroy a large amount of troops"
    print "If you send too few, they could just be overwhelmed."
    print "May you find the right balance and the balance be forever in your favor."
    deploy1 = raw_input("How many troops do you wish to deploy?")
    deploy1 = int(deploy1)
    #ttroops = ttroops - deploy1 

    b = int(b)
    x = random.randint(5,b) 
    x = x/8
   
    if (deploy1*150) >x:
        eng = random.randint(1,deploy1)
         
        eng = str(eng)
        print ("Nice job but not everyone came back.  " + eng + " troops made it back." ) 
        
        ttroops = int(ttroops)
        eng = int(eng)

        b = int(b)
        global etroops
        etroops = b-x       
        etroops = str(etroops)

        deploy1 = int(deploy1)
        ttroops = ttroops - deploy1 + eng
        
        print (str(ttroops) + " troops left")
        print (str(etroops) + " enemy troops left. ")
        check()
        
    else:
        print "Wipe out"
        deploy1 - int(deploy1)
        ttroops = ttroops - deploy1
        print (str(ttroops) + " troops left")
        check()


def check():
    global etroops
    if etroops < 1:
        print "You won!"
    else:
        end()

def end():
    global ttroops
    if ttroops <1:
        print "You let mankind down.  We thought you would save us, but we were wrong."
    else:
        wave2()
    



def wave2():
    global ttroops
    print ttroops
    global etroops
    global count
    count + 1 
    global b
    deploy1 = raw_input("How many troops do you wish to deploy?")
    deploy1 = int(deploy1)
    #ttroops = ttroops - deploy1 

    b = int(b)
    x = random.randint(1,b) 
    x = x/8
   
    if (deploy1*150) >x:
        eng = random.randint(1,deploy1)
         
        eng = str(eng)
        print ("Nice job but not everyone came back.  " + eng + " troops made it back." ) 
        
        ttroops = int(ttroops)
        eng = int(eng)

        b = int(b)
        #global etroops
        x = int(x)
        etroops = b-x       
        etroops = str(etroops)

        deploy1 = int(deploy1)
        ttroops = ttroops - deploy1 + eng
        
        print (str(ttroops) + " troops left")
        print (str(etroops) + " enemy troops left. ")
        check()
        
    else:
        print "Wipe out"
        deploy1 - int(deploy1)
        ttroops = ttroops - deploy1
        print (str(ttroops) + " troops left")
        check()







start()