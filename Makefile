JC=javac
CFLAGS=-Xlint:all -Xprefer:source -Xdiags:verbose
SE=.java

all:
	${JC} ${CFLAGS} CalcMain${SE}

edit:
	${JC} ${CFLAGS} CalcDisplayField${SE}

button:
	${JC} ${CFLAGS} CalcButton${SE}

parser:
	${JC} ${CFLAGS} parser${SE}

controller:
	${JC} ${CFLAGS} CalcController${SE}
