//Felipe Padovani Seugling - RA: 2453487

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wrappers{
        public static void main(String args[]){    

        //declaracao de variaves:
        String choice = "";
        String frase = "101Guia do Mochileiro das Galaxias101";
        int num1 = 42;
        float num2 = 1000000;
        String shor1 = "42";
        long num3 = 0;
        boolean a = true;
        boolean b = false;
        double dou1 = 73;
        double dou2 = 21;
        String b1 = "42";

        //menu:
        System.out.println("\tUSO DE CLASSE WRAPPERS - MENU DE OPCOES\n\n1) INTEGER\n2) BOOLEAN\n3) CHARACTER\n4) DOUBLE\n5) BYTE\n6) SHORT\n7) FLOAT\n8) LONG\n0) SAIR\n\nESCOLHA UMA OPCAO:");
        
        //entrada de dados:
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        try{
            choice = cd.readLine();
        }
        catch(IOException e){
            System.out.println("Erro de entrada");
        }

        //selecao:
        switch(Integer.parseInt(choice)){

            case 1:
                convertInt_Bin(num1);
                break;

            case 2:
                BooleanLogical(a , b);
                break;

            case 3:
                CharacterComparePhrase(frase);
                break;

            case 4:
                DoubleCompare(dou1 , dou2);
                break;

            case 5:
                ValueOfByte(b1);
                break;

            case 6:
                ShortStr_Short(shor1);
                break;

            case 7:
                FloatIsInfinite(num2);
                break;

            case 8:
                    LongSignals(num3 , choice);
                break;

            case 0:
                Sair();
                break;

        } 
    }

        //inicio dos metodos:
    
        // i) Classe Integer: metodos toBinaryString() e parseInt
        // ii) O metodo convertBin_Int convertera um numero inteiro para um valor binario e vice-versa (binario para inteiro)
        // iii) <<https://www.geeksforgeeks.org/java-lang-integer-tobinarystring-method/>> e <<https://www.techiedelight.com/pt/convert-int-to-hex-string-java/#:~:text=toHexString()%20método,sem%20sinal”%20na%20base%2016.>>
        public static void convertInt_Bin(int a){
            System.out.println("O valor dos numero "+a+" corresponde a:\n");
            System.out.println("Valor em binario: "+Integer.toBinaryString(a));
            System.out.println("Valor em hexadecimal: "+Integer.toHexString(a));
            }

        // i) Classe Boolean: metodos logicalXor() e logicalAnd()
        // ii) O metodo logicalXor() compara dois booleanos e retorna true no caso de exatamente um deles ser verdadeiro. E o metodo logicalAnd() retorna true, exclusivamente se ambos os valores forem true
        // iii) <<https://www.javatpoint.com/java-boolean>> e <<https://www.educative.io/answers/what-is-booleanlogicalxor-in-java>> e <<https://javatutorialhq.com/java/lang/boolean-class-tutorial/logicaland-method-example/>>
        public static void BooleanLogical(boolean x, boolean y){

            System.out.println("\n\ta: "+x+" e b: "+y+", logo logicalXor(): " +Boolean.logicalXor(x, y));
            System.out.println("\tb: "+y+" e a: "+x+", logo logicalXor(): "+Boolean.logicalXor(y, x));
            System.out.println("\tb: "+y+" e b: "+y+", logo logicalXor(): "+Boolean.logicalXor(y, y));
            System.out.println("\ta: "+x+" e a: "+x+", logo logicalXor(): "+Boolean.logicalXor(x, x));

            System.out.println("\n\ta: "+x+" e b: "+y+", logo logicalAnd():  "+Boolean.logicalAnd(x, y));
            System.out.println("\tb: "+y+" e a: "+x+", logo logicalAnd(): "+Boolean.logicalAnd(y, x));
            System.out.println("\tb: "+y+" e b: "+y+", logo logicalAnd(): "+Boolean.logicalAnd(y, y));
            System.out.println("\ta: "+x+" e a: "+x+", logo logicalAnd(): "+Boolean.logicalAnd(x, x));

        }

            //i) Classe Character: metodos isDigit(), isUpperCase(), isLowerCase(), isSpaceChar()
            //ii) O metodo CharacterComparePhrase recebe uma String do metodo principal e junto de comandos da classe String averigua se os caracteres sao numeros, caracteres maiusculos ou minusculos, e/ou espacos em branco
            //iii) <<https://www.devmedia.com.br/metodos-da-classe-character-string-em-java-parte-3/21811>>
            public static void CharacterComparePhrase(String frase){
                char aux;
                int length;
                length = frase.length();

                for(int i=0;i<length;i++){
                    aux = frase.charAt(i);
                    if(Character.isDigit(aux)){
                        System.out.println("\nO caractere "+aux+" corresponde a um numero");
                    }else{
                        if(Character.isUpperCase(aux)){
                            System.out.println("\nO caractere "+aux+" corresponde a uma letra maiuscula");
                        }else{
                            if(Character.isLowerCase(aux)){
                                System.out.println("\nO caractere "+aux+" corresponde a uma letra minuscula");
                            }else{
                                if(Character.isSpaceChar(aux)){
                                    System.out.println("\nO caractere "+aux+" é um espaco em branco");
                                }
                            }
                        }
                    }
                }
            }

            // i) Classe Double: metodo compare()
            // ii) O metodo DoubleCompare possui dois valores do tipo double e o metodo compare() analisa se estes dois valores sao iguais ou nao
            // iii) <<https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html>> e <<https://www.geeksforgeeks.org/double-compare-method-in-java-with-examples/>>
            public static void DoubleCompare(double x , double y){

                if(Double.compare(x, y) == 0){
                    System.out.println("\nOs valores "+x+" e "+y+" sao iguais");
                }else{
                    System.out.println("\nOs valores "+x+" e "+y+" sao diferentes um do outro");
                }
            }
            
            // i) Classe Byte: metodo valueOf()
            // ii) O metodo ValueOfByte recebe uma string do metodo main e retorna um objeto de byte que contem o valor da string 
            /// iii) <<https://www.javatpoint.com/java-byte-valueof-method>> e <<https://acervolima.com/classe-java-lang-byte-em-java/>>
            public static void ValueOfByte(String x){

                System.out.println("O valor do objeto byte retornado corresponde a "+Byte.valueOf(x));
            }

            // i) Classe Short: metodo parseShort()
            // ii) O metodo ShortStr_Short encapsula uma string em um valor do tipo short. Se a tentativa fosse atribuir a variavel 'c' o valor da variavel 'a' nao funcionaria. Por isso da aplicabilidade do metodo
            // iii) <<https://www.javatpoint.com/java-short-parseshort-method>> e <<https://learn.microsoft.com/en-us/dotnet/api/java.lang.short.parseshort?view=xamarin-android-sdk-13#java-lang-short-parseshort(system-string)>>
            public static void ShortStr_Short(String x){
                short b = Short.parseShort(x);
                short c = b;
                
                System.out.println("\nValor do short: "+c);
            }

            // i) Classe Float: metodos isInfinite() e floatToRawIntBits()
            // ii) O metodo recebe um float do metodo principal e tambem cria um float, este ultimo com o valor de menos infinito. O programa analisa se o valor e infinito, e caso seja analisa se o valor em bits do mesmo e positivo ou negativo
            // iii) <<https://acervolima.com/classe-java-lang-float-em-java/>> e <<https://www.delftstack.com/pt/howto/java/java-infinity/>> e <<https://www.lia.ufc.br/~valdisio/download/ieee.pdf>>
            public static void FloatIsInfinite(float x){
                boolean a;
                float b = Float.NEGATIVE_INFINITY;
                
                a = Float.isInfinite(b);
                float c = Float.floatToRawIntBits(b);

                if(a == true){
                    if(c > 0){
                        System.out.println("\nO valor e infinito positivo");
                    }else{
                        System.out.println("\nO valor e infinito negativo");
                    }
                }else{
                    System.out.println("\nO valor nao e infinito");
                }

                System.out.println("\nO numero "+x+" nao e infinito");
            }

            // i) Classe Long: metodos parseLong() e signum() 
            // ii) O metodo recebe a string de escolha para o switch case, e encapsula esta com o metodo parseLong(). Depois signum analisa o sinal deste, e como o valor e oito, retorna 1. (para negativos = -1; positivos = +1; zero = 0)
            // iii) <<https://www.tutorialspoint.com/java/lang/long_parselong.htm>> e <<https://www.geeksforgeeks.org/long-signum-method-in-java/>> e <<https://www.geeksforgeeks.org/java-lang-long-class-in-java/>>
            public static void LongSignals(long a, String b){
                System.out.println("\nCom o numero "+a+" signum() retona: "+Long.signum(a));
                a = Long.parseLong(b);
                System.out.println("\nCom o numero "+b+" (positivo), signum() retorna: "+Long.signum(a));
            }

            public static void Sair(){
                System.out.println("\nObrigado por usar nosso programa");
            }
}




