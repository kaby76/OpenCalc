#!/bin/bash
echo building grammar files.
#java -cp '.;h:\Downloads\antlr-4.5.3-complete.jar' org.antlr.v4.Tool -Dlanguage=CSharp -visitor CSharp4.g4
#java -cp '.;h:\Downloads\antlr-4.5.3-complete.jar' org.antlr.v4.Tool -Dlanguage=CSharp CSharp4Lexer.g4

java -cp '.;h:\Downloads\antlr-4.5.3-complete.jar' org.antlr.v4.Tool -Dlanguage=CSharp -visitor calculator.g4
