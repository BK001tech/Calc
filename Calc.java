import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, sum, rim1 = 0, rim2 = 0, rus1 = 1, rus2 = 1;
        String op, v1, v2;

        v1 = reader.next();
        op = reader.next();
        v2 = reader.next();

        switch (v1){
            case "I":
                a = 1;
                rim1 = 0;
                break;
            case "1":
                a = 1;
                rim1 = 1;
                break;
            case "II":
                a = 2;
                rim1 = 0;
                break;
            case "2":
                a = 2;
                rim1 = 1;
                break;
            case "III":
                a = 3;
                rim1 = 0;
                break;
            case "3":
                a = 3;
                rim1 = 1;
                break;
            case "IV":
                a = 4;
                rim1 = 0;
                break;
            case "4":
                a = 4;
                rim1 = 1;
                break;
            case "V":
                a = 5;
                rim1 = 0;
                break;
            case "5":
                a = 5;
                rim1 = 1;
                break;
            case "VI":
                a = 6;
                rim1 = 0;
                break;
            case "6":
                a = 6;
                rim1 = 1;
                break;
            case "VII":
                a = 7;
                rim1 = 0;
                break;
            case "7":
                a = 7;
                rim1 = 1;
                break;
            case "VIII":
                a = 8;
                rim1 = 0;
                break;
            case "8":
                a = 8;
                rim1 = 1;
                break;
            case "IX":
                a = 9;
                rim1 = 0;
                break;
            case "9":
                a = 9;
                rim1 = 1;
                break;
            case "X":
                a = 10;
                rim1 = 0;
                break;
            case "10":
                a = 10;
                rim1 = 1;
                break;
            default:
                System.exit(0);
                return;
        } // Присваивания значения первого значения
        switch (v2){
            case "I":
                b = 1;
                rim2 = 0;
                break;
            case "1":
                b = 1;
                rim2 = 1;
                break;
            case "II":
                b = 2;
                rim2 = 0;
                break;
            case "2":
                b = 2;
                rim2 = 1;
                break;
            case "III":
                b = 3;
                rim2 = 0;
                break;
            case "3":
                b = 3;
                rim2 = 1;
                break;
            case "IV":
                b = 4;
                rim2 = 0;
                break;
            case "4":
                b = 4;
                rim2 = 1;
                break;
            case "V":
                b = 5;
                rim2 = 0;
                break;
            case "5":
                b = 5;
                rim2 = 1;
                break;
            case "VI":
                b = 6;
                rim2 = 0;
                break;
            case "6":
                b = 6;
                rim2 = 1;
                break;
            case "VII":
                b = 7;
                rim2 = 0;
                break;
            case "7":
                b = 7;
                rim2 = 1;
                break;
            case "VIII":
                b = 8;
                rim2 = 0;
                break;
            case "8":
                b = 8;
                rim2 = 1;
                break;
            case "IX":
                b = 9;
                rim2 = 0;
                break;
            case "9":
                b = 9;
                rim2 = 1;
                break;
            case "X":
                b = 10;
                rim2 = 0;
                break;
            case "10":
                b = 10;
                rim2 = 1;
                break;
            default:
                System.exit(0);
                return;
        } // Присваивание значения второго числа
        switch (op){
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                sum = a / b;
                break;
            default:
                System.exit(0);
                return;
        } // Выбор операции

        if(a <= 10 && a > 0 && b <= 10 && b > 0){
            if (rim1 == 0 && rim2 == 0){
                switch (sum){
                    case 1:
                        System.out.print("I");
                        break;
                    case 2:
                        System.out.print("II");
                        break;
                    case 3:
                        System.out.print("III");
                        break;
                    case 4:
                        System.out.print("VI");
                        break;
                    case 5:
                        System.out.print("V");
                        break;
                    case 6:
                        System.out.print("VI");
                        break;
                    case 7:
                        System.out.print("VII");
                        break;
                    case 8:
                        System.out.print("VIII");
                        break;
                    case 9:
                        System.out.print("XI");
                        break;
                    case 10:
                        System.out.print("X");
                        break;
                    case 11:
                        System.out.print("XI");
                        break;
                    case 12:
                        System.out.print("XII");
                        break;
                    case 13:
                        System.out.print("XIII");
                        break;
                    case 14:
                        System.out.print("XIV");
                        break;
                    case 15:
                        System.out.print("XV");
                        break;
                    case 16:
                        System.out.print("XVI");
                        break;
                    case 17:
                        System.out.print("XVII");
                        break;
                    case 18:
                        System.out.print("XVIII");
                        break;
                    case 19:
                        System.out.print("XIX");
                        break;
                    case 20:
                        System.out.print("XX");
                        break;
                    case 21:
                        System.out.print("XXI");
                        break;
                    case 22:
                        System.out.print("XXII");
                        break;
                    case 23:
                        System.out.print("XXIII");
                        break;
                    case 24:
                        System.out.print("XXIV");
                        break;
                    case 25:
                        System.out.print("XXV");
                        break;
                    case 26:
                        System.out.print("XXVI");
                        break;
                    case 27:
                        System.out.print("XXVII");
                        break;
                    case 28:
                        System.out.print("XXVIII");
                        break;
                    case 29:
                        System.out.print("XXIX");
                        break;
                    case 30:
                        System.out.print("XXX");
                        break;
                    case 31:
                        System.out.print("XXXI");
                        break;
                    case 32:
                        System.out.print("XXXII");
                        break;
                    case 33:
                        System.out.print("XXXIII");
                        break;
                    case 34:
                        System.out.print("XXXIV");
                        break;
                    case 35:
                        System.out.print("XXXV");
                        break;
                    case 36:
                        System.out.print("XXXVI");
                        break;
                    case 37:
                        System.out.print("XXXVII");
                        break;
                    case 38:
                        System.out.print("XXXVIII");
                        break;
                    case 39:
                        System.out.print("XXXIX");
                        break;
                    case 40:
                        System.out.print("XL");
                        break;
                    case 41:
                        System.out.print("XLI");
                        break;
                    case 42:
                        System.out.print("XLII");
                        break;
                    case 43:
                        System.out.print("XLIII");
                        break;
                    case 44:
                        System.out.print("XLIV");
                        break;
                    case 45:
                        System.out.print("XLV");
                        break;
                    case 46:
                        System.out.print("XLVI");
                        break;
                    case 47:
                        System.out.print("XLVII");
                        break;
                    case 48:
                        System.out.print("XLVIII");
                        break;
                    case 49:
                        System.out.print("XLIX");
                        break;
                    case 50:
                        System.out.print("L");
                        break;
                    case 51:
                        System.out.print("LI");
                        break;
                    case 52:
                        System.out.print("LII");
                        break;
                    case 53:
                        System.out.print("LIII");
                        break;
                    case 54:
                        System.out.print("LIV");
                        break;
                    case 55:
                        System.out.print("LV");
                        break;
                    case 56:
                        System.out.print("LVI");
                        break;
                    case 57:
                        System.out.print("LVII");
                        break;
                    case 58:
                        System.out.print("LVIII");
                        break;
                    case 59:
                        System.out.print("LIX");
                        break;
                    case 60:
                        System.out.print("LX");
                        break;
                    case 61:
                        System.out.print("LXI");
                        break;
                    case 62:
                        System.out.print("LXII");
                        break;
                    case 63:
                        System.out.print("LXIII");
                        break;
                    case 64:
                        System.out.print("LXIV");
                        break;
                    case 65:
                        System.out.print("LXV");
                        break;
                    case 66:
                        System.out.print("LXVI");
                        break;
                    case 67:
                        System.out.print("LXVII");
                        break;
                    case 68:
                        System.out.print("LXVIII");
                        break;
                    case 69:
                        System.out.print("LXIX");
                        break;
                    case 70:
                        System.out.print("LXX");
                        break;
                    case 71:
                        System.out.print("LXXI");
                        break;
                    case 72:
                        System.out.print("LXXII");
                        break;
                    case 73:
                        System.out.print("LXXIII");
                        break;
                    case 74:
                        System.out.print("LXXIV");
                        break;
                    case 75:
                        System.out.print("LXXV");
                        break;
                    case 76:
                        System.out.print("LXXVI");
                        break;
                    case 77:
                        System.out.print("LXXVII");
                        break;
                    case 78:
                        System.out.print("LXXVIII");
                        break;
                    case 79:
                        System.out.print("LXXIX");
                        break;
                    case 80:
                        System.out.print("LXXX");
                        break;
                    case 81:
                        System.out.print("LXXXI");
                        break;
                    case 82:
                        System.out.print("LXXXII");
                        break;
                    case 83:
                        System.out.print("LXXXIII");
                        break;
                    case 84:
                        System.out.print("LXXXIV");
                        break;
                    case 85:
                        System.out.print("LXXXV");
                        break;
                    case 86:
                        System.out.print("LXXXVI");
                        break;
                    case 87:
                        System.out.print("LXXXVII");
                        break;
                    case 88:
                        System.out.print("LXXXVIII");
                        break;
                    case 89:
                        System.out.print("LXXXIX");
                        break;
                    case 90:
                        System.out.print("XC");
                        break;
                    case 91:
                        System.out.print("XCI");
                        break;
                    case 92:
                        System.out.print("XCII");
                        break;
                    case 93:
                        System.out.print("XCIII");
                        break;
                    case 94:
                        System.out.print("XCIV");
                        break;
                    case 95:
                        System.out.print("XCV");
                        break;
                    case 96:
                        System.out.print("XCVI");
                        break;
                    case 97:
                        System.out.print("XCVII");
                        break;
                    case 98:
                        System.out.print("XCVIII");
                        break;
                    case 99:
                        System.out.print("XCIX");
                        break;
                    case 100:
                        System.out.print("C");
                    default:
                        System.out.print("Такого числа ещё нет");
                } // Вывод римского числа
            }else{
                if (rim1 == 1 && rim2 == 1){
                    System.out.print(sum);
                }else{
                    System.exit(0);
                }
            }
        }else{
            System.exit(0);
        } // Праверка числа и вывод суммы
    }
}