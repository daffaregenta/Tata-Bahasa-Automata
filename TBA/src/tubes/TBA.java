/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Galih
 */
public class TBA {

    List token = new ArrayList();
    String inputS;
    int panjang;
    String[] stack;
    int max;
    int top;

    public static void main(String[] args) {
        TBA tba = new TBA();
        String input;
        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan Inputan : ");
        input = baca.next();
        if (input.isEmpty()) {
            System.out.println("KOSONG ! ");
        }
        tba.Cara(input);
    }

    public void Stack(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public void push(String value) {
        stack[++top] = value;
    }

    public String pop() {
        return stack[top--];
    }

    public String peek() {
        return stack[top];
    }

//   public boolean isEmpty() {
//      return top == -1;
//   }
    public boolean isFull() {
        return top == max - 1;
    }

    public void Cara(String input) {
        int i = 0;
        int j = 0;
        boolean cekOperand = false;
        boolean cekOperator = false;

        while (i < input.length()) {
//           spasi
            if (input.charAt(i) == ' ') {
                i++;
            } else if ((input.charAt(i) == 'p')) {
                token.add(1);
                i++;
                cekOperand = true;
            } else if ((input.charAt(i) == 'q')) {
                token.add(1);
                i++;
                cekOperand = true;
            } else if ((input.charAt(i) == 'r')) {
                token.add(1);
                i++;
                cekOperand = true;
            } else if ((input.charAt(i) == 's')) {
                token.add(1);
                i++;
                cekOperand = true;

//                if (input == push(input)) {
//                    push(input);
//                    top++;
//                     if (true) {
//                     System.out.println("VALID ");
//                }   else System.out.println("Tidak Valid");
//            TOKEN NOT 
            } else if (input.charAt(i) == 'n') {
                j = i;
                j++;
                i++;
                try {
                    input.charAt(j);
                } catch (StringIndexOutOfBoundsException s) {
                    token.add("Error");
                    break;
                };
                j++;

//                try{
//                    input.charAt(j);
//                }catch (StringIndexOutOfBoundsException s){
//                    token.add("error");
//                    break;
//                };
                if (input.charAt(i) == '0') {
                    i++;
                    if (input.charAt(i) == 't') {
                        token.add(2);
                        i++;
                        cekOperator = true;
                    } else {
                        token.add("Error bro");
                        i = input.length();
                    }

//               and
                } else if (input.charAt(i) == 'a') {
                    j = i;
                    j++;
                    i++;

                    try {
                        input.charAt(i);
                    } catch (StringIndexOutOfBoundsException s) {
                        token.add("error");
                        break;
                    };
                    j++;
//             
//                try{
//                    input.charAt(j);
//                }catch (StringIndexOutOfBoundsException s){
//                    token.add("error");
//                    break;      
//                };
//                
                    if (input.charAt(i) == 'n') {
                        i++;
                        if (input.charAt(i) == 'd') {
                            token.add(3);
                            i++;
                            cekOperator = true;

                        } else {
                            token.add("E R R O R > > > > >  ");
                            i = input.length();
                        }
                    } else {
                        token.add("Error");
                        i = input.length();
                    }
//                token or 

                } else if (input.charAt(i) == 'o') {
                    j = i;
                    j++;
                    i++;

                    try {
                        input.charAt(j);
                    } catch (StringIndexOutOfBoundsException s) {
                        token.add("er RR or");
                        break;
                    };
                    j++;

                    if (input.charAt(i) == 'r') {
                        token.add(4);
                        i++;
                        cekOperator = true;

                    } else {
                        token.add("error");
                    }
                    i = input.length();
                }

//           token XOR
            } else if (input.charAt(i) == 'x') {
                j = i;
                j++;
                i++;

                try {
                    input.charAt(j);
                } catch (StringIndexOutOfBoundsException s) {
                    token.add("error");
                    break;
                };
//                j++;
//                try{
//                    input.charAt(j);
//                }catch (StringIndexOutOfBoundsException s){
//                    token.add("er RR or");
//                    break;
//                    };

                if (input.charAt(i) == 'o') {
                    i++;

                    if (input.charAt(i) == 'r') {
                        token.add(5);
                        i++;
                        cekOperator = true;

                    } else {
                        token.add("error");
                    }
                    i = input.length();
                } else {
                    token.add("error");
                }
                i = input.length();
            } //            token iff 
            else if (input.charAt(i) == 'i') {
                j = i;
                j++;
                i++;

                try {
                    input.charAt(j);
                } catch (StringIndexOutOfBoundsException s) {
                    token.add("error i");
                    break;
                };
                j++;

                if (input.charAt(i) == 'f') {
                    token.add(6);
                    i++;
                    try {
                        input.charAt(j);
                    } catch (StringIndexOutOfBoundsException s) {
                        token.add("error f");
                        break;
                    };
                    if (i < input.length() && input.charAt(i) == 'f') {
                        token.remove(token.size() - 1);
                        token.add(8);
                        i++;
                        cekOperator = true;
                    }

                } else {
                    token.add("erorr");
                    i = input.length();
                }

//                    token then 
            } else if (input.charAt(i) == 't') {
                j = i;
                j++;
                i++;
                try {
                    input.charAt(j);
                } catch (StringIndexOutOfBoundsException s) {
                    token.add("er RR or");
                    break;
                }
            }
            j++;

//            try{
//                input.charAt(j);
//            }catch(StringIndexOutOfBoundsException s){
//                token.add("ruZak");
//                break;
//            }
//            j++;
            try {
                input.charAt(j);
            } catch (StringIndexOutOfBoundsException s) {
                token.add("error");
                break;
            }
            j++;

            if (input.charAt(i) == 'h') {
                i++;
                if (input.charAt(i) == 'e') {
                    i++;
                }
                if (input.charAt(i) == 'n') {
                    token.add(7);
                    i++;
                    cekOperator = true;
                } else {
                    token.add("Eror");
                }
                input.length();
            }

        }
        if (cekOperator == true) {
            System.out.println("Operator VALID");
        }
        if (cekOperand == true) {
            System.out.println("Operand TRUE / Operand VALID");
        }
        if (cekOperator == true && cekOperand == true) {
            System.out.println(" Keseluruhan TRUE / STRING VALID");

        }
        System.out.println(token);
    }
}
