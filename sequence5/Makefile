JAVA         = java
JAVAC        = javac
JAR          = jar

MPACKAGE 	 = figures
MSRCPATH     = ./src/$(MPACKAGE)
MBUILDPATH   = ./build
MCLASSPATH   = $(MBUILDPATH)

SRCFILES	:= $(wildcard $(MSRCPATH)/*.java)
CLASSFILES	:= $(patsubst $(MSRCPATH)/%.java, $(MBUILDPATH)/$(MPACKAGE)/%.class, $(SRCFILES))

.PHONY: clean

all: $(CLASSFILES)

$(CLASSFILES): $(SRCFILES)
	$(JAVAC) -d $(MBUILDPATH) -sourcepath $(MSRCPATH) -classpath $(MCLASSPATH) $^

jar: $(CLASSFILES)
	(cd $(MBUILDPATH) && $(JAR) cvmf ../manifest ./$(MPACKAGE).jar $(MPACKAGE)/*.class)

ExempleFigures: $(CLASSFILES)
	(cd $(MBUILDPATH) && $(JAVA) -classpath . $(MPACKAGE).ExempleFigures)

clean:
	rm -f $(CLASSFILES) *~

cleanall:
	rm -f $(MBUILDPATH)/$(MPACKAGE).jar $(CLASSFILES) *~
