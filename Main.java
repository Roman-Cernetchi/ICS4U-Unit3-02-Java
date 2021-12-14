/*
 * This program pushes and prints a stack.
 *
 * @author  Roman Cernetchi
 * @version 1.0
 * @since   2021-12-13
 */

/** This program demonstrates a stack. */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates an instance of MrCoxallStack and uses its methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {
        final Stack aStack = new Stack();
        final int number1 = 4;
        final int number2 = 18;
        final int removedElement;

        System.out.println("Pushing #1...");
        aStack.push(number1);
        aStack.showStack();

        System.out.println("\nPushing #2...");
        aStack.push(number2);
        aStack.showStack();

        System.out.println("\nPopping...");
        removedElement = aStack.pop();
        System.out.println("Removed: " + removedElement);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
