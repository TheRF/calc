JC=javac
CFLAGS=-Xlint:all -Xprefer:source -Xdiags:verbose
AFLAGS=cevf
SE=.java
CE=.class
ARCHIVE=jar
AE=.${ARCHIVE}
MAIN=CalcMain

all:
	${JC} ${CFLAGS} ${MAIN}${SE}

edit:
	${JC} ${CFLAGS} CalcDisplayField${SE}

button:
	${JC} ${CFLAGS} CalcButton${SE}

parser:
	${JC} ${CFLAGS} Parser${SE}

controller:
	${JC} ${CFLAGS} CalcController${SE}

clean:
	rm *${CE}
	rm *${AE}

jar: all
	${ARCHIVE} ${AFLAGS} ${MAIN} calculator${AE} *${CE}