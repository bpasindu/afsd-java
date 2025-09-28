import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;

        System.out.print("Enter email : ");
        String email = scan.next();

        boolean isLoginSuccess = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter password : ");
            int password = scan.nextInt();

            if (dbEmail.equals(email) && dbPassword == password) {
                isLoginSuccess = true;
                break;
            }

            if (i == 4) {
                System.out.println("Account Locked !");
                break;
            }

            System.out.println("Password incorrect try again !. (Rounds Remaining : " + (4 - i) + ")");
        }

        if (isLoginSuccess) {
            System.out.print("Enter your name in sinhala: ");
            String nameInSinhala = scan.next();

            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            System.out.print("Enter your lagnaya: ");
            String lagnaya = scan.next();

            if(age<18){
                System.out.println("Age is not enough!");
                System.exit(0);
            }

            String luck;
            String palapalaya = " ";
            int asciiValueOfFirstLetter = (int)nameInSinhala.charAt(0);

            if((asciiValueOfFirstLetter%2)==1){
                luck = "වාසනාවන්තයි.";
            }else{
                luck = "අවාසනාවන්තයි.";
            }

            switch(lagnaya){
                case "mesha":
                    palapalaya = "යහපත් ඇසුර සහ යහපත් ආර්ථිකයක් හිමිවේ.";
                    lagnaya = "මේෂ";
                    break;
                case "vrushaba":
                    palapalaya = "අන් අයගේ සිත් දිනා ගනී.";
                    lagnaya = "වෘෂභ";
                    break;
                case "mithuna":
                    palapalaya = "සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම් ඇතිවේ";
                    lagnaya = "මිථුන";
                    break;
                case "kathaka":
                    palapalaya = "අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                    lagnaya = "කටක";
                    break;
                case "kanya":
                    palapalaya = "දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම යා හැකිවේ";
                    lagnaya = "කනයා";
                    break;
                case "thula":
                    palapalaya = "හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය.";
                    lagnaya = "තුලා";
                    break;
                case "wrushika":
                    palapalaya = "විවාහය අපේක්ෂකයින් ශුභයි";
                    lagnaya = "වෘශ්චික";
                    break;
                case "danu":
                    palapalaya = "රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය හිමිවේ";
                    lagnaya = "ධනු";
                    break;
                case "makara":
                    palapalaya = "අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට පත්වේ.";
                    lagnaya = "මකර";
                    break;
                case "kumba":
                    palapalaya = "පවුලේ සමගිය සහ සතුට හිමිවේ.";
                    lagnaya = "කුම්භ";
                    break;
                case "meena":
                    palapalaya = "ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට හැකිවේ.";
                    lagnaya = "මීන";
                    break;
                case "sinha":
                    palapalaya = "වස්තුව සහ සැප සම්පත් ලඟා වේ";
                    lagnaya = "සිංහ";
                    break;
                default:
                    palapalaya = "දවස දැනගැනීමට නිවැරදි ලග්නයක් ඇතුලත් කරන්න.";
            }

            System.out.println(nameInSinhala +" ඔබ අද " +luck +" ඔබට අද " +palapalaya);
        }

    }
}