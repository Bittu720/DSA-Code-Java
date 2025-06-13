#include<stdio.h>
#include<stdbool.h>
#define MAX_SIZE 100
typedef struct{
    int arr[MAX_SIZE];
    int top;
}
Stack;
void initialize(Stack *stack){
stack->top=-1;
}
bool Empty(Stack *stack){
    return stack->top==-1;
}
bool Full(Stack *stack){
    return stack->top==MAX_SIZE-1;
}
void push(Stack *stack,int value){
    if(Full(stack)){
        printf("Stack overflow.");
    }
    stack->arr[++stack->top]=value;
    printf("pushed %d into satck.",value);
}
int pop(Stack *stack){
    if(Empty(stack)){
        printf("Stack underflow.");
    }
    int popped=stack->arr[stack->top];
    stack->top--;
    printf("popped %d from satck.",popped);
    return popped;
}
int peek(Stack *stack){
    if(Empty(stack)){
        printf("stack is empty.");
        return -1;
    }
    return stack->arr[stack->top];
}
int main(){
    Stack stack;
    initialize(&stack);
    push(&stack,3);
    printf("top element : %d\n",peek(&stack));
     push(&stack,5);
    printf("top element : %d\n",peek(&stack));
push(&stack,8);
    printf("top element : %d\n",peek(&stack));
    push(&stack,7);
    printf("top element : %d\n",peek(&stack));
    push(&stack,10);
    printf("top element : %d\n",peek(&stack));
    while(!Empty(&stack)){
        printf("top element : %d\n",peek(&stack));
        printf("popped element :%d\n",pop(&stack));
    }
    return 0;
}
