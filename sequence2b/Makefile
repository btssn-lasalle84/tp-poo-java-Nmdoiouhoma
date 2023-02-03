SRC=./src
SRC=./src
TARGET=TableauCarre

all: $(TARGET)

$(TARGET): $(SRC)/$(TARGET).class
	@java -classpath $(SRC) $(TARGET)

$(SRC)/$(TARGET).class: $(SRC)/$(TARGET).java
	javac -d $(SRC) $(SRC)/$(TARGET).java

clean:
	rm -f $(SRC)/*.class $(SRC)/*~
