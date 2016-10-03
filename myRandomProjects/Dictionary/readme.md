#Instructions on how to execute ListPossibleWords.java on a windows based machine. 

In order to run this program you must have java installed. To check whether you have java installed, do the following steps 
* Open Command Prompt. 
* Type Java - version 
* Hit enter and you should see something like.
```
    C:\Users\username>java -version
    java version "1.6.0_27"
    Java(TM) 2 Runtime Environment, Standard Edition (build 1.6.0_27-b07)
    Java HotSpot(TM) Client VM (build 1.6.0_27-b13, mixed mode, sharing)
```
* Open zip file and copy the path of the file, for example if zip file is extracted on desktop the path to the file should be C:\Users\username\Desktop\Dictionary\src
* Change the Command prompt directory by typing cd and pasting the path to the file. 
```
    C:\Users\username> cd C:\Users\username\Desktop\Dictionary\src
```
* Assuming that file ListPossibleWords.Java is in current directory, type javac ListPossibleWords.java to compile it.
```
    C:\Users\username\Desktop\Dictionary\src> Javac ListPossibleWords.java
```
* If everything went well, you shouldn’t see any errors. 
* Type java command to run the program.
```
    C:\Users\username\Desktop\Dictionary\src> java ListPossibleWords.java
```
* You should see program being executed. Follow the prompt on the command line and type seven letters without any spaces. This program treats spaces as wild card. 
* In order to provide custom dictionary, either change the path to the file in the code to the file in your local computer or simply change replace it with dictionary.txt file. 