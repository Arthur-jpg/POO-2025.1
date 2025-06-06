# POO

### Primeiro programa em java

- Todo código vai estar dentro de uma classe
- Todo código vai ter um main → para definir por onde o projeto vai começar
- Os blocos são definidos pelas {}
- O que separa uma linha de comando da outra é o ;
- **IMPORTANTE**
    - O nome do arquivo tem que ser o mesmo nome da classe
    - Ou seja, tem somente uma classe por arquivo
    - (Se você for trabalhar com varias classes você vai precisar de vários arquivos)
- Java vai acursar mais erros de compilação que outras linguagens
- O public não é obrigatório
- E o static também não é obrigatório
- Exemplo de código
    
    ```java
    //O nome do arquivo é AloMundo.java <-- é importante o nome do arquivo e da função main
    public class AloMundo {
    	public static void main(String [] args) 
    	{
    		System.out.println("Alo mundo!");
    	}
    }
    ```
    
    - String é o tipo de dado que ele vai retornar
    - Então se você mudar o tipo de dado retornado, é necessário mudar isso no inicio da função
    - Só pode retornar um valor, nada mais
    - Void significa que não retorna nada
- Biblioteca padrão
    
    ```java
    System.out.println("Alo mundo")
    ```
    
    - Não vou importar bibliotecas, elas são classes (só como é no java)
    - System → classe
    - out → definição da classe (atributo) ou variável dentro da classe
    - println → método
    - Como se fosse objetos no js e no react
    - O método recebe uma definição

### Tipos de dados/Características de linguagem

- É uma linguagem estaticamente tipada e fortemente tipada
    - Porque python tem tipagem dinâmica?
        - Porque você não precisa dizer que tipo de dado é
            
            ```python
            a = 5
            print(type(a))
            
            a = "Ola"
            print(type(a))
            ```
            
        - Se eu quiser transformar essa variável a em lista eu posso também, ou seja, dinamicamente tipada.
    - Tipagem estática
        
        ```java
        int a = 3
        float b = 5.0
        ```
        
        - Fortemente tipada quer dizer que se eu colocar a dentro de b (a = b)
        - Se eu printar o “a” ele vai transformar a variavel 5.0 (float) em 5 (int)
        - Isso quer dizer que além de estática, java é fortemente tipada, o tipo da variável não vai mudar “nunca”
- Tipos primitivos de dados
    - String não é um tipo primitivo de dados no java
    - Char são ‘’ e string “”
- Identificadores
    - Identificadores são case-sensitive
        
        ```java
        int _a;
        double $c;
        char d1, d2, d3;
        ```
        
- Operador de atribuição
    - variavel = expressão
- Operador de constantes
    - As constantes não mudam. Caso não fosse constante ela poderia mudar desde que fosse do mesmo type
    
    ```java
    final int MAXIMO = 0.1;
    ```
    
- Convenções
    - Tudo em caixa baixa e usa camelCase → variáveis, atributos e métodos → nomeCliente
    - Tudo em caixa alta e separador _ → para definir constantes → LIMITE_SUPERIOR
    - PascalCase → vai ser para classe → class AloMundo (PascalCase)
- Operadores aritméticos
    - Mesmas coisa das outras linguagens
    - Na divisão se você quiser que o resultado seja em numero flutuante eu tenho que garantir que um dos lados da operação tenha ponto flutuante
- Entrada e saída via console
    - System out será para saída de dados
    - Tudo que eu quiser obter do teclado eu vou usar o Scanner ( não é da biblioteca padrão de java )
        - Como é uma linguagem fortemente tipada quando eu for ler alguma coisa da tela eu tenho que indicar o que está sendo lido
            
            ```java
            import java.until.Scanner;
            
            public class Leitura {
            	public static void main (String []args) {
            		int idade;
            		Scanner teclado = new Scanner(System.in); // Essa linha cria um objeto scanner e é do tipo scanner
            		/*
            			Scanner 
            			Vela do carro -> é a mesma peça entre os carros mas a minha vela é diferente da sua vela
            			Cada um dos elementos do carro tem uma função específica
            			Tem a calasse de lampada mas a lampada que você quer é um objeto específico
            			
            		*/
            		System.out.println("Qual a sua idade? ");
            		idade = teclado.nextInt();
            		
            		System.out.printf("Idade = %d\n", idade);
            		}
            	}
            ```
            

### Questões

- Questão 1
    
    ```java
    import java.util.*;
    
    public class Main {
        public static void main(String[] args) 
        {
          Scanner teclado = new Scanner(System.in);
          int a, b;
          
        
          System.out.println("Digite o primeiro numero: ");
          a = teclado.nextInt();
          System.out.println("Digite o primeiro segundo: ");
          b = teclado.nextInt();
          
          int soma = a + b;
          System.out.println(soma);
          
        }
    }
    ```
    
- Questão 2
    
    ```java
    import java.util.*;
    
    public class Main {
        public static void main(String[] args) 
        {
          Scanner teclado = new Scanner(System.in);
          float a, b;
          
        
          System.out.println("Digite o primeiro numero: ");
          a = teclado.nextFloat();
          System.out.println("Digite o primeiro segundo: ");
          b = teclado.nextFloat();
          
          float soma = a + b;
          System.out.println(soma);
          
        }
    }
    ```
    
- Questão 3
    
    ```java
    import java.util.*;
    
    public class Main {
        public static void main(String[] args) 
        {
          Scanner teclado = new Scanner(System.in);
          System.out.println("Entre o salário: ");
          float salario, resultado;
          float percentual;
          salario = teclado.nextFloat();
          System.out.println("Entre o percentual de aumento: ");
          percentual = teclado.nextFloat();
          resultado = salario * (1+percentual);
          System.out.println(resultado);
        }
    }
    ```
    
- Questão 4
    
    ```java
    import java.util.*;
    
    public class Main {
        public static void main(String[] args) 
        {
          Scanner teclado = new Scanner(System.in);
          System.out.println("Entre o raio do circulo: ");
          float raio, perimetro, pi;
          double area; // Change area to double
          raio = teclado.nextFloat();
          pi = 3.14f; // Still using float for pi
          perimetro = 2 * pi * raio;
          area = pi * Math.pow(raio, 2); // No need for casting
          System.out.println("Perimetro: ");
          System.out.println(perimetro);
          System.out.println("Area: ");
          System.out.println(area);
        }
    }
    
    ```
