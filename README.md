# Handling Exceptions in Scala's map Function
This example demonstrates a common issue encountered when using the `map` function in Scala without proper exception handling. The provided code snippet attempts to double each element in a list by dividing 10 by the difference between each element and 3. However, when an element is equal to 3, a division by zero occurs, resulting in an `ArithmeticException`.

The solution involves using a `try-catch` block within the `map` function to handle the potential exception gracefully.