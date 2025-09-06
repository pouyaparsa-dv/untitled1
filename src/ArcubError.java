import java.util.Scanner;

public class ArcubError {
    ArcubError() {
        System.out.print("pls enter youre error code : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.printf("");
        if (x == 1) {
            System.out.println("H1: FAIL TO LOCK DOOR. 140 SIGNAL IS MISSED");
            System.out.println("خطای کنتاکت درب");
            System.out.println("------------------------------------------");
            System.out.println("پارامتر 7.9 را بررسی کنید.");
            System.out.println("کنتاکت درب، مدار ایمنی و تراول 140 را بررسی کنید.");
            System.out.println("پارامتر 11.3 را بررسی کنید.");
            System.out.println("عملکرد رله PR2 را بررسی نمایید.");
            System.out.println("مسیر فرمان فوتوسل را بررسی نمایید");
            System.out.println("سیم و ترمینال KA1 & KA2 را بررسی نمایید");
        }
        if (x == 2) {
            System.out.println("H2: FLOOR TO FLOOR MAX TRAVEL TIME ELAPSED");
            System.out.println("حداکثر زمان حرکت بین دو طبقه سپری شده است");
            System.out.println("------------------------------------------");
            System.out.println("پارامتر 2.8 را بررسی کنید.");
            System.out.println("سیگنال های ML1 & ML2 بررسی نمایید.");
            System.out.println("تراول مربوط ML1 & ML2 بررسی نمایید.");
            System.out.println("فاصله liftsense را بررسی نمایید.");
            System.out.println("آهنربای مربوط به liftsense را بررسی نمایید.");
            System.out.println("بررسی کنید کابین حرکت می کتد.");
            System.out.println("");

        }
        if (x == 3) {
            System.out.println("H3: DOOR IS NOT CLOSED FOR A LONG TIME  ");
            System.out.println("درب برای مدت طولانی بسته نشده است");
        }
        if (x == 4) {
            System.out.println("H4: CAR CANT HOLD. PLEASE CHECK THE MOTOR PARAMETER");
            System.out.println("موتور نمی تواند کابین را نگه دارد");
        }
        if (x == 5) {
            System.out.println("H5: BOTH LIMIT SWITCHES UP&DOWN ARE OPEN  ");
            System.out.println("دور انداز اجبار بالا و پایین (817 و 818) همزمان قطع شده اند");
        }
        if (x == 6) {
            System.out.println("H6: TOP LIMIT SWITCH CUTS OFF WHIL RUNNING DOWN  ");
            System.out.println("سنسور دورانداز بالا (818) در حین حرکت کابین به سمت پایین قطع شده است");
        }
        if (x == 7) {
            System.out.println("H7: BOTTOM LIMIT SWITCH CUTS OFF WHILE RUNNING UP  ");
            System.out.println("سنسور دورانداز پایین (817) در حین حرکت کابین به بالا  قطع شده است");
        }
        if (x == 8) {
            System.out.println("H8: LOW DC BUS VOLTAGE");
            System.out.println("اDC BUSاز حد معین کاهش یافته است");
        }
        if (x == 9) {
            System.out.println("H9: HIGH DC BUS VOLTAGE");
            System.out.println("اDC BUSاز حد معین افزایش یافته است");
        }
        if (x == 10) {
            System.out.println("H10: KRC CHECK BACK ERROR  ");
            System.out.println("خطای KRC");
        }
        if (x == 11) {
            System.out.println("H11: ML1 & ML2 SIGNALS SHORT  CIRCUIT TO EACH OTHER.");
            System.out.println("خطای ML1&ML2 هنگامی که اتصال کوتاه می شوند");
        }
        if (x == 12) {
            System.out.println("H12: DOOR BRIDGING RELAYS SR1 & SR3  DONT PICK UP ");
            System.out.println("رله های SR1 & SR3 مربوط به ADO جذب نمی شوند");
        }
        if (x == 13) {
            System.out.println("H13: DOOR BRIDGING RELAYS SR1 or SR3  DONT DROP  ");
            System.out.println("رله های SR1 یا SR3 مربوط به ADO بر نمی گردند");
        }
        if (x == 14) {
            System.out.println("H14: DOOR BRIDGING DISABLED BUT 140P SIGNAL IS STILL EXIST  ");
            System.out.println("اADO غیر فعال است اما سگنال 140P همچنان وجود دارد");
        }
        if (x == 15) {
            System.out.println("H15: L1,  L2, L3 MAINS POWER SUPPLY FAILURE  ");
            System.out.println("ورودی L1-L2-L3 قطع شده است");
        }
        if (x == 16) {
            System.out.println("H16: MOTOR CAN NOT SPIN IN  EVACUATION MODE");
            System.out.println("موتور در مد نجات اظطراری قادر به چرخیدن نیست");
        }
        if (x == 17) {
            System.out.println("H17: PTC SIGNAL OPEN. MOTOR OVER  HEATED");
            System.out.println("فعال شدن سیگنال PTC موتور، موتور بیش از حد داغ شده است");
        }
        if (x == 18) {
            System.out.println("H18: DIPSWITCH CONFIGURATION  ERROR");
            System.out.println("خطای تنظیمات دیپ سوییچ");
        }
        if (x == 19) {
            System.out.println("H19: SAME GROUP ID NAME USED ON  CONTROLLERS");
            System.out.println("اسامی مشابه در شناسه گروهی استفاده شده است");
        }
        if (x == 21) {
            System.out.println("H21: DRIVE OVER CURRENT ERROR");
            System.out.println("خطای جریان بیش از حد درایو");
        }
        if (x == 22) {

        }
        if (x == 23) {

        }
        if (x == 24) {

        }
        if (x == 25) {

        }
        if (x == 26) {

        }
        if (x == 27) {

        }
        if (x == 28) {

        }
        if (x == 29) {

        }
        if (x == 30) {

        }
        if (x == 31) {

        }
        if (x == 32) {

        }
        if (x == 33) {

        }
        if (x == 34) {

        }
        if (x == 35) {

        }
        if (x == 36) {

        }
        if (x == 37) {

        }
        if (x == 38) {

        }
        if (x == 39) {

        }
        if (x == 40) {

        }
        if (x == 41) {

        }
        if (x == 42) {

        }
        if (x == 43) {

        }
        if (x == 44) {

        }
        if (x == 45) {

        }
        if (x == 46) {

        }
        if (x == 47) {

        }
        if (x == 48) {

        }
        if (x == 49) {

        }
        if (x == 50) {

        }
        if (x == 51) {

        }
        if (x == 52) {

        }
        if (x == 53) {

        }
        if (x == 54) {

        }
        if (x == 55) {

        }
        if (x == 56) {

        }
        if (x == 57) {

        }
        if (x == 58) {

        }
        if (x == 59) {

        }
        if (x == 60) {

        }
        if (x == 62) {

        }
    }
}
