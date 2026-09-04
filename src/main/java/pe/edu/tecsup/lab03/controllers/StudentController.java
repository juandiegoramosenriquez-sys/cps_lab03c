package pe.edu.tecsup.lab03.controllers;

public class StudentController {
    public double calcular(double a, double b, String operacion) {
        return switch (operacion.toLowerCase()) {
            case "suma", "+" -> a + b;
            case "resta", "-" -> a - b;
            case "multiplica", "*" -> a * b;
            case "divide", "/" -> b != 0 ? a / b : 0;
            default -> 0;
        };
    }
}
