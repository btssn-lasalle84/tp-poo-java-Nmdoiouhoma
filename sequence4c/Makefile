SRC=./src
DEST=./src
TARGET=ExempleFigures

all: $(TARGET)

$(TARGET): $(DEST)/$(TARGET).class
	@java -classpath $(DEST) $(TARGET)

$(DEST)/$(TARGET).class: $(SRC)/$(TARGET).java
	javac -classpath $(SRC) -d $(DEST) $(SRC)/$(TARGET).java

clean:
	rm -f $(DEST)/*.class $(SRC)/*~
