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

To use the antlr4 testrig, use the following tutorial:
1. Renew java files `start .\generate_java.bat`
2. Navigate to the java/ file `cd java`
3. `start .\testrig.bat` should open a command window and eventually open up the testrig
