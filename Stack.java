class Stack<T> {
    // Внутренний класс для хранения элементов стека
    private class Node<T> {
        T data;  // данные узла
        Node<T> next;  // указатель на следующий элемент стека
  
        Node(T data) {
            this.data = data;
        }
    }
  
    private Node<T> top;  // верхний элемент стека
  
    // Конструктор
    Stack() {
        top = null;
    }
  
    // Добавление элемента в стек
    void push(T item) {
        Node<T> node = new Node<>(item);
        node.next = top;
        top = node;
    }
  
    // Удаление верхнего элемента стека
    T pop() {
        if (top == null) {
            throw new IllegalStateException("Стек пуст.");
        }
        T item = top.data;
        top = top.next;
        return item;
    }
  
    // Просмотр верхнего элемента стека
    T peek() {
        if (top == null) {
            throw new IllegalStateException("Стек пуст.");
        }
        return top.data;
    }
  
    // Проверка стека на пустоту
    boolean isEmpty() {
        return top == null;
    }
}
