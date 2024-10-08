public class Main {
    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<Integer>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.clear();
        System.out.println(stack.isEmpty());
    }
}