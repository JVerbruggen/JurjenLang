# JurjenLang

To execute, follow the following steps
1. `py -m pip install antlr4-python3-runtime`
2. `py project.py .\input.jur`

The repository includes a java folder, which is exclusively used for the antlr4 testrig. I wont be implementing any listeners there.

## Making changes

If you made changes to the language or anything else, and the python files (and java classes for testrig) have to be regenerated, use the following steps:
1. Make sure you are in the root folder of the repository
2. Install ANTLR4 on windows
3. `start .\generate_python.bat` should renew all files

## Testrig

To use the antlr4 testrig, use the following tutorial:
1. Navigate to the java/ file `cd java`
2. `start .\testrig.bat` should open a command window and eventually open up the testrig
