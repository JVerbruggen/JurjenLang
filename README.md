# pyANTLR_project

To execute, follow the following steps
1. Install ANTLR on your OS
2. Install the `antlr4-python3-runtime` package for python
3. `py project.py .\text.txt`

The repository includes a java folder, which is exclusively used for the antlr4 testrig. I wont be implementing any listeners there.

## Making changes

If you made changes to the language or anything else, and the python files (and java classes for testrig) have to be regenerated, use the following steps:
1. Make sure you are in the root folder of the repository
2. `start .\generate.bat` should renew all files

## Testrig

To use the antlr4 testrig, use the following tutorial:
1. Navigate to the java/ file `cd java`
2. `start .\testrig.bat` should open a command window and eventually open up the testrig
