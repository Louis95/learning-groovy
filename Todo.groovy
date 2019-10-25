
public class Todo {
    String name
    String note

    public static void main(String[] args) {

        def todos = [
            new Todo(name:"1", note:"one"),
            new Todo(name:"1", note:"one"),
            new Todo(name:"1", note:"one")
        ]

        todos.each {
            println "${it.name} ${it.note}"
        }
        
    }
}