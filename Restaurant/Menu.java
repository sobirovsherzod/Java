import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ovqatlarning narxi
        int oshNarxi = 25000;
        int somsaNarxi = 6000;
        int shorvaNarxi = 30000;
        int mantiNarxi = 12000;

        // Ichimliklar narxi
        int cocaColaNarxi = 15000;
        int fantaNarxi = 14000;
        int pepsiNarxi = 15000;
        int choyNarxi = 3000;

        int obshiyNarx = 0;

        // Ovqatlar menyusini ko'rsatish
        System.out.println("Restaurant Menu");
        System.out.println();
        System.out.println("Food Menu");
        System.out.println("1. Osh: 25,000 so'm");
        System.out.println("2. Somsa: 6,000 so'm");
        System.out.println("3. Shorva: 30,000 so'm");
        System.out.println("4. Manti: 12,000 so'm");
        System.out.println();

        //Foydalanuvchidan nima ovqat yeyshini so'rayman
        System.out.print("Nima ovqat tanlaysiz? (1/2/3/4, menuda bor ovqatni zakaz qiling ovqatlarni vergul belgisi bilan ajrating): ");
        String[] foodChoices = scanner.nextLine().split(",");

        // Ovqatlanishning narxi
        for (String choice : foodChoices) {
            switch (choice.trim()) {
                case "1":
                    obshiyNarx += oshNarxi;
                    break;
                case "2":
                    obshiyNarx += somsaNarxi;
                    break;
                case "3":
                    obshiyNarx += shorvaNarxi;
                    break;
                case "4":
                    obshiyNarx += mantiNarxi;
                    break;
                default:
                    System.out.println("Noto'g'ri tanlov: " + choice);
                    break;
            }
        }

        // Foydalanuvchi biror narsa ichishni xohlaydimi yoki yo'qligini so'rash
        System.out.print("Ichishga nimadir ichasizmi? (Ha/Yo'q): ");
        String response = scanner.nextLine();

        // Agar javob "Ha" bo'lsa, ichimlik menyusini ko'rsatish
        if (response.equalsIgnoreCase("Ha")) {
            System.out.println();
            System.out.println("Beverage Menu");
            System.out.println("1. Coca Cola: 15,000 so'm");
            System.out.println("2. Fanta: 14,000 so'm");
            System.out.println("3. Pepsi: 15,000 so'm");
            System.out.println("4. Choy: 3,000 so'm");

            // Foydalanuvchidan ichimliklarni tanlashni so'rash
            System.out.print("Qaysi ichimlikni istaysiz? (1/2/3/4, vergul bilan ajrating): ");
            String[] beverageChoices = scanner.nextLine().split(",");

            // Ichimliklarning umumiy narxini hisoblash
            for (String choice : beverageChoices) {
                switch (choice.trim()) {
                    case "1":
                        obshiyNarx += cocaColaNarxi;
                        break;
                    case "2":
                        obshiyNarx += fantaNarxi;
                        break;
                    case "3":
                        obshiyNarx += pepsiNarxi;
                        break;
                    case "4":
                        obshiyNarx += choyNarxi;
                        break;
                    default:
                        System.out.println("Noto'g'ri tanlov: " + choice);
                        break;
                }
            }
        } else {
            System.out.println("Rahmat! Yoqimli ishtaha!");
        }

        // o'bshiy narxni ko'rsatish
        System.out.println("Umumiy narx: " + obshiyNarx + " so'm");

        scanner.close();
    }
}
