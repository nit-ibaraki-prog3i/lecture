
class TodoMain1 {

    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setYear(2019);
        d1.setMonth(10);
        d1.setDay(31);
        d1.show();

        Todo t1 = new Todo();
        t1.setName("Prepare Halloween");
        t1.setPriority(1);
        t1.setDate(d1);
        t1.show();
        
        TodoList l1 = new TodoList();
        l1.addTodo(t1);
        Todo t2 = new Todo();
        l1.addTodo(t2);
        l1.show();
    }
}
