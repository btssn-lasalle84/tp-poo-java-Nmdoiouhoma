SRC=./src
TARGET=Palyndrome

all: $(TARGET)

$(TARGET): $(SRC)/$(TARGET).class
	@java -classpath $(SRC) $(TARGET)

$(SRC)/$(TARGET).class: $(SRC)/$(TARGET).java
	javac -d $(SRC) --source-path $(SRC) $(SRC)/$(TARGET).java

clean:
	rm -f $(SRC)/*.class $(SRC)/*~
