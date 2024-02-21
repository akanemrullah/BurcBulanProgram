import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler tanimlandi.
        int month, day;
        String burc = "";
        Boolean isError = false;

        // Scanner sinifina ait nesne projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan dogdugu Ay ve Gun bilgisi alinip ilgili degiskenlere atandi.
        System.out.print("Dogdugunuz ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        // Gerekli mantiksal karsilastirmalar yapildi ve son olarak kullaniciya cikti verildi.
        if (month <= 12 && month >= 1) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day >= 22) {
                        burc = "Kova";
                    } else {
                        burc = "Oglak";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day >= 20) {
                        burc = "Balik";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day >= 21) {
                        burc = "Koc";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 4) {
                if (day >= 1 && day <= 31) {
                    if (day >= 21) {
                        burc = "Boga";
                    } else {
                        burc = "Koc";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day >= 22) {
                        burc = "Ikizler";
                    } else {
                        burc = "Boga";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 6) {
                if (day >= 1 && day <= 31) {
                    if (day >= 23) {
                        burc = "Yengec";
                    } else {
                        burc = "Ikizler";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day >= 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Yengec";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day >= 23) {
                        burc = "Basak";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 9) {
                if (day >= 1 && day <= 31) {
                    if (day >= 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Basak";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day >= 23) {
                        burc = "Akrep";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 11) {
                if (day >= 1 && day <= 31) {
                    if (day >= 22) {
                        burc = "Yay";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day >= 22) {
                        burc = "Oglak";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }

            }
            if (isError != true) {
                System.out.println("Burcunuz : " + burc + " seklindedir.");
            } else {
                System.out.println("Hatali girisiniz mevcut");
            }
        } else {
            System.out.println("Hatali girisiniz mevcut");
        }
    }
}