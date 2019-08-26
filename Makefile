# Hash function program makefile
# Yaseen Hull
# 09 May 2017



SRCDIR = src
BIN = bin
DOC = doc

JAVAC = javac
JAVAFLAGS = -g -d $(BIN) -cp $(BIN) 

.SUFFIXES: .java .class

vpath %.java $(SRCDIR)
vpath %.class $(BIN)

.java.class:
	$(JAVAC) $(JAVAFLAGS) $<

all: hashFunction.class Main.class Entropy.class

doc: $(BIN)
	javadoc -version -aurthor -d $(SRCDIR) $(DOC)     

run: $(BIN)
	java Main -d $(BIN) 
	     
clean:
	-d $(BIN) rm*.class
