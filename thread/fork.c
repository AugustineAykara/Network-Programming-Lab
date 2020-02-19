#include<stdio.h>
#include<unistd.h>	//In unix OS the interface is defined by unistd.h

void main() {
	int id;		//varialble declaration
	printf(" Before the creation of child process \n");
	id = fork();	
	if(id > 0) {
		printf(" Parent Process \n");
		printf(" Parent Process ID = %d \n", getpid());
	}
	else if(id == 0) {
		printf(" Child Process \n");
		printf(" Child Process ID = %d \n Parent Process ID = %d \n", getpid(), getppid());
	}
	else {
		printf(" \n Child Process Creation unsuccessfull ");
	}			
}
