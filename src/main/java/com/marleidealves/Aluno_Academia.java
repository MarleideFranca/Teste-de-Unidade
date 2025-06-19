package com.marleidealves;

public class Aluno_Academia{

    private String nome;
    private String sexo; // "M" para masculino, "F" para feminino
    private double peso; // em kg
    private double altura; // em metros
    private int idade;

    public Aluno_Academia(String nome, String sexo, double peso, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo.toUpperCase(); // garante M ou F maiúsculo
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    // Método para verificar se é VIP
    public boolean isVIP() {
        double imc = calcularIMC();

        if (sexo.equals("M")) { // Homem
            if (idade >= 40 && imc < 30) {
                return true;
            } else if (idade < 40 && imc < 28) {
                return true;
            }
        } else if (sexo.equals("F")) { // Mulher
            if (idade >= 40 && imc < 28) {
                return true;
            } else if (idade < 40 && imc < 26) {
                return true;
            }
        }

        return false;
    }

    // Método para exibir informações
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("IMC: " + String.format("%.2f", calcularIMC()));
        System.out.println("VIP: " + (isVIP() ? "Sim" : "Não"));
    }
}

