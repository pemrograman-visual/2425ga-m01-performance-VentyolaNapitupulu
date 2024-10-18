// 12S24039 - Jody Alfonso Siahaan
// 12S24042 - Ventyola Rohati Napitupulu
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, nilaiangka;
        double a, aB, b, bC, c, d, e;
        double totalkredit;
        String nilaihuruf, kredit;

        totalkredit = 4.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            totalkredit = Integer.parseDouble(kredit);
        }
        nilaihuruf = input.nextLine();
        while (!nilaihuruf.equals("---")) {
            if (nilaihuruf.equals("A")) {
                nilaiangka = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilaiangka = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilaiangka = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilaiangka = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilaiangka = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        nilaiangka = 0.0;
                                    } else {
                                        nilaiangka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = totalkredit * nilaiangka;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                totalkredit = Integer.parseDouble(kredit);
            }
            nilaihuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
