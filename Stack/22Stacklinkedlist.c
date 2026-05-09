#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
typedef struct Node {
    int data;
    struct Node* next;
} Node;
typedef struct {
    Node* top;
} Stack;
void initialize(Stack* stack) {
    stack->top = NULL;
}
bool is_empty(Stack* stack) {
    return stack->top == NULL;
}
void push(Stack* stack, int value) {
    Node* new_node = (Node*)malloc(sizeof(Node));
    if (!new_node) {
        printf("Memory allocation failed.\n");
        return;
    }
    new_node->data = value;
    new_node->next = stack->top;
    stack->top = new_node;
    printf("Pushed %d into stack.\n", value);
}
int pop(Stack* stack) {
    if (is_empty(stack)) {
        printf("Stack underflow.\n");
        return -1;
    }
    Node* temp = stack->top;
    int popped_value = temp->data;
    stack->top = temp->next;
    free(temp);
    printf("Popped %d from stack.\n", popped_value);
    return popped_value;
}
int peek(Stack* stack) {
    if (is_empty(stack)) {
        printf("Stack is empty.\n");
        return -1;
    }
    return stack->top->data;
}
void free_stack(Stack* stack) {
    while (!is_empty(stack)) {
        pop(stack);
    }
}
int main() {
    Stack stack;
    initialize(&stack);
    int n, value;
    printf("Enter number of elements to push: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("Enter value #%d: ", i + 1);
        scanf("%d", &value);
        push(&stack, value);
        printf("Top element: %d\n", peek(&stack));
    }
    printf("\nPopping all elements:\n");
    while (!is_empty(&stack)) {
        printf("Top element: %d\n", peek(&stack));
        printf("Popped element: %d\n", pop(&stack));
    }
    free_stack(&stack);  
    return 0;
}
