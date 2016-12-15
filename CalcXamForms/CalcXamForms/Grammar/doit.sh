#!/bin/bash
echo building grammar files.
#java -cp '.;h:\Downloads\antlr-4.5.3-complete.jar' org.antlr.v4.Tool -Dlanguage=CSharp -visitor CSharp4.g4
#java -cp '.;h:\Downloads\antlr-4.5.3-complete.jar' org.antlr.v4.Tool -Dlanguage=CSharp CSharp4Lexer.g4

for i in antlr-4.5.3-complete.jar; do
echo i is $i

rm -rf *.tokens

java -cp ".;h:\\Downloads\\$i" org.antlr.v4.Tool -Dlanguage=CSharp -visitor calculator.g4
java -cp ".;h:\\Downloads\\$i" org.antlr.v4.Tool -visitor calculator.g4

/cygdrive/c/Program\ Files/Java/jdk1.8.0_102/bin/javac.exe -cp ".;h:\\Downloads\\$i" *.java
java -cp ".;h:\\Downloads\\$i" Test
echo ""
exit

done


