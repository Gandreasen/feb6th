import urllib

def read_text():
    quotes = open('C:/Users/tech/Documents/CSP/light.txt')
    contents = quotes.read()
    #print (contents)
    quotes.close()
    check_profanity(contents)

def check_profanity(text_to_check):
    connection = urllib.urlopen("http://www.wdylike.appspot.com/?q=" + text_to_check )
    output = connection.read()
    #print(output)
    connection.close()
    if "true" in output:
        print ("Profanity Alert!")
    elif "false" in output:
        print ("Clean!")
    else:
        print ("Could not scan the document properly.")

read_text()