# JurjenLang
### An interpreted programming language

<br>
<br>

To execute, follow the following steps
1. `git clone https://github.com/JVerbruggen/JurjenLang.git`
2. `py -m pip install antlr4-python3-runtime`
3. `start input.bat` or `py project.py .\input.jur`

The repository includes a java folder, which is exclusively used for the antlr4 testrig. I wont be implementing any logic there.

## Making changes

If you made changes to the language or anything else, and the python files (and java classes for testrig) have to be regenerated, use the following steps:
1. Make sure you are in the root folder of the repository
2. Install ANTLR4 on windows
3. `start .\generate_python.bat` should renew all files

## Testrig

To use the antlr4 testrig (which generates a parse tree), use the following tutorial:
1. Renew java files `start .\generate_java.bat`
2. Navigate to the java/ file `cd java`
3. `start .\testrig.bat` should open a command window and eventually open up the testrig

## Language Specifications

### Declare a variable
```
somevariable = 3
another = .2f
thirdvar = "some random text"
fourthboolean = true
```
Currently, only four types are allowed; integer, float, string and boolean. Why would you ever wawnt more? ...Right?

### Define a function
```
func myfunction a b{
  return a + b
}

result = myfunction(1,2)    # will be 3
```
In JurjenLang, variables have no type definition or hinting. This can either make your life easy or difficult, depending on who you ask. Either way, I don't really care.

### Expressions
```
a = 2
b = 3

thisbooleanwillbefalse = a == b
thisbooleanwillbetrue = a != b
thisonewillalsobetrue = a < b
```
JurjenLang supports a couple of expression operators; <, <=, >, >=, ==, !=

### Boolean expressions
```
thiswillbetrue = true and true
thiswillbetrue = true or false
thiswillbefalse = not true
```
JurjenLang supports three bollean expressions; and, or, not

### Numerical operators
```
a = 3 * 4     # multiplication
b = 12 / 3    # division
c = 5!        # factorial
d = 5 + 4 - 1 # addition and subtraction
e = 2^6       # pow
```
JurjenLang supports the numerical operators that can be seen above.

### Output
```
print "i like to print stuff"
print 3*2
```
In JurjenLang you can print all variables.

**Dangerous feature that I won't remove because its kind of useful but also the reason why this language should never be used in production**
```
printscope
```
In JurjenLang you can print all variables on the scope with the `printscope` keyword 

### String multiplication (useless but fun feature)
```
mystring = "wohoo"*2
reversed = mystring*-2

print mystring          # Will be "wohoowohoo"
print reversed          # Will be "oohowoohowoohowoohow"
```
In JurjenLang you can multiply strings by an integer, both positive and negative.
